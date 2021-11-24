/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Bebida;
import Modelo.Comida;
import Modelo.Productos;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author yumii
 */
public class GestorProductos {
    private ArrayList<Productos> listaProductos;

    /**
     * Método constructor que crea la lista de productos
     */
    public GestorProductos() {
        this.listaProductos = new ArrayList<Productos>();
    }
    
    /**
     * Funcionamiento: Recibe un producto y lo agrega a la lista de productos
     * @param producto 
     * Salidas: N/A
     */
    public void agregarProducto(Productos producto){
        listaProductos.add(producto);
    }
    
    /**
     * Funcionamiento: Responsable de agregar una lista de productos a nuestra lista original. 
     * @param lista 
     * Salidas: N/A
     */
    public void agregarListaProductos(ArrayList<Productos> lista){
        this.listaProductos.addAll(lista);
    }
    
    /**
     * Funcionamiento: Responsable de eliminar un producto, para ello recibe el index del producto a eliminar
     * y lo remueve de la lista.
     * @param cual 
     * Salidas: N/A
     */
    public void eliminar(int cual){
        listaProductos.remove(cual);
    }
    
    /**
     * Funcionamiento: Retorna la lista de productos
     * Entradas: N/A
     * Salidas: listaProductos (ArrayList<Productos>)
     * @return 
     */
    public ArrayList<Productos> obtenerLista(){
        return listaProductos;
    }
    
    /**
     * Funcionamiento: Recibe por parámetro el tipo de producto que desea generar la lista, ya sea
     * por comida o por bebidas y retorna esa nueva lista obtenida. Para obtener la lista recorre la original
     * verificando si es de tipo comida o bebida y si corresponde a uno de esos dos lo que hará es guardarlo en la nueva
     * lista.
     * Entradas:
     * @param tipo
     * Salidas: producto (ArrayList<Productos>)
     * @return 
     */
    public ArrayList<Productos> obtenerListaTipoProducto(String tipo){
        Productos comida =new Comida();
        Productos bebida= new Bebida();
        ArrayList<Productos> producto=new ArrayList<Productos>();
        
        for(int contador=0;contador<listaProductos.size();contador++){
            if(tipo.equals("Comida")&&listaProductos.get(contador).getClass().equals(comida.getClass())){
                producto.add(listaProductos.get(contador));
            }
            else{
                producto.add(listaProductos.get(contador));
            }
        }
        return producto;
    }
    
    /**
     * Funcionamiento: Busca un producto según el index recibido (cual)
     * Entradas:
     * @param cual
     * Salidas: Producto que se encuentra en esa index.
     * @return 
     */
    public Productos buscar(int cual){
        return listaProductos.get(cual);
    }
    
    /**
     * Funcionamiento: Responsable de modificar los datos o la imagen de un producto, para ello se recibe como dato de entrada
     * todos los detalles y el index en donde se encuentra dicho producto.
     * Entradas:
     * @param cual
     * @param nombre
     * @param costo
     * @param cantidad
     * @param caloria
     * @param imagen
     * Salidas: N/A
     */
    public void modificarProducto(int cual, String nombre, double costo, double cantidad, double caloria, String imagen){
        Productos comida =new Comida();
        Productos bebida= new Bebida();
        
        listaProductos.get(cual).setNombre(nombre);
        listaProductos.get(cual).setCosto(costo);
        listaProductos.get(cual).setCaloria(caloria);
        listaProductos.get(cual).setImagen(imagen);
        if(listaProductos.get(cual).getClass().equals(comida.getClass())){
            listaProductos.get(cual).racion(cantidad);
        }
        else{
            listaProductos.get(cual).cantidadLiquido(cantidad);
        }
    }
    

    /**
     * Funcionamiento: Obtiene los datos de un producto en específico, para ello se verifica si el producto es de tipo comida
     * se creará un producto ya sea de tipo comida o bebida con sus respectivos datos para retornarlo.
     * @param tipo
     * @param dato
     * Salidas: producto
     * @return 
     */
    public Productos obtenerDatos(String tipo, String dato){
        String[]listaDatos=dato.split(" ,");
        Productos producto=null;
        
        if(tipo.equals("Comida")){
            producto=new Comida(listaDatos[1],Double.parseDouble(listaDatos[3]),Double.parseDouble(listaDatos[5]), Integer.parseInt(listaDatos[7]),listaDatos[9]);
        }
        else{
            producto=new Bebida(listaDatos[1],Double.parseDouble(listaDatos[3]),Double.parseDouble(listaDatos[5]), Integer.parseInt(listaDatos[7]),listaDatos[9]);
        }
        return producto;
    }
    
    /**
     * Funcionamiento: Ordena la lista de mayor a menor según la cantidad de veces que fue pedido x producto.
     * Entradas: N/A
     * sALIDAS listaOrdenada(ArrayList<Productos>)
     * @return 
     */
    public ArrayList<Productos> obtenerListaOrdenada(){
        ArrayList<Productos> listaOrdenada=this.listaProductos;
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }
     
    /**
     * Funcionammiento: Lee el archivo binario y carga los datos a la listaProductos.
     * Entradas: N/A
     * Salidas: N/A
     */
    public void leerArchivo(){
        File archivo=new File("C:Archivos//ProductosBD.dat");
        ArrayList<Productos> lista=new ArrayList<Productos>();
        try {
            FileInputStream fis=new FileInputStream(archivo);
            ObjectInputStream ois=new ObjectInputStream(fis);
            lista= (ArrayList<Productos>) ois.readObject();
            
            fis.close();
            ois.close();
        } catch (Exception e) {
            System.out.println("Error a la hora de abrir el archivo");
            e.printStackTrace();
        }
        this.listaProductos=lista;
    }
    
    /**
     * Funcionamiento:Guarda en un archivo binario la lista de productos
     * @param lista 
     * Salidas: N/A
     */
    public void guardarArchivo(ArrayList<Productos> lista){                                                                     
        File archivo= new File("C:Archivos//ProductosBD.dat");
        Productos comida= new Comida();
        Productos bebida=new Bebida();
        try {
            FileOutputStream fos= new FileOutputStream(archivo);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(lista);
            
            oos.close();
            fos.close();
            
        } catch (Exception e) {
            System.out.println("Error a la hora de guardar el archivo.");
            e.printStackTrace();
        }
    }

}
        
        
      
