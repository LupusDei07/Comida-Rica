/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Pedido;
import java.util.ArrayList;

/**
 *
 * @author yumii
 */
public class GestorPedidos {
    ArrayList<Pedido> listaPedidos;

    public GestorPedidos() {
        this.listaPedidos = new ArrayList<Pedido>();
    }
    
    public void agregar(Pedido pedido){
        listaPedidos.add(pedido);
    }
    
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
       
    public void eliminar(){
        this.listaPedidos.clear();
    }
}
