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
    
    /**
     * Método Constructor que crea la un arraylist de tipo CarritoPedido
     */
    
    public void setListaPedidos(ArrayList<CarritoPedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public GestorPedidos() {
        this.listaPedidos = new ArrayList<CarritoPedido>();
    }
    
    /**
     * Funcionamiento: Agrega un nuevo carrito a nuestro gestor pedidos
     * @param carrito 
     * Salidas: N/A
     */
    public void agregarCarrito(CarritoPedido carrito){
        this.listaPedidos.add(carrito);
    }

    /**
     * Funcionamiento: Encargado de retornar la listaPedidos
     * Entradas: N/A
     * @return 
     */
    public ArrayList<CarritoPedido> getListaPedidos() {
        return listaPedidos;
    }
    
    /**
     * Funcionamiento: Recibe el index de un pedido para así poder obtener
     * retornar el pedido que se desea.
     * @param cual
     * @return 
     */
    public CarritoPedido getPedido(int cual){
        return listaPedidos.get(cual);
    }
    
    /**
     * Funcionamiento: Elimina un pedido, recibiendo el index del pedido que
     * se desea eliminar, para poder quitarlo de la lista.
     * @param cual 
     * Salidas: N/A
     */
    public void eliminarCarrito(int cual){
        listaPedidos.remove(cual);
    }

    /*Setters y Getters de contador Express, contadorComerAhi, contadorParaLlevar*/
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
     
    /**
     * Funcionamiento: Obtiene las estadísticas de los tipos de pedidos para retornarlos como un
     * arreglo de contadores.
     * Entradas: N/A
     * Salidas: arregloContadores (int[])
     * @return 
     */
    public int [] getEstadisticaTipoPedido(){
        int[]arregloContadores={contadorComerAhi,contadorParaLlevar,contadorExpress};
        
        return arregloContadores ;
    }
    
    /**
     * Funcionamiento: Actualiza la estadística de los tipos de pedido, recibiendo un nuevo carrito
     * y verificando si el carrito es de tipo comer ahi, express o para llevar y así poder incrementar
     * su respectivo contador.
     * 
     * @param carrito
     * 
     * Salidas: N/A
     */
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
