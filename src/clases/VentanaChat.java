package clases;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Matias Abregú
 */
public class VentanaChat extends javax.swing.JFrame {

    VentanaSesion vs = new VentanaSesion();
    private int MouseX, MouseY;
    PaqueteAEnviar paqueteEnviarS = new PaqueteAEnviar();
    PaqueteAEnviar paqueteRecibirS = new PaqueteAEnviar();

    public VentanaChat() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("LandNet - Sesión de " + vs.usuario);
        Titulo.setText("LandNet - Sesión de " + vs.usuario);
        Información.setText(vs.usuario + " - ID: " + vs.ID);

        jPanel1.setBackground(new Color(35, 35, 35));
        jPanel2.setBackground(new Color(45, 45, 45));
        jPanel3.setBackground(new Color(38, 38, 38));

        txtAMostrar.setEditable(false);
        
        addWindowListener(new EnviarIP());
        Thread hilo1 = new Thread(new HiloC());
        hilo1.start();
    }

     @Override
    public Image getIconImage(){
        Image logo = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/Server.png"));
        return logo;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAMostrar = new javax.swing.JTextArea();
        EnviarTexto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAEnviar = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        Usuario = new javax.swing.JLabel();
        Información = new javax.swing.JLabel();
        Leyenda = new javax.swing.JLabel();
        IPU = new javax.swing.JLabel();
        ConectarConUsuario = new javax.swing.JButton();
        IPConexion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

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

        Titulo.setFont(new java.awt.Font("Leelawadee UI", 2, 20)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("LandNet - Sesión de ");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 20));

        Minimizar.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        Minimizar.setForeground(new java.awt.Color(255, 255, 255));
        Minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimizar.setText("_");
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, -10, 20, -1));

        Cerrar.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 20, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAMostrar.setBackground(new java.awt.Color(204, 204, 204));
        txtAMostrar.setColumns(20);
        txtAMostrar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtAMostrar.setForeground(new java.awt.Color(0, 0, 0));
        txtAMostrar.setRows(5);
        jScrollPane1.setViewportView(txtAMostrar);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 490, 510));

        EnviarTexto.setBackground(new java.awt.Color(51, 51, 51));
        EnviarTexto.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        EnviarTexto.setForeground(new java.awt.Color(255, 255, 255));
        EnviarTexto.setText("Enviar");
        EnviarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarTextoActionPerformed(evt);
            }
        });
        jPanel2.add(EnviarTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 80, 30));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtAEnviar.setBackground(new java.awt.Color(204, 204, 204));
        txtAEnviar.setColumns(20);
        txtAEnviar.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        txtAEnviar.setForeground(new java.awt.Color(0, 0, 0));
        txtAEnviar.setRows(5);
        jScrollPane2.setViewportView(txtAEnviar);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 400, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 520, 570));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usuario.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setText("Usuario Conectado:");
        jPanel3.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Información.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Información.setForeground(new java.awt.Color(255, 255, 255));
        Información.setText("Informacion");
        jPanel3.add(Información, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, -1));

        Leyenda.setFont(new java.awt.Font("Leelawadee UI", 2, 12)); // NOI18N
        Leyenda.setForeground(new java.awt.Color(255, 255, 255));
        Leyenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Leyenda.setText("Desarrollado por Matias Abregú - 2022®");
        jPanel3.add(Leyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 220, -1));

        IPU.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        IPU.setForeground(new java.awt.Color(255, 255, 255));
        IPU.setText("IP del Usuario: ");
        jPanel3.add(IPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        ConectarConUsuario.setBackground(new java.awt.Color(51, 51, 51));
        ConectarConUsuario.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        ConectarConUsuario.setForeground(new java.awt.Color(255, 255, 255));
        ConectarConUsuario.setText("Conectar");
        ConectarConUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConectarConUsuarioActionPerformed(evt);
            }
        });
        jPanel3.add(ConectarConUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, -1));

        IPConexion.setBackground(new java.awt.Color(204, 204, 204));
        IPConexion.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        IPConexion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(IPConexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 200, -1));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresar IP del Usuario a Conectar:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        MouseX = evt.getX();
        MouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - MouseX, y - MouseY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void ConectarConUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConectarConUsuarioActionPerformed

        if(IPConexion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese una IP por favor. \nRecuerde que la IP tiene 4 partes.");
        } else {
            JOptionPane.showMessageDialog(null, "Conectado a: " + IPConexion.getText());
            
            paqueteEnviarS.setIP(IPConexion.getText());
            paqueteEnviarS.setUsuario(vs.usuario);
            paqueteEnviarS.setVerificacion("Conectado");
        }
    }//GEN-LAST:event_ConectarConUsuarioActionPerformed

    private void EnviarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarTextoActionPerformed
        
        if(txtAEnviar.getText().equals("")){
            
        } else {
            
            txtAMostrar.append("Yo: " + txtAEnviar.getText() + "\n");
            
            try {
                
                Socket socketEnv = new Socket("192.168.68.108", 9999);
                
                paqueteEnviarS.setMensaje(txtAEnviar.getText());
                
                ObjectOutputStream mensaje_salida = new ObjectOutputStream(socketEnv.getOutputStream());
                
                mensaje_salida.writeObject(paqueteEnviarS);
                
                socketEnv.close();
                
                
                txtAEnviar.setText("");
                
            } catch (IOException ex) {
                
            }
            
            
        }
    }//GEN-LAST:event_EnviarTextoActionPerformed

    class HiloC extends Thread{
        
        @Override
        public void run(){
         
            try {
                
                ServerSocket sc = new ServerSocket(9070);
                
                while(true){
                    
                    Socket aceptarMensajes = sc.accept();
                    
                   ObjectInputStream mensajeLeer = new ObjectInputStream(aceptarMensajes.getInputStream());
                   
                   paqueteRecibirS = (PaqueteAEnviar) mensajeLeer.readObject();
                   
                   txtAMostrar.append(paqueteRecibirS.getUsuario() + ": " + paqueteRecibirS.getMensaje() + "\n");
                                 
                   sc.close();
                   
                   aceptarMensajes.close();
                }
                
            } catch (Exception e) {
            }
            
            
        }
    }
    
    class EnviarIP extends WindowAdapter {

        @Override
        public void windowOpened(WindowEvent e) {        
            
            try {         
                
                Socket ConexionConElServidor = new Socket("192.168.68.108", 9999);
                PaqueteAEnviar paqueteEnvio = new PaqueteAEnviar();  
                PaqueteAEnviar paqueteRecibido = new PaqueteAEnviar();
                
                paqueteEnvio.setVerificacion("Desconectado");
                
                ObjectOutputStream paquete_salida = new ObjectOutputStream(ConexionConElServidor.getOutputStream());
                
                paquete_salida.writeObject(paqueteEnvio);
                
                ConexionConElServidor.close();
                
                ServerSocket RecibirIP = new ServerSocket(9090);
                
                Socket Aceptar = RecibirIP.accept();
                
                ObjectInputStream leer_paquete = new ObjectInputStream(Aceptar.getInputStream());
                
                try {
                    
                    paqueteRecibido = (PaqueteAEnviar) leer_paquete.readObject();
                    
                    IPU.setText("IP del Usuario: " + paqueteRecibido.getIP());
                    
                } catch (ClassNotFoundException ex) {
                    
                }
                
                RecibirIP.close();
                
            } catch (IOException ex) {

                System.out.println("Error en el socket: " + ex);
                
            }  
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JButton ConectarConUsuario;
    private javax.swing.JButton EnviarTexto;
    private javax.swing.JTextField IPConexion;
    private javax.swing.JLabel IPU;
    private javax.swing.JLabel Información;
    private javax.swing.JLabel Leyenda;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAEnviar;
    private javax.swing.JTextArea txtAMostrar;
    // End of variables declaration//GEN-END:variables
}
