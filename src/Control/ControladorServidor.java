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

/**
 *
 * @author yumii
 */
public class ControladorServidor {
    
    private Administrador admUsr = new Administrador();
    private GestorProductos listaProductos = new GestorProductos();

    public ControladorServidor() {
    }
    //INGRESAR, VER_PRODUCTOS, MODIFICAR_PRODUCTO,AGREGAR_CARRITO,AGREGAR_PRODUCTO,CERRAR_SESION,TOP_10,MENOS_PEDIDOS,TIPOS_PEDIDOS,REALIZAR_PEDIDO,VER_PEDIDOS
    //VER_BEBIDA,VER_COMIDAS
    public Peticion procesarPeticion(Peticion peticionRecibida) {
        switch (peticionRecibida.getAccion()){
            case INGRESAR: 
                 String credenciales = (String) peticionRecibida.getDatosEntrada();
                 String [] partes  = credenciales.split("-"); 
                 boolean admOK = admUsr.validarAdm(partes[0], partes[1]);
                 peticionRecibida.setDatosSalida(admOK);
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
                break;        
            case TOP_10:
                break;
            case MENOS_PEDIDOS:
                break;
            case TIPOS_PEDIDOS:
                break;
            case REALIZAR_PEDIDO:
                break;
            case VER_PEDIDOS:
                break;
            case CERRAR_PESTANA:
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
