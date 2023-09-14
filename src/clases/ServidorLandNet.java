package clases;

/**
 *
 * @author Matias Abregú
 */
import java.awt.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;

public class ServidorLandNet extends javax.swing.JFrame {

    private int MouseX, MouseY;
    
    public ServidorLandNet() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("LandNet - Servidor");

        jPanel1.setBackground(new Color(45, 45, 45));
        jPanel2.setBackground(new Color(35, 35, 35));
        
        jTextArea1.setEditable(false);
        
        Thread hilo = new Thread(new HiloS());
        hilo.start();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Leyenda = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Minimizar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 490));

        Leyenda.setFont(new java.awt.Font("Leelawadee UI", 2, 12)); // NOI18N
        Leyenda.setForeground(new java.awt.Color(255, 255, 255));
        Leyenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Leyenda.setText("Desarrollado por Matias Abregú - 2022®");
        jPanel1.add(Leyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 220, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, 520));

        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Minimizar.setBackground(new java.awt.Color(35, 35, 35));
        Minimizar.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        Minimizar.setForeground(new java.awt.Color(255, 255, 255));
        Minimizar.setText("_");
        Minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Minimizar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Minimizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizarMouseExited(evt);
            }
        });
        Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizarActionPerformed(evt);
            }
        });
        jPanel2.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 40, 30));

        Cerrar.setBackground(new java.awt.Color(35, 35, 35));
        Cerrar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarMouseExited(evt);
            }
        });
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jPanel2.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 40, 30));

        Titulo.setFont(new java.awt.Font("Leelawadee UI", 2, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Servidor de LandNet");
        jPanel2.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseEntered
        
    }//GEN-LAST:event_MinimizarMouseEntered

    private void MinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseExited
        
    }//GEN-LAST:event_MinimizarMouseExited

    private void MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizarActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MinimizarActionPerformed

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
        Cerrar.setBackground(new Color(165, 42, 42));
    }//GEN-LAST:event_CerrarMouseEntered

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        Cerrar.setBackground(new Color(35, 35, 35));
    }//GEN-LAST:event_CerrarMouseExited

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CerrarActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
       MouseX = evt.getX();
       MouseY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       
       this.setLocation(x - MouseX, y - MouseY);
    }//GEN-LAST:event_jPanel2MouseDragged

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ServidorLandNet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServidorLandNet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServidorLandNet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServidorLandNet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServidorLandNet().setVisible(true);
            }
        });
    }
    
    class HiloS extends Thread{
        
        @Override
        public void run(){
            
            try {
                ServerSocket serC = new ServerSocket(9999);
                PaqueteAEnviar paquete_recibido = new PaqueteAEnviar();
                PaqueteAEnviar paquete_envio = new PaqueteAEnviar();
                String nick, ip, mensaje, conexionMensaje;
                
                while(true){
                    
                    Socket conexion = serC.accept();
                    
                    ObjectInputStream recibir_paquete = new ObjectInputStream(conexion.getInputStream());
                    
                    paquete_recibido = (PaqueteAEnviar) recibir_paquete.readObject();
                
                    nick = paquete_recibido.getUsuario();
                    mensaje = paquete_recibido.getMensaje();
                    ip = paquete_recibido.getIP();
                    conexionMensaje = paquete_recibido.getVerificacion();
                    
                    if(conexionMensaje.equals("Conectado")){
                        
                        jTextArea1.append(nick + ": " + mensaje + " para " + ip + "\n");
                        
                        Socket socketEnvU2 = new Socket(ip, 9070);
                        
                        paquete_envio.setMensaje(mensaje);
                        paquete_envio.setUsuario(nick);
                        
                        ObjectOutputStream mensaje_salida = new ObjectOutputStream(socketEnvU2.getOutputStream());
                        
                        mensaje_salida.writeObject(paquete_envio);
                        
                        socketEnvU2.close();
                        
                    } else {
                        
                        
                        InetAddress obtenerIP = conexion.getInetAddress();
                        
                        String IPV4 = obtenerIP.getHostAddress();
                        
                        paquete_recibido.setIP(IPV4);
                        
                        System.out.println(IPV4);
                        
                        Socket enviaDestinatario = new Socket(IPV4, 9090);
                        
                        ObjectOutputStream enviar_paquete = new ObjectOutputStream(enviaDestinatario.getOutputStream());
                        
                        enviar_paquete.writeObject(paquete_recibido);
                        
                    }
                 
                    conexion.close();
                }
                
            } catch (Exception e) {
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JLabel Leyenda;
    private javax.swing.JButton Minimizar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
