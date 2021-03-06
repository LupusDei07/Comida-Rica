/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.CarritoPedido;
import Control.GestorPedidos;
import Modelo.Client;
import Modelo.Peticion;
import Modelo.Productos;
import Modelo.TipoAccion;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PedidosActuales extends javax.swing.JPanel {
    
    /**
     * Creates new form PedidosActuales
     */
    DefaultListModel m = new DefaultListModel();
    
    ArrayList<CarritoPedido> l= new ArrayList<CarritoPedido>();
    
    public PedidosActuales() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(215, 189, 121));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 110, 148));

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 281, -1, -1));

        jButton1.setText("Finalizar Pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 281, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<CarritoPedido> actualizarPedidos(){
        Peticion peticionObtenerCarritos=new Peticion(TipoAccion.OBTENER_CARRITOS,null);
        Client conexion = new Client(peticionObtenerCarritos);
        return (ArrayList<CarritoPedido>)conexion.getRespuestaServer();
        
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        l= actualizarPedidos();
        int fila =jList1.getSelectedIndex();
        if (fila>=0){
        
        m.remove(fila);
        
        }else{
        
        JOptionPane.showMessageDialog(null, "Seleccionar Fila");
        }
        
        InterfazPrincipal.getGestorP().setListaPedidos(l);
         
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void fillListBox() {

        

//        l= InterfazPrincipal.gestorP.getListaPedidos();
//            for (int i = 0; i < l.size(); i++) {
//                m.addElement(l.get(i));  
//            }
//            jList1.setModel(m);
//        

       
        
        
        l= actualizarPedidos();
        if(l!=null){
            for (int i = 0; i < l.size(); i++) {
                m.addElement(l.get(i));  
            }
            jList1.setModel(m);
        }
        

        
    }
}
