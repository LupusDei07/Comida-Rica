/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Objects;

/**
 *
 * @author yumii
 */
public class Pedido {
    protected int cantidad;
    protected double costo;
    protected String nombreProducto;
    protected TipoPedido tipoPedido;
    
    protected String direccion;
    protected String nombre;
    protected int telefono;
    
    
    public Pedido() {
    }

    public Pedido(int cantidad, double costo, String producto) {
        this.cantidad = cantidad;
        this.costo = costo;
        this.nombreProducto = producto;
    }

    public Pedido(int cantidad, double costo, String nombreProducto, TipoPedido tipoPedido) {
        this.cantidad = cantidad;
        this.costo = costo;
        this.nombreProducto = nombreProducto;
        this.tipoPedido = tipoPedido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    

    public TipoPedido getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(TipoPedido tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    
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

    @Override
    public String toString() {
        return "Pedido{" + "cantidad=" + cantidad + ", costo=" + costo + ", nombreProducto=" + nombreProducto + ", tipoPedido=" + tipoPedido +
                ", direccion=" + direccion + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.cantidad;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.costo) ^ (Double.doubleToLongBits(this.costo) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.nombreProducto);
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
