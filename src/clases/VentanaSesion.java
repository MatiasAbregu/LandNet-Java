package clases;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.sql.*;
import java.util.Map;
import javax.swing.*;

/**
 *
 * @author Matias Abregú
 */
public class VentanaSesion extends javax.swing.JFrame {

    private int MouseX, MouseY;
    public static String usuario, ID;

    public VentanaSesion() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("LandNet - Inicio de Sesión");

        jPanel1.setBackground(new Color(35, 35, 35));
        jPanel2.setBackground(new Color(45, 45, 45));

        ImageIcon logo = new ImageIcon("src/images/LandNet.png");
        Icon logoI = new ImageIcon(logo.getImage().getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_DEFAULT));
        Logo.setIcon(logoI);
  
    }

    @Override
    public Image getIconImage() {
        Image Icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/LandNet.png"));
        return Icono;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Bienvenida = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        Contraseña = new javax.swing.JPasswordField();
        IniciarSesion = new javax.swing.JButton();
        labelC = new javax.swing.JLabel();
        labelU = new javax.swing.JLabel();
        Leyenda = new javax.swing.JLabel();
        CrearCuenta = new javax.swing.JLabel();
        ANTC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Leelawadee UI", 2, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("LandNet");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        Minimizar.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        Minimizar.setForeground(new java.awt.Color(255, 255, 255));
        Minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimizar.setText("_");
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, -10, 20, -1));

        Cerrar.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 0, 20, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bienvenida.setFont(new java.awt.Font("Leelawadee UI", 3, 26)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida.setText("Bienvenido a LandNet");
        jPanel2.add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 280, -1));
        jPanel2.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 230, 230));

        Usuario.setBackground(new java.awt.Color(204, 204, 204));
        Usuario.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Usuario.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 280, 30));

        Contraseña.setBackground(new java.awt.Color(204, 204, 204));
        Contraseña.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 280, 30));

        IniciarSesion.setBackground(new java.awt.Color(51, 51, 51));
        IniciarSesion.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        IniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        IniciarSesion.setText("Iniciar Sesión");
        IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 120, 40));

        labelC.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        labelC.setForeground(new java.awt.Color(255, 255, 255));
        labelC.setText("Contraseña:");
        jPanel2.add(labelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 80, -1));

        labelU.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        labelU.setForeground(new java.awt.Color(255, 255, 255));
        labelU.setText("Nombre de Usuario:");
        jPanel2.add(labelU, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 130, -1));

        Leyenda.setFont(new java.awt.Font("Leelawadee UI", 2, 12)); // NOI18N
        Leyenda.setForeground(new java.awt.Color(255, 255, 255));
        Leyenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Leyenda.setText("Desarrollado por Matias Abregú - 2022®");
        jPanel2.add(Leyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 220, -1));

        CrearCuenta.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        CrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        CrearCuenta.setText("Crear cuenta");
        CrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CrearCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CrearCuentaMouseExited(evt);
            }
        });
        jPanel2.add(CrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, -1));

        ANTC.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        ANTC.setForeground(new java.awt.Color(255, 255, 255));
        ANTC.setText("¿Aún no tienes una cuenta?");
        jPanel2.add(ANTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 650, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        MouseX = evt.getX();
        MouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - MouseX, y - MouseY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void CrearCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearCuentaMouseEntered
        Font font = CrearCuenta.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        CrearCuenta.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_CrearCuentaMouseEntered

    private void CrearCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearCuentaMouseExited
        Font font = CrearCuenta.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, -1);
        CrearCuenta.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_CrearCuentaMouseExited

    private void CrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearCuentaMouseClicked
       VentanaRegistro vr = new VentanaRegistro();
       vr.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_CrearCuentaMouseClicked

    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionActionPerformed
       
        try {
            if (!Usuario.getText().equals("") || !Contraseña.getText().equals("")) {
                
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_landnet", "root", "");
                PreparedStatement pst = cn.prepareStatement("select * from usuarios where Usuario = '" + Usuario.getText().trim() + "' and Contraseña = '"
                + Contraseña.getText().trim() + "'");
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    
                    usuario = rs.getString("Usuario");
                    ID = rs.getString("ID");
                    VentanaChat vc = new VentanaChat();
                    vc.setVisible(true);
                    this.dispose();
                    
                } else {
                    JOptionPane.showMessageDialog(null, "¡Usuario o Contraseña incorrecto!");
                    Contraseña.setText("");
                }
                
            } else{
                JOptionPane.showMessageDialog(null, "Debes ingresar datos en todos los campos.");
            }
        } catch (HeadlessException | SQLException e) {
        }
    }//GEN-LAST:event_IniciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ANTC;
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JLabel CrearCuenta;
    private javax.swing.JButton IniciarSesion;
    private javax.swing.JLabel Leyenda;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField Usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelC;
    private javax.swing.JLabel labelU;
    // End of variables declaration//GEN-END:variables
}
