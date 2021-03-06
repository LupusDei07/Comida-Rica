/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author yumii
 */
public class Bebida extends Productos{
    double cantidadLiquido;
    
    /**
     * Método constructor vacío
     */
    public Bebida() {
    }
    
    /**
     * Método constructor que recibe:
     * @param nombre
     * @param costo
     * @param caloria 
     * y de un solo se realiza la asignación de datos.
     */
    public Bebida(String nombre, int costo, int caloria){
        super.nombre=nombre;
        super.costo=costo;
        super.caloria=caloria;
    }
    
    /**
     * Método constructor que recibe:
     * @param nombre
     * @param costo
     * @param caloria
     * @param cantidadLiquido
     * @param imagen 
     * y de un solo se realiza la asignación de datos.
     */
    public Bebida(String nombre, double costo, double caloria,double cantidadLiquido, String imagen) {
        this.cantidadLiquido = cantidadLiquido;
        super.nombre=nombre;
        super.costo=costo;
        super.caloria=caloria;
        super.imagen=imagen;
    }
    
    //Getters y Setters de nombre, costo, caloría, imagen, cantidadLiquido, cantVecesPedida
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre){
        super.nombre=nombre;
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
    
    public void setImagen(String imagen){
        super.imagen=imagen;
    }

    public String getImagen() {
        return imagen;
    }

    public int getCantVecesPedida() {
        return cantVecesPedida;
    }

    public void setCantVecesPedida(int cantVecesPedida) {
        this.cantVecesPedida = cantVecesPedida;
    }

    @Override
    public void cantidadLiquido(double cantidad) {
        this.cantidadLiquido=cantidad;
    }

    /**
     * Valor de hashCode
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.cantidadLiquido) ^ (Double.doubleToLongBits(this.cantidadLiquido) >>> 32));
        return hash;
    }

    /**
     * Valor de equals
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
        final Bebida other = (Bebida) obj;
        if (this.cantidadLiquido != other.cantidadLiquido) {
            return false;
        }
        return true;
    }

    /**
     * Clase Abstracta 
     * @param racion 
     */
    @Override
    public void racion(double racion) {
    }
    
    /**
     * Funcionamiento: Retorna de manera más detallada los datos que tiene almacenado.
     * @return 
     */
    @Override
    public String toString() {
        return "Bebida{" + "nombre="+super.getNombre()+" costo="+super.getCosto()+" calorias"+super.getCaloria()+" cantidadLiquido=" + cantidadLiquido + 
                " cantidad veces pedido="+super.getCantVecesPedida()+'}';
    }
    
    //Implementación de los métodos del interface
    @Override
    public double getRacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getCantidadLiquido() {
        return this.cantidadLiquido;
    }
    
}
