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

    public GestorProductos() {
        this.listaProductos = new ArrayList<Productos>();
    }
    
    public void agregarProducto(Productos producto){
        listaProductos.add(producto);
    }
    
    public void agregarListaProductos(ArrayList<Productos> lista){
        this.listaProductos.addAll(lista);
    }
    
    public void eliminar(int cual){
        listaProductos.remove(cual);
    }
    
    public ArrayList<Productos> obtenerLista(){
        return listaProductos;
    }
    
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
    
    public Productos buscar(int cual){
        return listaProductos.get(cual);
    }
    
    public void modificarProducto(int cual, String nombre, double costo, int cantidad, double caloria, String imagen){
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
    
    public ArrayList<Productos> obtenerListaOrdenada(){
        ArrayList<Productos> listaOrdenada=this.listaProductos;
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }
     
    public void leerArchivo(){
        File archivo=new File("C:Archivos//ProductosBD.dat");
        ArrayList<Productos> lista=new ArrayList<Productos>();
        try {
            FileInputStream fis=new FileInputStream(archivo);
            ObjectInputStream ois=new ObjectInputStream(fis);
            lista= (ArrayList<Productos>) ois.readObject();
        } catch (Exception e) {
            System.out.println("Error a la hora de abrir el archivo");
            e.printStackTrace();
        }
        this.listaProductos=lista;
    }
    
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
        
        
      
