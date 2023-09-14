package clases;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author Matias Abregú
 */
public class VentanaRegistro extends javax.swing.JFrame {

    int MouseX, MouseY;
    private VentanaSesion vs = new VentanaSesion();
    
    public VentanaRegistro() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

        setTitle("LandNet - Crear Cuenta");

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NombreUsuario = new javax.swing.JTextField();
        CorreoElectronico = new javax.swing.JTextField();
        Contraseña = new javax.swing.JPasswordField();
        Crear = new javax.swing.JButton();
        Volver = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Leyenda = new javax.swing.JLabel();

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
        jPanel1.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -10, 20, -1));

        Cerrar.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 20, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 505, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear cuenta:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 21, 161, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de Usuario:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 132, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Correo Electronico: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, -1));

        NombreUsuario.setBackground(new java.awt.Color(204, 204, 204));
        NombreUsuario.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        NombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 290, 30));

        CorreoElectronico.setBackground(new java.awt.Color(204, 204, 204));
        CorreoElectronico.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        CorreoElectronico.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(CorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 290, 30));

        Contraseña.setBackground(new java.awt.Color(204, 204, 204));
        Contraseña.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 290, 30));

        Crear.setBackground(new java.awt.Color(51, 51, 51));
        Crear.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        Crear.setForeground(new java.awt.Color(255, 255, 255));
        Crear.setText("Crear cuenta");
        Crear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        jPanel2.add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, 40));

        Volver.setFont(new java.awt.Font("Leelawadee UI", 2, 18)); // NOI18N
        Volver.setForeground(new java.awt.Color(255, 255, 255));
        Volver.setText("Volver");
        Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VolverMouseExited(evt);
            }
        });
        jPanel2.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 60, -1));
        jPanel2.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 120, 120));

        Leyenda.setFont(new java.awt.Font("Leelawadee UI", 2, 12)); // NOI18N
        Leyenda.setForeground(new java.awt.Color(255, 255, 255));
        Leyenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Leyenda.setText("Desarrollado por Matias Abregú - 2022®");
        jPanel2.add(Leyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 220, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 505, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - MouseX, y - MouseY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        MouseX = evt.getX();
        MouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void VolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseEntered
        Font font = Volver.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        Volver.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_VolverMouseEntered

    private void VolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseExited
       Font font = Volver.getFont();
       Map attributes = font.getAttributes();
       attributes.put(TextAttribute.UNDERLINE, -1);
       Volver.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_VolverMouseExited

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
       vs = new VentanaSesion();
       vs.setVisible(true);     
       this.dispose();
    }//GEN-LAST:event_VolverMouseClicked

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
       
        if(NombreUsuario.getText().equals("") || Contraseña.getText().equals("") || CorreoElectronico.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Porfavor rellene todos los campos para poder registrarse.");
        } else if(CorreoElectronico.getText().contains("@")){
            try {
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_landnet", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into usuarios values(?, ?, ?, ?)");
            
            pst.setString(1, "0");
            pst.setString(2, NombreUsuario.getText().trim());
            pst.setString(3, Contraseña.getText().trim());
            pst.setString(4, CorreoElectronico.getText().trim());
            pst.executeUpdate();
            
            NombreUsuario.setText("");
            Contraseña.setText("");
            CorreoElectronico.setText("");
            
            JOptionPane.showMessageDialog(null, "Cuenta creada con éxito.");
            vs.setVisible(true);
            this.dispose();
       
        } catch (SQLException e) {
            System.out.println(e);
        }
      } else{
            JOptionPane.showMessageDialog(null, "Recuerda que los correos electronicos por regla general llevan @.");
        }
    }//GEN-LAST:event_CrearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JTextField CorreoElectronico;
    private javax.swing.JButton Crear;
    private javax.swing.JLabel Leyenda;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JTextField NombreUsuario;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
