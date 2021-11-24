/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Vista.TipoPedido;
import java.util.ArrayList;

/**
 *
 * @author yumii
 */
public class GestorPedidos {
    private ArrayList<CarritoPedido> listaPedidos;
    private int contadorExpress=0, contadorComerAhi=0,contadorParaLlevar=0;
    
    public GestorPedidos() {
        this.listaPedidos = new ArrayList<CarritoPedido>();
    }
    
    
    public void agregarCarrito(CarritoPedido carrito){
        this.listaPedidos.add(carrito);
    }

    public ArrayList<CarritoPedido> getListaPedidos() {
        return listaPedidos;
    }
    
    public CarritoPedido getPedido(int cual){
        return listaPedidos.get(cual);
    }
    
    public void eliminarCarrito(int cual){
        listaPedidos.remove(cual);
    }

    public int getContadorExpress() {
        return contadorExpress;
    }

    public void setContadorExpress(int contadorExpress) {
        this.contadorExpress = contadorExpress;
    }

    public int getContadorComerAhi() {
        return contadorComerAhi;
    }

    public void setContadorComerAhi(int contadorComerAhi) {
        this.contadorComerAhi = contadorComerAhi;
    }

    public int getContadorParaLlevar() {
        return contadorParaLlevar;
    }

    public void setContadorParaLlevar(int contadorParaLlevar) {
        this.contadorParaLlevar = contadorParaLlevar;
    }
     
    public int [] getEstadisticaTipoPedido(){
        int[]arregloContadores={contadorComerAhi,contadorParaLlevar,contadorExpress};
        
        return arregloContadores ;
    }
    
   public void actualizarEstadistica(CarritoPedido carrito){
       if(carrito.getTipoPedido().equals(Modelo.TipoPedido.COMER_AHI)){
            contadorComerAhi++;
        }
        else if(carrito.getTipoPedido().equals(Modelo.TipoPedido.EXPRESS)){
            contadorExpress++;
        }
        else{
            contadorParaLlevar++;
        }
   }
    
}
