package model;
import include.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class ModeloUsuarios extends conexion{
    public ArrayList<Usuario> obtenerUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT idusuario, usuario, password FROM usuario";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                usuarios.add(new Usuario(rs.getInt("idusuario"),
                        rs.getString("usuario"),
                        rs.getString("password")));
            }
        } catch (Exception e) {
        } finally {

            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return usuarios;
    }

    public ArrayList<Usuario> obtenerUsuario(int idusuario) {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String consulta = "SELECT idusuario, usuario, password FROM usuario WHERE idusuario=?";
            pst = getConection().prepareCall(consulta);
            pst.setInt(1, idusuario);
            rs = pst.executeQuery();
            while (rs.next()) {
                usuarios.add(new Usuario(rs.getInt("idusuario"),
                        rs.getString("usuario"),
                        rs.getString("password")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return usuarios;
    }
}
