package model;
import include.Inversiones;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class ModeloInversiones extends conexion {
    public boolean CrearInversiones (Inversiones inversiones){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta =  "INSERT INTO inversiones (idinversiones, concepto, " +
                    "unidad_medida, cantidad, precio_unitario, " +
                   "subtotal_1, aportacion_propio, aportacion_financiacion, " +
                "subtotal_2, tiposInversiones_idtiposInversiones, datos_empresa_id_empresa, depreciacion_amortizacion) " +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        pst = getConection().prepareStatement(consulta);
        pst.setInt(1,inversiones.getIdinversiones());
        pst.setString(2,inversiones.getConcepto());
        pst.setString(3,inversiones.getUnidad_medida());
        pst.setInt(4,inversiones.getCantidad());
        pst.setDouble(5,inversiones.getPrecio_unitario());
        pst.setDouble(6,inversiones.getSubtotal_1());
        pst.setDouble(7,inversiones.getAportacion_propio());
        pst.setDouble(8,inversiones.getAportacion_financiacion());
        pst.setDouble(9,inversiones.getSubtotal_2());
        pst.setInt(10,inversiones.getTiposInversiones_idtiposInversiones());
        pst.setInt(11,inversiones.getDatos_empresa_id_empresa());
        pst.setInt(12,inversiones.getDepreciacion_amortizacion());

        if (pst.executeUpdate()== 1){
            flag = true;
        }
        }catch (Exception ex) {
        System.out.println(ex.getMessage());
    }finally {
            try {
                if (getConection() !=null) getConection().close();
                if (pst !=null) pst.close();
            }catch (Exception e) {
            }
        }

    return flag;
}

    public ArrayList<Inversiones> ObtenerInversiones(){
    ArrayList<Inversiones> inversiones = new ArrayList<Inversiones>();
    PreparedStatement pst=null;
    ResultSet rs = null;
    try {
        String consulta = "SELECT idinversiones, concepto, unidad_medida, " +
                "cantidad, precio_unitario, subtotal_1, " +
                "aportacion_propio, aportacion_financiacion, subtotal_2, tiposInversiones_idtiposInversiones, datos_empresa_id_empresa," +
                " depreciacion_amortizacion " + "FROM inversiones ";
        pst = getConection().prepareStatement(consulta);
        rs = pst.executeQuery();
        while (rs.next()) {
    inversiones.add(new Inversiones(rs.getInt("idinversiones"),
            rs.getString("concepto"),
            rs.getString("unidad_medida"),
            rs.getInt("cantidad"),
            rs.getDouble("precio_unitario"),
            rs.getDouble("subtotal_1"),
            rs.getDouble("aportacion_propio"),
            rs.getDouble("aportacion_financiacion"),
            rs.getDouble("subtotal_2"),
            rs.getInt("tiposinversiones_idtiposinversiones"),
            rs.getInt("datos_empresa_id_empresa"),
            rs.getInt("deprecicacion_amortizacion")));
        }
    }catch (Exception e) {
    }finally {
        try {
            if (getConection() !=null)getConection().close();
            if (pst !=null)pst.close();
            if (rs !=null)rs.close();
        }catch (Exception e) {
        }
    }
        return inversiones;
    }
    public ArrayList<Inversiones> ObtenerInversiones1(int idinversiones){
    ArrayList<Inversiones> inversiones = new ArrayList<Inversiones>();
    PreparedStatement pst = null;
    ResultSet rs=null;
    try {
        String consulta = "SELECT idinversiones, concepto, unidad_medida, " +
                "cantidad, precio_unitario, subtotal_1, " +
                "aportacion_propio, aportacion_financiacion, subtotal_2, tiposInversiones_idtiposInversiones, datos_empresa_id_empresa," +
               " depreciacion_amortizacion "  +
                "FROM inversiones WHERE idinversiones = ?";
        pst=getConection().prepareCall(consulta);
        pst.setInt(1,idinversiones);
        rs = pst.executeQuery();
        while (rs.next()){
            inversiones.add(new Inversiones(rs.getInt("idinversiones"),
                    rs.getString("concepto"),
                    rs.getString("unidad_medida"),
                    rs.getInt("cantidad"),
                    rs.getDouble("precio_unitario"),
                    rs.getDouble("subtotal_1"),
                    rs.getDouble("aportacion_propio"),
                    rs.getDouble("aportacion_financiacion"),
                    rs.getDouble("subtotal_2"),
                    rs.getInt("tiposinversiones_idtiposinversiones"),
                    rs.getInt("datos_empresa_id_empresa"),
                    rs.getInt("depreciacion_amortizacion")));
        }
    }catch (Exception e){
        System.out.println(e.getMessage());
    }finally {
        try {
            if (getConection() !=null)getConection().close();
            if (pst !=null)pst.close();
            if (rs !=null)rs.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    return inversiones;
    }
    public boolean ActualizarInversiones(Inversiones inversiones){
    PreparedStatement pst=null;
    boolean flag= false;
    try {
        String consulta = "UPDATE idinversiones SET inversiones = ?, concepto = ?, " +
                "unidad_medida = ?, cantidad = ?, precio_unitario = ?, " +
                "subtotal_1 = ?, aportacion_propio = ?, aportacion_financiacion = ?, " +
                "subtotal_2 = ?, tiposInversiones_idtiposInversiones = ?, datos_empresa_id_empresa = ?," +
                "depreciacion_amortizacion = ? WHERE concepto = ?";
        pst = getConection().prepareStatement(consulta);
        pst.setInt(1,inversiones.getIdinversiones());
        pst.setString(2,inversiones.getConcepto());
        pst.setString(3,inversiones.getUnidad_medida());
        pst.setInt(4, inversiones.getCantidad());
        pst.setDouble(5, inversiones.getPrecio_unitario());
        pst.setDouble(6, inversiones.getSubtotal_1());
        pst.setDouble(7, inversiones.getAportacion_propio());
        pst.setDouble(8, inversiones.getAportacion_financiacion());
        pst.setDouble(9, inversiones.getSubtotal_2());
        pst.setInt(10, inversiones.getTiposInversiones_idtiposInversiones());
        pst.setInt(11, inversiones.getDatos_empresa_id_empresa());
        pst.setInt(12,inversiones.getDepreciacion_amortizacion());

        if(pst.executeUpdate() == 1){
            flag = true;
        }

    } catch (Exception ex){
        System.out.println(ex.getMessage());
    } finally {
        try {
            if (getConection() != null) getConection().close();
            if (pst != null) pst.close();
        } catch (Exception a) {
            System.out.println(a.getMessage());
       }
    }
        return flag;
    }
    public boolean BorrarInversiones(int idinversiones){
        PreparedStatement pst = null;
        boolean flag = false;
        try{
            String consulta = "DELETE FROM inversiones WHERE idinversiones = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,idinversiones);


            if(pst.executeUpdate() == 1){
                flag = true;
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return flag;
    }
}