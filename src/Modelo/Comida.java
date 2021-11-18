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
    
    public Comida() {
    }
    
    public Comida(String nombre, double costo, int caloria){
        super.nombre=nombre;
        super.costo=costo;
        super.caloria=caloria;
    }

    public Comida(String nombre, double costo, double caloria,double racion, String imagen) {
        this.racion = racion;
        super.nombre=nombre;
        super.costo=costo;
        super.caloria=caloria;
        super.imagen=imagen;
    }
    
    

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

    @Override
    public void racion(double racion) {
        this.racion=racion;
    }
    
    @Override
    public void cantidadLiquido(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Comida{" + "nombre="+super.getNombre()+" costo="+super.getCosto()+" calorias"+super.getCaloria()+" racion=" + racion + '}';
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
