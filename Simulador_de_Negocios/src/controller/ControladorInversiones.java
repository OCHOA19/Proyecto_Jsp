package controller;
import include.Inversiones;
import model.ModeloInversiones;
import java.util.ArrayList;

public class ControladorInversiones {
    public boolean AgregarInversiones(Inversiones inversiones){
        ModeloInversiones inversiones1 = new ModeloInversiones();
        return inversiones1.CrearInversiones(inversiones);
    }

    public ArrayList<Inversiones> ObtenerInversiones(){
        ModeloInversiones inversiones = new ModeloInversiones();
        return inversiones.ObtenerInversiones();
    }

    public ArrayList<Inversiones> ObtenerInversiones(int idinversiones){
        ModeloInversiones inversiones = new ModeloInversiones();
        return inversiones.ObtenerInversiones1(idinversiones);
    }

    public boolean ActualizarInvrsiones(Inversiones inversiones){
        ModeloInversiones inversiones1 = new ModeloInversiones();
        return inversiones1.ActualizarInversiones(inversiones);
    }

    public boolean eliminarInversiones(int idinversiones) {
        ModeloInversiones inversiones1 = new ModeloInversiones();
        return inversiones1.BorrarInversiones(idinversiones);
    }


    public static void main(String[] args){

        ControladorInversiones ci = new ControladorInversiones();
       // System.out.println(ci.AgregarInversiones(new Inversiones(1,"abc","CUALESQUIERA",1,1.0,12.0,21.0,4.0,10.0,1,1,1)));

        //listar todos los elementos
      /*  ArrayList<Inversiones> inversiones = new ArrayList<Inversiones>();
        inversiones = ci.ObtenerInversiones();
        for (int a=0;a<inversiones.size();a++) {
            System.out.println("Idinversiones: " + inversiones.get(a).getIdinversiones());
            System.out.println("Concepto: " + inversiones.get(a).getConcepto());
            System.out.println("Unidad Medida: " + inversiones.get(a).getUnidad_medida());
            System.out.println("Cantidad: " + inversiones.get(a).getCantidad());
            System.out.println("Precio Unitario: " + inversiones.get(a).getPrecio_unitario());
            System.out.println("Subtotal 1: " + inversiones.get(a).getSubtotal_1());
            System.out.println("Aportacion Propio: " + inversiones.get(a).getAportacion_propio());
            System.out.println("Aportacion Financiero: " + inversiones.get(a).getAportacion_financiacion());
            System.out.println("Subtotal 2: " + inversiones.get(a).getSubtotal_2());
            System.out.println("Tipos Inversiones: " + inversiones.get(a).getTiposInversiones_idtiposInversiones());
            System.out.println("Datos Empresa ID EMPRESA: " + inversiones.get(a).getDatos_empresa_id_empresa());
            System.out.println("Depreciacion Amortizacion: " + inversiones.get(a).getDepreciacion_amortizacion());
            System.out.println();
        }

        //Listar un elemento de la tabla por su llave primaria
       ArrayList<Inversiones> inversiones1 = new ArrayList<Inversiones>();
        inversiones = ci.ObtenerInversiones();

        for (int b=0; b<inversiones.size();b++){
            System.out.println("Idinversiones: " + inversiones.get(b).getIdinversiones());
            System.out.println("Concepto: " + inversiones.get(b).getConcepto());
            System.out.println("Unidad Medida: " + inversiones.get(b).getUnidad_medida());
            System.out.println("Cantidad: " + inversiones.get(b).getCantidad());
            System.out.println("Precio Unitario: " + inversiones.get(b).getPrecio_unitario());
            System.out.println("Subtotal 1: " + inversiones.get(b).getSubtotal_1());
            System.out.println("Aportacion Propio: " + inversiones.get(b).getAportacion_propio());
            System.out.println("Aportacion Financiero: " + inversiones.get(b).getAportacion_financiacion());
            System.out.println("Subtotal 2: " + inversiones.get(b).getSubtotal_2());
            System.out.println("Tipos Inversiones: " + inversiones.get(b).getTiposInversiones_idtiposInversiones());
            System.out.println("Datos Empresa ID EMPRESA: " + inversiones.get(b).getDatos_empresa_id_empresa());
            System.out.println("Depreciacion Amortizacion: " + inversiones.get(b).getDepreciacion_amortizacion());
            System.out.println();
        }
        //Modificar un elemento
        System.out.println(ci.ActualizarInvrsiones(new Inversiones(2,"CDA","CUALESQUIERAS",2,2.0,11.0,11.0,5.0,11.0, 3,2,4)));

        //modificar un elemento

        System.out.println(ci.eliminarInversiones(2));*/
    }
}