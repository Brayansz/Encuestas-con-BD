/**
 *
 * @author Diana
 */

package modelo;

public class Usuario {
    
    protected String nombre;
    protected String apellidos;
    protected String usuario;
    protected String contrasena;

    public Usuario(String nombre, String apellidos, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
