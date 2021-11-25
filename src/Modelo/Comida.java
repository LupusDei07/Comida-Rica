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
public class Comida extends Productos{
    double racion;
    /**
     * Método Constructor vacío
     */
    public Comida() {
    }
    
    /**
     * Método constructor que recibe por parámetro:
     * @param nombre
     * @param costo
     * @param caloria 
     * y realiza la asignación de datos correspondientes de un solo.
     */
    public Comida(String nombre, double costo, int caloria){
        super.nombre=nombre;
        super.costo=costo;
        super.caloria=caloria;
    }

    /**
     * Método constructor que recibe por parámetro:
     * @param nombre
     * @param costo
     * @param caloria
     * @param racion
     * @param imagen 
     * y realiza la asignación de datos correspondientes de un solo.
     */
    public Comida(String nombre, double costo, double caloria,double racion, String imagen) {
        this.racion = racion;
        super.nombre=nombre;
        super.costo=costo;
        super.caloria=caloria;
        super.imagen=imagen;
    }
    
    
    //Getters y setters
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

    
    //Métodos de los interfaces junto con el toString
    @Override
    public void racion(double racion) {
        this.racion=racion;
    }
    
    @Override
    public void cantidadLiquido(double cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Comida{" + "nombre="+super.getNombre()+" costo="+super.getCosto()+" calorias"+super.getCaloria()+" racion=" + racion +" cantidad veces pedido="+
                super.getCantVecesPedida()+'}';
    }

    @Override
    public double getRacion() {
        return this.racion;
    }

    @Override
    public double getCantidadLiquido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
