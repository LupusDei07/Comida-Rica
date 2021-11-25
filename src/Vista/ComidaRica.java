/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.CarritoPedido;
import Control.GestorPedidos;
import Control.GestorProductos;
import Modelo.Bebida;
import Modelo.Comida;
import Modelo.Pedido;
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
//        
//        GestorProductos gestor=new GestorProductos();
//        Productos producto;
//        producto = new Comida();
//        producto.setNombre("hola");
//        producto.setCantVecesPedida(10);
//        //System.out.println(producto.toString());
//        
//        //Productos pruebaCompare=new Bebida();
//        Productos pruebaCompare2=new Comida("hola",2,3,23,"xhao");
//        pruebaCompare2.setCantVecesPedida(3);
//        
//        gestor.agregarProducto(producto);
//        //gestor.agregarProducto(pruebaCompare);
//        gestor.agregarProducto(pruebaCompare2);
//        //System.out.println(gestor.obtenerLista().toString());
//        
//        GestorProductos gestor2=new GestorProductos();
//        producto = new Comida();
//        producto.setNombre("hola2");
//        producto.setCantVecesPedida(22);
//        gestor2.agregarProducto(producto);
////        
//        ArrayList<Productos> prueba= new ArrayList<>();
//        prueba.addAll(gestor2.obtenerLista());
//        prueba.addAll(gestor.obtenerLista());
//       // System.out.println(prueba);
//        
//        gestor2.agregarListaProductos(gestor.obtenerLista());
//        System.out.println(gestor2.obtenerLista());
//        System.out.println(producto.getClass());
//        /*
//        if(gestor.buscar(0).getClass().equals(gestor.buscar(2).getClass())){
//            System.out.println("Hola");
//        }
//        else{
//            System.out.println("chao");
//        }
//        */
//        
////        new Server();
//        
//        //GestorProductos gestor=new GestorProductos();
//        Productos producto1=new Comida("Patito", 10, 20, 30, "Patito feo");
//        gestor.agregarProducto(producto1);
////        Comida-Bebida
////        Ubicacion del archivo a guardar
////        Arraylist productos
//        gestor2.guardarArchivo(gestor2.obtenerLista());
//        //GestorProductos gestor2=new GestorProductos();
//        gestor2.leerArchivo();
//        System.out.println(gestor2.obtenerLista());
//           System.out.println(prueba);
//           
////           ArrayList<Productos> productos=new ArrayList<Productos>();
//           System.out.println(gestor.obtenerLista());
//           Collections.sort(prueba);
//           System.out.println(gestor.obtenerListaOrdenada());
        
//        GestorPedidos gestor2=new GestorPedidos();   
//           
//        CarritoPedido gestor = new CarritoPedido();
//        Pedido pedido=new Pedido(12, 120, "Pepsi");
//        gestor.agregar(pedido);
//        gestor.modificar(2, "Pepsi");
//        gestor.setTipoPedido(Modelo.TipoPedido.EXPRESS);
//        
//        
//        gestor2.agregarCarrito(gestor);
//        gestor2.actualizarEstadistica(gestor);
//        CarritoPedido gestor3 = new CarritoPedido();
//        pedido=new Pedido(12, 120, "Pepsi");
//        gestor3.agregar(pedido);
//        pedido=new Pedido(12, 120, "COCA");
//        gestor3.agregar(pedido);
//        gestor3.setTipoPedido(Modelo.TipoPedido.COMER_AHI);
//        
//        gestor2.agregarCarrito(gestor3);
//        gestor2.actualizarEstadistica(gestor3);
//        
//        ArrayList<CarritoPedido> lista= gestor2.getListaPedidos();
//        System.out.println(lista.size());
//        System.out.println(lista.get(0));
//        System.out.println(lista.get(1));
//        
//        int[] contador=gestor2.getEstadisticaTipoPedido();
//        System.out.println(contador[0]+" "+contador[1]+" "+contador[2]);
        //System.out.println(gestor2.getListaPedidos());
        
        GestorProductos gestor= new GestorProductos();
        gestor.leerArchivo();
        System.out.println(gestor.obtenerLista());
        //System.out.println(gestor.obtenerListaTipoProducto("Comida"));
        System.out.println(gestor.obtenerListaTipoProducto("Bebida"));

//          String prueba="1";
//          System.out.println(Double.parseDouble(prueba));

    }

    public ComidaRica() {
    }
    
}
