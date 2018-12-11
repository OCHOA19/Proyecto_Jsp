package model;

import include.TiposInversiones;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloTiposInversiones extends conexion {
    public ArrayList<TiposInversiones> obtenerTiposInversiones() {
        ArrayList<TiposInversiones> tiposInversiones = new ArrayList<TiposInversiones>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT idtiposInversiones, concepto FROM tiposInversiones";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                tiposInversiones.add(new TiposInversiones(rs.getInt("idtiposInversiones"),
                        rs.getString("concepto")));
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
        return tiposInversiones;
    }

    public ArrayList<TiposInversiones> obtenerTiposInversion(int idtiposInversiones) {
        ArrayList<TiposInversiones> tiposInversiones = new ArrayList<TiposInversiones>();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String consulta = "SELECT idtiposInversiones, concepto FROM tiposInversiones WHERE idtiposInversiones=?";
            pst = getConection().prepareCall(consulta);
            pst.setInt(1, idtiposInversiones);
            rs = pst.executeQuery();
            while (rs.next()) {
                tiposInversiones.add(new TiposInversiones(rs.getInt("idtiposInversiones"),
                        rs.getString("concepto")));
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
        return tiposInversiones;
    }
}
