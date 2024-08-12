/**
 *
 * @author Diana
 */

package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class Utilidademail {
    
    String asunto;
    String mensaje;
    String destinario;
    String ruta;

    public Utilidademail() {
    }

    public Utilidademail(String asunto, String mensaje, String destinario, String ruta) {
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.destinario = destinario;
        this.ruta = ruta;
    }

    public Utilidademail(String asunto, String mensaje, String destinario) {
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.destinario = destinario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getDestinario() {
        return destinario;
    }

    public void setDestinario(String destinario) {
        this.destinario = destinario;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    /*public Boolean email(){
        try {
            Email email = new SimpleEmail();
            email.setHostName("smtp.hostinger.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator("noreply@reynaldomd.com","2023-Dam-Online"));
            email.setSSLOnConnect(true);
            email.setCharset("UTF-8");
            email.setSubject(this.asunto);
            email.setMsg(this.mensaje);
            email.addTo(this.destinario);
            email.send();
            return true;
        } catch (EmailException ex) {
            Logger.getLogger(Utilidademail.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }*/
    
    public Boolean enviarmail(){
        try {
            EmailAttachment fichero = new EmailAttachment();
            fichero.setPath(this.ruta);
            fichero.setDisposition(EmailAttachment.ATTACHMENT);
            fichero.setDescription("Recomendaciones");
            
            MultiPartEmail email = new MultiPartEmail();
            email.setHostName("smtp.hostinger.com");
            email.setAuthenticator(new DefaultAuthenticator("noreply@reynaldomd.com","2023-Online"));
            email.setSmtpPort(465);     
            email.setSSLOnConnect(true);
            email.setCharset("UTF-8");
            email.addTo(this.destinario);
            email.setFrom("noreply@reynaldomd.com","RESULTADOS");
            email.setSubject(this.asunto);
            email.setMsg(this.mensaje);
            email.attach(fichero);
            email.send();
            return true;
        } catch (EmailException ex) {
            Logger.getLogger(Utilidademail.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    };
    
    
    
}//final
