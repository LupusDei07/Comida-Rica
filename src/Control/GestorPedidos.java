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
    ArrayList<CarritoPedido> listaPedidos;

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
     
    public int [] getEstadisticaTipoPedido(){
        int contadorExpress=0, contadorComerAhi=0,contadorParaLlevar=0;
        
        for(CarritoPedido carrito:listaPedidos){
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
        
        int[]arregloContadores={contadorComerAhi,contadorParaLlevar,contadorExpress};
        
        return arregloContadores ;
    }
    
}
