/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.CarritoPedido;
import Modelo.Productos;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Usuario
 */
public class Top10 extends javax.swing.JPanel {

    /**
     * Creates new form Top10
     */
    public Top10() {
        initComponents();
        //mostrar();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setBackground(new java.awt.Color(215, 189, 121));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 440, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    /**
     *
     */
    public void mostrar() {
        ArrayList<Productos> listaOrdenada=InterfazPrincipal.gestorPro.obtenerListaOrdenada();
        DefaultListModel m = new DefaultListModel();
        
        if (listaOrdenada.size() <10){             
            for (int i = 0; i < listaOrdenada.size(); i++) {
                m.addElement(i+1+ ". " +listaOrdenada.get(i).getNombre());
            }
        }else{
            for (int i = 0; i < 10; i++) {
                m.addElement(i+1+ ". " +listaOrdenada.get(i).getNombre());   
            }

        
        }
        jList1.setModel(m);
    }
    

}
