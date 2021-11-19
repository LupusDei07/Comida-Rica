/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author yumii
 */
public abstract class Productos implements IRacion, ICantidad, Serializable,Comparable<Productos>{
    protected String nombre;
    protected double costo;
    protected double caloria;
    protected String imagen;
    protected int cantVecesPedida;
    
    public Productos(){
    }

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getCaloria() {
        return caloria;
    }

    public void setCaloria(double caloria) {
        this.caloria = caloria;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getCantVecesPedida() {
        return cantVecesPedida;
    }

    public void setCantVecesPedida(int cantVecesPedida) {
        this.cantVecesPedida = cantVecesPedida;
    }
    
    public abstract void setNombre(String nombre);
    
    @Override
    public int compareTo(Productos producto) {
        if(producto.getCantVecesPedida()<this.cantVecesPedida){
            return -1;
        }
        else if(producto.getCantVecesPedida()<this.cantVecesPedida){
            return 0;
        }
        return 1;
    }
    
    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", costo=" + costo + ", caloria=" + caloria + ", imagen=" + imagen + ", cantVecesPedida=" + cantVecesPedida + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.costo) ^ (Double.doubleToLongBits(this.costo) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.caloria) ^ (Double.doubleToLongBits(this.caloria) >>> 32));
        return hash;
    }

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
        final Productos other = (Productos) obj;
        if (Double.doubleToLongBits(this.costo) != Double.doubleToLongBits(other.costo)) {
            return false;
        }
        if (Double.doubleToLongBits(this.caloria) != Double.doubleToLongBits(other.caloria)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
}
