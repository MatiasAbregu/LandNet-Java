package clases;

import java.io.Serializable;

/**
 *
 * @author Matias Abregú
 */
public class PaqueteAEnviar implements Serializable{

    private String Usuario, Mensaje, IP, Verificacion;

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getVerificacion() {
        return Verificacion;
    }

    public void setVerificacion(String Verificacion) {
        this.Verificacion = Verificacion;
    }
    
}
