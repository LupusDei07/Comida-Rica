/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.CarritoPedido;
import Modelo.Pedido;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Carrito extends javax.swing.JPanel {

    /**
     * Creates new form Carrito
     */
    public Carrito() {
        initComponents();
        
        
        
    }
    
    public void mostrar(){
        ArrayList<Pedido> lista=InterfazPrincipal.carritoP.getListaPedidos();
        String matris[][]= new String[lista.size()][2];
        
        
        int c=0;
        for (int j = 0; j < lista.size(); j++) {    
            System.out.println(lista.get(j));

            matris[c][0]=Integer.toString(lista.get(j).getCantidad());
            matris[c][1]=lista.get(j).getNombreProducto();
            c++;
        }
        
         jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Cantidad", "Nombre"
            }
        ));
    
    
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(215, 189, 121));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cantidad", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(40);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 550, 250));

        jButton3.setText("Hacer Pedido");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));

        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        InterfazPrincipal.menu.setVisible(true);
        InterfazPrincipal.contenedor.add(InterfazPrincipal.menu);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
        
        
         int temp= (int)jTable1.getSelectedColumn(); //// si esto da error es get SelectedRow
        
         ArrayList<Pedido> lista=InterfazPrincipal.carritoP.getListaPedidos();
         
         
         InterfazPrincipal.carritoP.getListaPedidos().remove(temp);
         
         mostrar();
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Actualizar();
        this.setVisible(false);
        InterfazPrincipal.formaRecibido.setVisible(true);
        InterfazPrincipal.contenedor.add(InterfazPrincipal.formaRecibido);
        
        
        
        //InterfazPrincipal.gestorP.agregarCarrito(InterfazPrincipal.carritoP);
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        
        int temp= (int)jTable1.getSelectedRow(); //// si esto da error es get SelectedRow
        
         ArrayList<Pedido> lista=InterfazPrincipal.carritoP.getListaPedidos();
         
         
         InterfazPrincipal.carritoP.getListaPedidos().get(temp).setCantidad(Integer.parseInt(JOptionPane.showInputDialog("la cantidad que desea")));
         
         mostrar();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void Actualizar() {
        
    
    }
}
