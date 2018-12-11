package model;

import include.Datos_Empresa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class ModeloDatos_Empresa extends conexion{
    public ArrayList<Datos_Empresa> obtenerDatos_Empresas() {
        ArrayList<Datos_Empresa> datos_empresas = new ArrayList<Datos_Empresa>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT id_empresa, usuario_idusuario, nombre_empresa FROM datos_empresa";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                datos_empresas.add(new Datos_Empresa(rs.getInt("id_empresa"),
                        rs.getInt("usuario_idusuario"),
                        rs.getString("nombre_empresa")));
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
        return datos_empresas;
    }

    public ArrayList<Datos_Empresa> obtenerDatos_Empresa(int id_empresa) {
        ArrayList<Datos_Empresa> datos_empresas = new ArrayList<Datos_Empresa>();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String consulta = "SELECT id_empresa, usuario_idusuario, nombre_empresa FROM datos_empresa WHERE id_empresa=?";
            pst = getConection().prepareCall(consulta);
            pst.setInt(1, id_empresa);
            rs = pst.executeQuery();
            while (rs.next()) {
                datos_empresas.add(new Datos_Empresa(rs.getInt("id_empresa"),
                        rs.getInt("usuario_idusuario"),
                        rs.getString("nombre_empresa")));
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
        return datos_empresas;
    }
}
