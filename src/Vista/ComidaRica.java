/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.GestorProductos;
import Modelo.Bebida;
import Modelo.Comida;
import Modelo.Productos;
import Servidor.Server;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author yumii
 */
public class ComidaRica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GestorProductos gestor=new GestorProductos();
        Productos producto;
        producto = new Comida();
        producto.setNombre("hola");
        producto.setCantVecesPedida(10);
        //System.out.println(producto.toString());
        
        Productos pruebaCompare=new Bebida();
        Productos pruebaCompare2=new Comida("hola",2,3,23,"xhao");
        pruebaCompare2.setCantVecesPedida(3);
        
        gestor.agregarProducto(producto);
        gestor.agregarProducto(pruebaCompare);
        gestor.agregarProducto(pruebaCompare2);
        //System.out.println(gestor.obtenerLista().toString());
        
        GestorProductos gestor2=new GestorProductos();
        producto = new Comida();
        producto.setNombre("hola2");
        producto.setCantVecesPedida(22);
        gestor2.agregarProducto(producto);
//        
        ArrayList<Productos> prueba= new ArrayList<>();
        prueba.addAll(gestor2.obtenerLista());
        prueba.addAll(gestor.obtenerLista());
//       // System.out.println(prueba);
//        
//        gestor2.agregarListaProductos(gestor.obtenerLista());
        //System.out.println(gestor2.obtenerLista());
        //System.out.println(producto.getClass());
        /*
        if(gestor.buscar(0).getClass().equals(gestor.buscar(2).getClass())){
            System.out.println("Hola");
        }
        else{
            System.out.println("chao");
        }
        */
        
        //new Server();
        
        //GestorProductos gestor=new GestorProductos();
        //Productos producto1=new Comida("Patito", 10, 20, 30, "Patito feo");
        //gestor.agregar(producto1);
        //Comida-Bebida
        //Ubicacion del archivo a guardar
        //Arraylist productos
        //gestor2.guardarArchivo(gestor2.obtenerLista());
        //GestorProductos gestor2=new GestorProductos();
        //gestor2.leerArchivo();
        //System.out.println(gestor2.obtenerLista());
           //System.out.println(prueba);
           
           ArrayList<Productos> productos=new ArrayList<Productos>();
           System.out.println(gestor.obtenerLista());
           Collections.sort(prueba);
           System.out.println(gestor.obtenerListaOrdenada());
        
        
    }

    public ComidaRica() {
    }
    
}
