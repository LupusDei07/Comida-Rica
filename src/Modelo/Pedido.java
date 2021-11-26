/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Objects;
import java.io.Serializable;

/**
 *
 * @author yumii
 */
public class Pedido implements Serializable{
    protected int cantidad;
    protected double costo;
    protected String nombreProducto;
    
    
    /**
     * Método constructor vacío
     */
    public Pedido() {
    }

    /**
     * Método constructor que recibe:
     * @param cantidad
     * @param costo
     * @param producto 
     * y de un solo se realiza la asignación de datos.
     */
    public Pedido(int cantidad, double costo, String producto) {
        this.cantidad = cantidad;
        this.costo = costo;
        this.nombreProducto = producto;
    }
    
    //Getters y setters
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String producto) {
        this.nombreProducto = producto;
    }
    
    /**
     * Funcionamiento: Retorna de manera más detallada los datos que tiene almacenado.
     * @return 
     */
    @Override
    public String toString() {
        return "Pedido{" + "cantidad=" + cantidad + ", costo=" + costo + ", nombreProducto=" + nombreProducto + '}';
    }

    /**
     * Valor del hashCode
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.cantidad;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.costo) ^ (Double.doubleToLongBits(this.costo) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.nombreProducto);
        return hash;
    }
    
    /**
     * Método para comparar.
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pedido other = (Pedido) obj;
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (Double.doubleToLongBits(this.costo) != Double.doubleToLongBits(other.costo)) {
            return false;
        }
        if (!Objects.equals(this.nombreProducto, other.nombreProducto)) {
            return false;
        }
        return true;
    }
    
    
}
