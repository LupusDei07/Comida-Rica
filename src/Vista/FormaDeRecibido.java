/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Usuario
 */
public class FormaDeRecibido extends javax.swing.JPanel {

    /**
     * Creates new form FormaDeRecibido
     */
    public FormaDeRecibido() {
        initComponents();
        lblSoli1.setVisible(false);
        txtSoli1.setVisible(false);
        lblSoli2.setVisible(false);
        txtSoli1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSoli2 = new javax.swing.JLabel();
        txtSoli2 = new javax.swing.JTextField();
        lblSoli1 = new javax.swing.JLabel();
        txtSoli1 = new javax.swing.JTextField();

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setText("jTextField1");

        setBackground(new java.awt.Color(215, 189, 121));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 30));

        jRadioButton1.setBackground(new java.awt.Color(215, 189, 121));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setText("Express");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(215, 189, 121));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setText("Comer Aquí");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jRadioButton3.setBackground(new java.awt.Color(215, 189, 121));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton3.setText("Para llevar");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Finalizar carrito");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 130, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Forma de Retiro");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 220, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Monto Total");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 100, -1));

        lblSoli2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSoli2.setText("Solicitud dato 2");
        add(lblSoli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 180, 20));

        txtSoli2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSoli2.setText("jTextField1");
        add(txtSoli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 150, -1));

        lblSoli1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSoli1.setText("Solicitud dato 1");
        add(lblSoli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 180, 20));

        txtSoli1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSoli1.setText("jTextField1");
        add(txtSoli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        jLabel1.setText("Dirección");
        lblSoli1.setVisible(true);
        
        txtSoli1.setText("");
        txtSoli1.setVisible(true);
        
        jLabel2.setText("Dirección");
        lblSoli2.setVisible(true);
        
        txtSoli2.setText("");
        txtSoli2.setVisible(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        lblSoli1.setText("Nombre de quien recoge");
        lblSoli1.setVisible(true);
        
        txtSoli1.setText("");
        txtSoli1.setVisible(true);
        
        lblSoli2.setVisible(false);
        txtSoli2.setVisible(false);
        
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblSoli1;
    private javax.swing.JLabel lblSoli2;
    private javax.swing.JTextField txtSoli1;
    private javax.swing.JTextField txtSoli2;
    // End of variables declaration//GEN-END:variables
}
