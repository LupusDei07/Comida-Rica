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
 *
 * @author yumii
 */
public class ControladorServidor {
    
    private Administrador admUsr = new Administrador();
    private GestorProductos listaProductos = new GestorProductos();
    private GestorPedidos listaPedidos = new GestorPedidos();


    public ControladorServidor() {
       listaProductos.leerArchivo();
        
    }
    
    //INGRESAR, VER_PRODUCTOS, MODIFICAR_PRODUCTO,AGREGAR_CARRITO,AGREGAR_PRODUCTO,CERRAR_SESION,TOP_10,MENOS_PEDIDOS,TIPOS_PEDIDOS,REALIZAR_PEDIDO,VER_PEDIDOS
    //VER_BEBIDA,VER_COMIDAS
    public Peticion procesarPeticion(Peticion peticionRecibida) {
        switch (peticionRecibida.getAccion()){
            case INGRESAR: 
                
                
                
                 String credenciales = (String) peticionRecibida.getDatosEntrada();
                 
                 if(credenciales.equals("-")){
                 peticionRecibida.setDatosSalida(null);
                 }else{
                 String [] partes  = credenciales.split("-"); 
                 boolean admOK = admUsr.validarAdm(partes[0], partes[1]);
                 peticionRecibida.setDatosSalida(admOK);
                 }
                break;
            case VER_PRODUCTOS:
                peticionRecibida.setDatosSalida(listaProductos.obtenerLista());
                break; 
            case MODIFICAR_PRODUCTO:
                
               
                

                break;
            case AGREGAR_CARRITO:
                
                
                
                
                
                
                
                break;         
            case AGREGAR_PRODUCTO_BEBIDA:
                //Bebida
                 String partesBebida = (String) peticionRecibida.getDatosEntrada();
                 String [] splitBebidas  = partesBebida.split("-"); 
                 Bebida newBebida = new Bebida();
                 listaProductos.agregarProducto(newBebida);                      
                break;
            case AGREGAR_PRODUCTO_COMIDA:
                //comida
                 String partesComida = (String) peticionRecibida.getDatosEntrada();
                 String [] splitComida   = partesComida.split("-"); 
                 Comida newComida = new Comida();
                 listaProductos.agregarProducto(newComida);                  
                break; 
            case CERRAR_SESION:
                if(peticionRecibida.getDatosEntrada().equals(true))
                peticionRecibida.setDatosSalida(false);
                
                
                break;        
            case TOP_10:
            ArrayList<Productos> listaOrdenada = listaProductos.obtenerListaOrdenada();
            ArrayList<Productos> top10 = null;
            
            if (listaOrdenada.size() <10)              
                for (int i = 0; i < listaOrdenada.size(); i++) {
                    top10.add(listaOrdenada.get(i));   
                }
            else{
                for (int i = 0; i < 10; i++) {
                    top10.add(listaOrdenada.get(i));   
                }
                
            }  
            peticionRecibida.setDatosSalida(top10);
                break;




                
                
                
                
            case MENOS_PEDIDOS:
            listaOrdenada = listaProductos.obtenerListaOrdenada();
            ArrayList<Productos> menosPedidos = null;
                for (int i = 0; i < listaOrdenada.size(); i++) {
                    Productos get = listaOrdenada.get(i);
                    if(get.getCantVecesPedida()==0){ 
                        menosPedidos.add(listaOrdenada.get(i));
                }
   
   
                }
                peticionRecibida.setDatosSalida(menosPedidos);
                break;
                
                
                
                
            case TIPOS_PEDIDOS:
                peticionRecibida.setDatosSalida(listaPedidos.getEstadisticaTipoPedido());
                break;
            case REALIZAR_PEDIDO:
                
                
                break;
            case VER_PEDIDOS:
                peticionRecibida.setDatosSalida(listaPedidos.getListaPedidos());
                break;
            case VER_COMIDAS:
                peticionRecibida.setDatosSalida(listaProductos.obtenerListaTipoProducto("Comida"));
                break;
            case VER_BEBIDA:
                peticionRecibida.setDatosSalida(listaProductos.obtenerListaTipoProducto("bebidas"));
                break;
              
            
                
                
                
            /*
            case SALUDAR: 
                peticionRecibida.setDatosSalida("Saludos cliente " + peticionRecibida.getDatosEntrada() + " desde el servidor!");
                break;
            case INGRESAR: 
                 String credenciales = (String) peticionRecibida.getDatosEntrada();
                 String [] partes  = credenciales.split("-"); 
                 boolean admOK = admUsr.validarAdm(partes[0], partes[1]);
                 peticionRecibida.setDatosSalida(admOK);
                break;
            case VER_PRODUCTOS: 
                break;
            case CONSULTAR_PRODUCTO: 
                break;
            case AGREGAR_CARRITO: 
                break;*/
        }
        return peticionRecibida;
    }
    
}
