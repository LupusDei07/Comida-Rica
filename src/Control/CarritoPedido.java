/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Pedido;
import Modelo.Pedido;
import Modelo.TipoPedido;
import Modelo.TipoPedido;
import java.util.ArrayList;
import java.util.Objects;
import java.io.Serializable;

/**
 *
 * @author yumii
 */
public class CarritoPedido implements Serializable{
    ArrayList<Pedido> listaPedidos;

    /**
     *
     */
    protected TipoPedido tipoPedido;
    
    /**
     *
     */
    protected double costoFinal;

    /**
     *
     */
    protected String direccion;

    /**
     *
     */
    protected String nombre;

    /**
     *
     */
    protected int telefono;

    /**
     * Funcionamiento: Método constructor que creará el arraylist de listaPedidos
     * Entradas: N/A
     * Salidas: N/A
     */
    public CarritoPedido() {
        this.listaPedidos = new ArrayList<Pedido>();
    }
    
    //Getters y setters

    /**
     *
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return
     */
    public double getCostoFinal() {
        return costoFinal;
    }

    /**
     *
     * @param costoFinal
     */
    public void setCostoFinal(double costoFinal) {
        this.costoFinal = costoFinal;
    }
    

    /**
     * Funcionamiento: Responsable de agregar un nuevo pedido a la listaPedidos
     * Salidas: N/A
     * @param pedido 
     */
    public void agregar(Pedido pedido){
        listaPedidos.add(pedido);
    }
    
    /**
     * Funcionamiento: Retorna la lista de pedidos
     * Entradas: N/A
     * Salidas: listaPedidos
     * @return 
     */
    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    /**
     * Funcionamiento: Obtener el tipo de pedido, ya sea para llevar, comer ahí o express
     * Entradas: N/A
     * Salidas: tipoPedido
     * @return 
     */
    public TipoPedido getTipoPedido() {
        return tipoPedido;
    }

    /**
     * Funcionamiento: Agrega el tipo de pedido a nuestro carrito
     * Salidas: N/A
     * @param tipoPedido 
     */
    public void setTipoPedido(TipoPedido tipoPedido) {
        this.tipoPedido = tipoPedido;
    }
    
    /**
     * Funcionamiento: Modifica la cantidad de un producto, si la cantidad recibida es 0 significa 
     * que no va a querer este producto, es por eso que se eliminará de la lista.
     * 
     * @param cantidad
     * @param nombreProducto 
     * 
     * Salidas: N/A
     */
    public void modificar(int cantidad, String nombreProducto ){
        for(int contador=0;contador<listaPedidos.size();contador++){
            if(listaPedidos.get(contador).getNombreProducto().equals(nombreProducto)){
                if(cantidad==0){
                    listaPedidos.remove(contador);
                }
                else{
                    listaPedidos.get(contador).setCantidad(cantidad);
                }
            }
        }
    }
       
    /**
     * Funcionamiento: Limpia toda la lista pedidos
     * Entradas: N/A
     * Salidas: N/A
     */
    public void eliminar(){
        this.listaPedidos.clear();
    }
    
    /**
     * Funcionamiento: Retorna un String con los datos del carrito, es decir, la lista de pedidos que
     * realizó el usuario y el tipo de pedido.
     * Entradas: N/A
     * Salidas: String
     * @return 
     */
    @Override
    public String toString() {
        return "GestorPedidos{" + "listaPedidos=" + listaPedidos + ", tipoPedido=" + tipoPedido + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.listaPedidos);
        hash = 29 * hash + Objects.hashCode(this.tipoPedido);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.costoFinal) ^ (Double.doubleToLongBits(this.costoFinal) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.direccion);
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + this.telefono;
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
        final CarritoPedido other = (CarritoPedido) obj;
        if (Double.doubleToLongBits(this.costoFinal) != Double.doubleToLongBits(other.costoFinal)) {
            return false;
        }
        if (this.telefono != other.telefono) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.listaPedidos, other.listaPedidos)) {
            return false;
        }
        if (this.tipoPedido != other.tipoPedido) {
            return false;
        }
        return true;
    }
    
    
}
