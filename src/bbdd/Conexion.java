/**
 *
 * @author Diana
 */

package bbdd;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Formulario;
import modelo.Usuario;

public class Conexion {

    static Connection conn;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    public static void conectar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://145.14.151.1/u812167471_richmond", "u812167471_richmond", "2023-Dam-Online");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static boolean acceder(String user, String pass) {

        String SQL = "SELECT usuario,contrasena FROM usuarios WHERE usuario=? AND contrasena =?";
        PreparedStatement pst;
        ResultSet rs;

        try {
            pst = conn.prepareStatement(SQL);
            pst.setString(1, user);
            pst.setString(2, pass);
            rs = pst.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void cerrarconexion() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static boolean registrarusuario(Usuario o) {

        String consulta = "INSERT INTO usuarios (nombre, apellidos, usuario, contrasena) VALUES (?,?,?,?)";

        try {
            PreparedStatement pst = conn.prepareStatement(consulta);
            pst.setString(1, o.getNombre());
            pst.setString(2, o.getApellidos());
            pst.setString(3, o.getUsuario());
            pst.setString(4, o.getContrasena());
            pst.executeUpdate();
            pst.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static int bajam(){
        int numalta = 0;
        String consulta = "SELECT count(idFormulario) FROM formulario WHERE q1+q2+q3+q4<4";
        try (Statement st = (Statement) conn.createStatement()) {
            ResultSet rs = st.executeQuery(consulta);
            if(rs.next()){
                numalta = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numalta;
    }
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static int dudosam(){
        int numalta = 0;
        String consulta = "SELECT count(idFormulario) FROM formulario WHERE q1+q2+q3+q4>3 and q1+q2+q3+q4<6";
        try (Statement st = (Statement) conn.createStatement()) {
            ResultSet rs = st.executeQuery(consulta);
            if(rs.next()){
                numalta = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numalta;
    }
    
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    
    public static int moderadam(){
        int numalta = 0;
        String consulta = "SELECT count(idFormulario) FROM formulario WHERE q1+q2+q3+q4>=6 and q1+q2+q3+q4<6";
        try (Statement st = (Statement) conn.createStatement()) {
            ResultSet rs = st.executeQuery(consulta);
            if(rs.next()){
                numalta = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numalta;
    }
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    
    public static int altam(){
        int numalta = 0;
        String consulta = "SELECT count(idFormulario) FROM formulario WHERE q1+q2+q3+q4>=8";
        try (Statement st = (Statement) conn.createStatement()) {
            ResultSet rs = st.executeQuery(consulta);
            if(rs.next()){
                numalta = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numalta;
    }
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
    public static int contarf(){
        int numencuestas = 0;
        String consulta = "SELECT * FROM formulario";
        try (Statement st = (Statement) conn.createStatement()) {
            ResultSet rs = st.executeQuery(consulta);
            if(rs.next()){
                numencuestas = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numencuestas;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static boolean rformulario(Formulario encuesta){
        String consulta = "INSERT into formulario (q1,q2,q3,q4, encuestador) values (?,?,?,?,?)";
        
        try {
            PreparedStatement st = conn.prepareStatement(consulta);
            st.setInt(1, encuesta.getQuno());
            st.setInt(2, encuesta.getQdos());
            st.setInt(3, encuesta.getQtres());
            st.setInt(4, encuesta.getQcuatro());
            st.setString(5, encuesta.getEncuestador());
            st.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
    
}//cerrar
