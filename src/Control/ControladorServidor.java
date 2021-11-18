/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Administrador;
import Modelo.Peticion;

/**
 *
 * @author yumii
 */
public class ControladorServidor {
    
    private Administrador admUsr = new Administrador();

    public ControladorServidor() {
    }
    
    public Peticion procesarPeticion(Peticion peticionRecibida) {
        switch (peticionRecibida.getAccion()){
            case INGRESAR: 
                 String credenciales = (String) peticionRecibida.getDatosEntrada();
                 String [] partes  = credenciales.split("-"); 
                 boolean admOK = admUsr.validarAdm(partes[0], partes[1]);
                 peticionRecibida.setDatosSalida(admOK);
                break;
                
            case VER_PRODUCTOS:
                break;
                
            case MODIFICAR_PRODUCTO:
                break;
            
            case AGREGAR_CARRITO:
                break;
                
            case AGREGAR_PRODUCTO:
                break;
                
            case CERRAR_SESION:
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
