/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.GestorProductos;
import Modelo.Client;
import Modelo.Peticion;
import Modelo.Productos;
import Modelo.TipoAccion;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EditarItemInventario extends javax.swing.JPanel {
    Productos producto=null;
    int index =-1;
    String fileName=null;
    
    /**
     * Creates new form EditarItemInventario
     */
    public EditarItemInventario() {
        initComponents();
        btnEliminar.setVisible(false);
        ocultarErrores();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupoProducto = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtCalorias = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();
        txtCosto1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbtnComida = new javax.swing.JRadioButton();
        rbtnBebida = new javax.swing.JRadioButton();
        lblErrorCant = new javax.swing.JLabel();
        lblErrorCalorias = new javax.swing.JLabel();
        lblErrorCosto = new javax.swing.JLabel();
        lblErrorRbtn = new javax.swing.JLabel();
        lblErrorNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Debe de seleccionar una opción");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Agregar a inventario");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 120, 18));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 18));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Calorias");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 18));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Seleccionar Imagen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Agregar Inventario");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 180, 30));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 142, -1));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 142, -1));

        txtCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaloriasActionPerformed(evt);
            }
        });
        add(txtCalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 140, -1));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sinImagen.png"))); // NOI18N
        add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 210, 250));

        txtCosto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCosto1ActionPerformed(evt);
            }
        });
        add(txtCosto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 142, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Costo");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        btnGrupoProducto.add(rbtnComida);
        rbtnComida.setText("Comida");
        rbtnComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnComidaActionPerformed(evt);
            }
        });
        add(rbtnComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 90, -1));

        btnGrupoProducto.add(rbtnBebida);
        rbtnBebida.setText("Bebida");
        add(rbtnBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 90, -1));

        lblErrorCant.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblErrorCant.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorCant.setText("Debe ser un número mayor a 0");
        add(lblErrorCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 180, -1));

        lblErrorCalorias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblErrorCalorias.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorCalorias.setText("Debe ser un número mayor a 0");
        add(lblErrorCalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 190, -1));

        lblErrorCosto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblErrorCosto.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorCosto.setText("Debe ser un número mayor a 0");
        add(lblErrorCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 180, -1));

        lblErrorRbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblErrorRbtn.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorRbtn.setText("Debe de seleccionar una opción");
        add(lblErrorRbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 200, -1));

        lblErrorNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblErrorNombre.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorNombre.setText("Nombre no puede ser vacío");
        add(lblErrorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 160, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 18));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo Producto");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    public void ingresarDatosProducto(){
        btnEliminar.setVisible(true);
        Productos comida=new Modelo.Comida();
        Productos bebida = new Modelo.Bebida();
        txtNombre.setText(producto.getNombre());
        txtCosto1.setText(Double.toString(producto.getCosto()));
        txtCalorias.setText(Double.toString(producto.getCaloria()));
        
        if(producto.getClass().equals(comida.getClass())){
            txtCantidad.setText(Double.toString(producto.getRacion()));
            lblTitulo.setText("Comida");
        }
        else{
            txtCantidad.setText(Double.toString(producto.getCantidadLiquido()));
            lblTitulo.setText("Bebida");
        }
        
        fileName=producto.getImagen();
        ImageIcon icon = new ImageIcon(producto.getImagen());
        lblImagen.setIcon(icon);
        
        rbtnBebida.setVisible(false);
        rbtnComida.setVisible(false);
        
    }
    
    public void activarBotones(){
        rbtnBebida.setVisible(true);
        rbtnComida.setVisible(true);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file =chooser.getSelectedFile();
        
        fileName= file.getAbsolutePath();
        String extension= "";
        int posicion = fileName.lastIndexOf('.');
        if (posicion > 0) {
            extension = fileName.substring(posicion+1);
        }
        
        if(extension.equals("jpg")||extension.equals("png")||extension.equals("jpeg")){
            ImageIcon icon = new ImageIcon(fileName);
            lblImagen.setIcon(icon);
        }
        else{
            JOptionPane.showMessageDialog(null, "Archivo inválido. Debe de seleccionar un archivo con extensión: \njpg, jpeg o png", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ocultarErrores(){
        lblErrorCalorias.setVisible(false);
        lblErrorCant.setVisible(false);
        lblErrorCosto.setVisible(false);
        lblErrorNombre.setVisible(false);
        lblErrorRbtn.setVisible(false);
    }
    
    public void limpiarCampos(){
        txtCalorias.setText("");
        txtCantidad.setText("");
        txtCosto1.setText("");
        txtNombre.setText("");
        fileName=null;
        index=-1;
        producto=null;
        lblTitulo.setText("");
        
        ImageIcon icon = new ImageIcon("src/Imagenes/sinImagen.png");
        lblImagen.setIcon(icon);
        
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
        ocultarErrores();
        this.setVisible(false);
        InterfazPrincipal.editMenu.setVisible(true);
        InterfazPrincipal.contenedor.add(InterfazPrincipal.editMenu);
    }//GEN-LAST:event_jButton3ActionPerformed

    private boolean validarCampos(){
        if(txtNombre.getText().isEmpty()){
            lblErrorNombre.setVisible(true);
        }
        else{
            lblErrorNombre.setVisible(false);
        }
        if(txtCosto1.getText().isEmpty()){
            lblErrorCosto.setVisible(true);
        }
        else{
            try {
                if(Double.parseDouble(txtCosto1.getText())>0){
                    lblErrorCosto.setVisible(false);
                }
                else{
                    lblErrorCosto.setVisible(true);
                }
            } catch (Exception e) {
                lblErrorCosto.setVisible(true);
            }
        }
        if(txtCantidad.getText().isEmpty()){
            lblErrorCant.setVisible(true);
        }
        else{
            try {
                if(Double.parseDouble(txtCantidad.getText())>0){
                    lblErrorCant.setVisible(false);
                }
                else{
                    lblErrorCant.setVisible(true);
                }
            } catch (Exception e) {
                lblErrorCant.setVisible(true);
            }
        }
        if(txtCalorias.getText().isEmpty()){
            lblErrorCalorias.setVisible(true);
        }
        else{
            try {
                if(Double.parseDouble(txtCalorias.getText())>0){
                    lblErrorCalorias.setVisible(false);
                }
                else{
                    lblErrorCalorias.setVisible(true);
                }
            } catch (Exception e) {
                lblErrorCalorias.setVisible(true);
            }
        }
        
        if(producto==null){
            if(!rbtnBebida.isSelected()&& !rbtnComida.isSelected()){
                lblErrorRbtn.setVisible(true);
            }
            else{
                lblErrorRbtn.setVisible(false);
            }
        }
        
        
        if(!lblErrorNombre.isVisible()&&!lblErrorCosto.isVisible()&&!lblErrorCant.isVisible()&&!lblErrorCalorias.isVisible()&&!lblErrorRbtn.isVisible()){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(validarCampos()){
             if(producto==null){
                if(rbtnBebida.isSelected()){
                    producto =new Modelo.Bebida(txtNombre.getText(),Double.parseDouble(txtCosto1.getText()),Double.parseDouble(txtCalorias.getText()),
                            Double.parseDouble(txtCantidad.getText()),fileName);
                }
                else{
                    producto =new Modelo.Comida(txtNombre.getText(),Double.parseDouble(txtCosto1.getText()),Double.parseDouble(txtCalorias.getText()),
                            Double.parseDouble(txtCantidad.getText()),fileName);
                }
                InterfazPrincipal.gestorPro.agregarProducto(producto);
                System.out.println(InterfazPrincipal.gestorPro.obtenerLista());
            }
            else{
               InterfazPrincipal.gestorPro.modificarProducto(index, txtNombre.getText(), Double.parseDouble(txtCosto1.getText()), Double.parseDouble(txtCantidad.getText()),
                       Double.parseDouble(txtCalorias.getText()), fileName);
            } 
             JOptionPane.showMessageDialog(null,"Logrado con éxito.");
            InterfazPrincipal.gestorPro.guardarArchivo(InterfazPrincipal.gestorPro.obtenerLista());
            InterfazPrincipal.gestorPro.leerArchivo();
            InterfazPrincipal.editMenu.fillListBox();
            limpiarCampos();
            btnGrupoProducto.clearSelection();
        }
        
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaloriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaloriasActionPerformed

    private void txtCosto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCosto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCosto1ActionPerformed

    private void rbtnComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnComidaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Peticion peticionEliminar = new Peticion(TipoAccion.ELIMINAR_PRODUCTO,index);
        Client conexion = new Client(peticionEliminar);
        JOptionPane.showMessageDialog(null, "Producto eliminado");
        limpiarCampos();
  
        ocultarErrores();
        this.setVisible(false);
        InterfazPrincipal.editMenu.setVisible(true);
        InterfazPrincipal.contenedor.add(InterfazPrincipal.editMenu);
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup btnGrupoProducto;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblErrorCalorias;
    private javax.swing.JLabel lblErrorCant;
    private javax.swing.JLabel lblErrorCosto;
    private javax.swing.JLabel lblErrorNombre;
    private javax.swing.JLabel lblErrorRbtn;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbtnBebida;
    private javax.swing.JRadioButton rbtnComida;
    private javax.swing.JTextField txtCalorias;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCosto1;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
