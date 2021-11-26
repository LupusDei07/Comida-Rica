/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Administrador;
import Modelo.Bebida;
import Modelo.Comida;
import Modelo.Peticion;
import Modelo.Productos;
import java.util.ArrayList;

/**
 *Controlador del servidor
 * @author yumii
 */
public class ControladorServidor {
    
    private Administrador admUsr = new Administrador();
    private GestorProductos listaProductos = new GestorProductos();
    private GestorPedidos listaPedidos = new GestorPedidos();
    private double costoExpress=100;

    /**
     *
     */
    public ControladorServidor() {
       listaProductos.leerArchivo();    
    }
    //Peticiones del usuario al servidor INGRESAR, VER_PRODUCTOS, MODIFICAR_PRODUCTO,AGREGAR_CARRITO,AGREGAR_PRODUCTO,CERRAR_SESION,TOP_10,MENOS_PEDIDOS,TIPOS_PEDIDOS,REALIZAR_PEDIDO,VER_PEDIDOS
    //VER_BEBIDA,VER_COMIDAS

    /**
     *Procesa la peticion del cliente
     * @param peticionRecibida
     * @return
     */
    public Peticion procesarPeticion(Peticion peticionRecibida) {
        switch (peticionRecibida.getAccion()){
            case INGRESAR: //Ingresa el admin                             
                
                 String credenciales = (String) peticionRecibida.getDatosEntrada();
                 if(credenciales.equals("-")){
                 peticionRecibida.setDatosSalida(null);
                 }else{
                 String [] partes  = credenciales.split("-"); 
                 boolean admOK = admUsr.validarAdm(partes[0], partes[1]);
                 peticionRecibida.setDatosSalida(admOK);
                 }
                break;
            case VER_PRODUCTOS://ver los productos 
                listaProductos.leerArchivo();
                peticionRecibida.setDatosSalida(listaProductos.obtenerLista());
                break; 
            case MODIFICAR_PRODUCTO://modificar un producto
                listaProductos.leerArchivo();
                int index= (int) peticionRecibida.getDatosEntrada();
                peticionRecibida.setDatosSalida(listaProductos.buscar(index));
                break;
            case AGREGAR_CARRITO:
                listaPedidos.leerArchivo();
                this.listaPedidos.agregarCarrito((CarritoPedido)peticionRecibida.getDatosEntrada());
                listaPedidos.guardarArchivo(listaPedidos.getListaPedidos());
                break;         
            case AGREGAR_PRODUCTO_BEBIDA://Agregar producto
                //Bebida
                listaProductos.leerArchivo();
                String partesBebida = (String) peticionRecibida.getDatosEntrada();
                Bebida newBebida = new Bebida();
                listaProductos.agregarProducto(newBebida);                      
                break;
            case AGREGAR_PRODUCTO_COMIDA://agregar comida
                //comida
                listaProductos.leerArchivo();
                String partesComida = (String) peticionRecibida.getDatosEntrada();
                Comida newComida = new Comida();
                listaProductos.agregarProducto(newComida);                  
                break; 
            case ELIMINAR_PRODUCTO://eliminar producto
                listaProductos.leerArchivo();
                index= (int) peticionRecibida.getDatosEntrada();
                listaProductos.eliminar(index);
                
            case CERRAR_SESION:
                if(peticionRecibida.getDatosEntrada().equals(true))
                peticionRecibida.setDatosSalida(false);               
                break;        
            case TOP_10:
         break;            
            case MENOS_PEDIDOS:        
                    break;
            case TIPOS_PEDIDOS:
                peticionRecibida.setDatosSalida(listaPedidos.getEstadisticaTipoPedido());
                break;
            case REALIZAR_PEDIDO:
                break;
            case VER_PEDIDOS://ver los pedidos abiertos
                peticionRecibida.setDatosSalida(listaPedidos.getListaPedidos());
                break;
            case VER_COMIDAS://ver el menu de comidas
                listaProductos.leerArchivo();
                peticionRecibida.setDatosSalida(listaProductos.obtenerListaTipoProducto("Comida"));
                break;
            case VER_BEBIDA://ver el menu de bebidas
                listaProductos.leerArchivo();
                peticionRecibida.setDatosSalida(listaProductos.obtenerListaTipoProducto("bebidas"));
                break;
              
            case OBTENER_COSTO_EXPRESS://obtiene el costo express
                peticionRecibida.setDatosSalida(costoExpress);
                break;
                
            case ACTUALIZAR_COSTO_EXPRESS://Actualiza costo express
                double costo= (double) peticionRecibida.getDatosEntrada();
                this.costoExpress=costo;
                break;
            
            case OBTENER_CARRITOS:
                listaPedidos.leerArchivo();
                peticionRecibida.setDatosSalida(this.listaPedidos.getListaPedidos());
                break;
        }
        return peticionRecibida;
    }
    
}
