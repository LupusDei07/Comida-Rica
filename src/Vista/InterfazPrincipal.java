/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.CarritoPedido;
import Control.ControladorServidor;
import Control.GestorPedidos;
import Modelo.Pedido;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Control.GestorProductos;
import Modelo.Client;
import Modelo.Peticion;
import Modelo.TipoAccion;

/**
 *
 * @author Usuario
 */
public class InterfazPrincipal extends javax.swing.JFrame implements ActionListener{
    
    static boolean isAdmin= true;
    static int costoExpress= 100;
    
    static CarritoPedido carritoP = new CarritoPedido();
    static GestorPedidos gestorP= new GestorPedidos();
    static GestorProductos gestorPro= new GestorProductos();
    static ControladorServidor server =new ControladorServidor();
    
    
    static Ingresar ingresar= new Ingresar();
    static CostoExpress costo= new CostoExpress();
    static EditarMenu editMenu= new EditarMenu();
    static Bebida bebida= new Bebida();
    static Comida comida= new Comida();
    static Menu menu= new Menu();
    static Carrito carrito=new Carrito();
    static PedidosActuales pActuales =new PedidosActuales();
    static EditarItemInventario editItem = new EditarItemInventario();
    static FormaDeRecibido formaRecibido = new FormaDeRecibido();

    

    MenosPedido mPedido= new MenosPedido();
    TipoPedido tPedido= new TipoPedido();
    Top10 t10=new Top10();
    

    

    public static int getCostoExpress() {
        return costoExpress;
    }

    public static void setCostoExpress(int costoExpress) {
        InterfazPrincipal.costoExpress = costoExpress;
    }

    
    
    public static boolean getIsAdmin() {
        return isAdmin;
    }

    public static void setIsAdmin(boolean isAdmin) {
        InterfazPrincipal.isAdmin = isAdmin;
    }
    
    
    
    

    public static CarritoPedido getCarritoP() {
        return carritoP;
    }

    public static void setCarritoP(CarritoPedido carritoP) {
        InterfazPrincipal.carritoP = carritoP;
    }

    public static GestorPedidos getGestorP() {
        return gestorP;
    }

    public static void setGestorP(GestorPedidos gestorP) {
        InterfazPrincipal.gestorP = gestorP;
    }

    public static GestorProductos getGestorPro() {
        return gestorPro;
    }

    public static void setGestorPro(GestorProductos gestorPro) {
        InterfazPrincipal.gestorPro = gestorPro;
    }

    public static ControladorServidor getServer() {
        return server;
    }

    public static void setServer(ControladorServidor server) {
        InterfazPrincipal.server = server;
    }
    
    
    

    static void runBebida() {
        menu.setVisible(false);
        contenedor.add(bebida);
        bebida.setVisible(true);
        
            
            
        
        
    }

    static void runComida() {
        
        menu.setVisible(false);
        contenedor.add(comida);
        comida.setVisible(true);
            
        
    }

    static void runCarrito() {
        menu.setVisible(false);
        contenedor.add(carrito);
        carrito.setVisible(true);
        
        

    }
    

    
    
    
    GestorPedidos listaPedidos=new GestorPedidos();
    /**
     * Creates new form InterfazProncipal
     */
    public InterfazPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        jMenuItem1.addActionListener(this);
        jMenuItem9.addActionListener(this);
        jMenuItem7.addActionListener(this);
        jMenuItem10.addActionListener(this);
        jMenuItem11.addActionListener(this);
        jMenuItem12.addActionListener(this);
        jMenuItem6.addActionListener(this);
        jMenuItem8.addActionListener(this);
        
        ingresar.setVisible(false);
        costo.setVisible(false);
        editMenu.setVisible(false);   
        mPedido.setVisible(false); 
        tPedido.setVisible(false); 
        t10.setVisible(false); 
        menu.setVisible(false);
        pActuales.setVisible(false);
        bebida.setVisible(false);
        comida.setVisible(false);
        carrito.setVisible(false);
        editItem.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelfondo = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JUsuario = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        labelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        getContentPane().add(labelfondo, java.awt.BorderLayout.CENTER);

