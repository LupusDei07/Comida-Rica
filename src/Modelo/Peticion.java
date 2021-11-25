/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.io.Serializable;

/**
 *
 * @author yumii
 */
public class Peticion implements Serializable{
    
    private TipoAccion accion;
    private Object datosEntrada;
    private Object datosSalida;

    /**
     * Método constructor vacío
     */
    public Peticion() {
    }

    /**
     * Método constructor que recibe:
     * @param accion
     * @param datosEntrada 
     * y de un solo se realiza la asignación de datos.
     */
    public Peticion(TipoAccion accion, Object datosEntrada) {
        this.accion = accion;
        this.datosEntrada = datosEntrada;
    }

    /**
     * Gettes y setters
     * 
     */
    public TipoAccion getAccion() {
        return accion;
    }

    public void setAccion(TipoAccion accion) {
        this.accion = accion;
    }

    public Object getDatosEntrada() {
        return datosEntrada;
    }

    public void setDatosEntrada(Object datosEntrada) {
        this.datosEntrada = datosEntrada;
    }

    public Object getDatosSalida() {
        return datosSalida;
    }

    public void setDatosSalida(Object datosSalida) {
        this.datosSalida = datosSalida;
    }

    /**
     * Funcionamiento: Retorna de manera más detallada los datos que tiene almacenado.
     * @return 
     */
    @Override
    public String toString() {
        return "Peticion{" + "accion=" + accion + ", datosEntrada=" + datosEntrada + ", datosSalida=" + datosSalida + '}';
    }
}