        contenedor.setLayout(new java.awt.BorderLayout());
        getContentPane().add(contenedor, java.awt.BorderLayout.PAGE_START);

        JUsuario.setText("Usuario");

        jMenuItem1.setText("Ingresar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        JUsuario.add(jMenuItem1);

        jMenuItem2.setText("Usuario Actual");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        JUsuario.add(jMenuItem2);

        jMenuItem3.setText("Cerrar Sesion");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseEntered(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        JUsuario.add(jMenuItem3);

        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        JUsuario.add(jMenuItem4);

        jMenuBar1.add(JUsuario);

        jMenu2.setText("Ver");

        jMenuItem6.setText("Menu");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        jMenuItem5.setText("Sobre nosotros");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Admin");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu4MouseEntered(evt);
            }
        });

        jMenuItem7.setText("Inventario");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenu1.setText("Ver Pedidos");

        jMenu5.setText("Estadisticas");

        jMenuItem10.setText("Top 10");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem11.setText("Tipo Pedido");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("Menos Pedido");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenu1.add(jMenu5);

        jMenuItem8.setText("Pedidos Actuales");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenu4.add(jMenu1);

        jMenuItem9.setText("Costo Express");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    

    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        if (ingresar.isShowing()){
        ingresar.setVisible(false);
        }else{
            contenedor.add(ingresar);
            ingresar.setVisible(true);
            
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
        if(isAdmin==false){
            JOptionPane.showMessageDialog(rootPane, "Actualmente se encuentra como Cliente. ");
        
        }else{
        
        JOptionPane.showMessageDialog(rootPane, "Actualmente se encuentra como Administrador");                          
        
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        
        Peticion peticionIngresar = new Peticion(TipoAccion.CERRAR_SESION,isAdmin);
        Client conexion = new Client(peticionIngresar);     

        isAdmin= (boolean) conexion.getRespuestaServer();
        JOptionPane.showMessageDialog(rootPane, "Se Acaba de cerrar sesión");
   
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Gracias por preferirnos, hasta luego!");
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(rootPane, "Programa creado por: \n Samuel Artavia \n Ericka Yu Min \n David Achoy \n\n\n Universidad tecnologica de Costa Rica \n II Semestre 2021");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        if (menu.isShowing()){
        menu.setVisible(false);
        carrito.setVisible(false);
        bebida.setVisible(false);
        comida.setVisible(false);
        }else{
            contenedor.add(menu);
            menu.setVisible(true);
            
        }
           
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        if (editMenu.isShowing()){
        editMenu.setVisible(false);
        }else{
            contenedor.add(editMenu);
            editMenu.setVisible(true);
            
        }        
        
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        if (tPedido.isShowing()){
        tPedido.setVisible(false);
        }else{
            contenedor.add(tPedido);
            tPedido.setVisible(true);
            
        }  
        
        
        
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        
        costo.actualizar();
        contenedor.add(costo);
        costo.setVisible(true);
            

        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
       if (t10.isShowing()){
        t10.setVisible(false);
        }else{
            contenedor.add(t10);
            t10.setVisible(true);
            
        } 
        
        
        
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        if (mPedido.isShowing()){
        mPedido.setVisible(false);
        }else{
            contenedor.add(mPedido);
            mPedido.setVisible(true);
            
        } 
        
        
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenu4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseEntered
        // TODO add your handling code here:
        if(isAdmin==false){
        jMenu4.setEnabled(false);
        
        }else{
        jMenu4.setEnabled(true);
        }
    }//GEN-LAST:event_jMenu4MouseEntered

    private void jMenuItem3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseEntered
        // TODO add your handling code here:
        
        if(isAdmin==false){
        jMenuItem3.setEnabled(false);
        
        }else{
        jMenuItem3.setEnabled(true);
        }
    }//GEN-LAST:event_jMenuItem3MouseEntered

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        if (pActuales.isShowing()){
        pActuales.setVisible(false);
        }else{
            contenedor.add(pActuales);
            pActuales.setVisible(true);
            
        }      
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JUsuario;
    public static javax.swing.JPanel contenedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel labelfondo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
