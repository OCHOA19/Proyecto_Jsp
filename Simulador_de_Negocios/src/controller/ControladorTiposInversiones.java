package controller;

import include.TiposInversiones;
import model.ModeloTiposInversiones;
import java.util.ArrayList;
public class ControladorTiposInversiones  {
    public ArrayList<TiposInversiones> obtenerTiposInversiones() {
        ModeloTiposInversiones tiposInversiones = new ModeloTiposInversiones();
        return tiposInversiones.obtenerTiposInversiones();
    }

    public ArrayList<TiposInversiones> obtenerTiposInversion(int idtiposInversion) {
        ModeloTiposInversiones tiposInversiones = new ModeloTiposInversiones();
        return tiposInversiones.obtenerTiposInversion(idtiposInversion);
    }
    public static void main (String[]args){
        ControladorTiposInversiones cti= new ControladorTiposInversiones();

        ArrayList<TiposInversiones> tiposInversiones = new ArrayList<TiposInversiones>();
        tiposInversiones= cti.obtenerTiposInversiones();
        for (int a=0; a<tiposInversiones.size(); a++){
            System.out.println("idtiposInversiones: " + tiposInversiones.get(a).getIdtiposInversiones());
            System.out.println("concepto: " + tiposInversiones.get(a).getConcepto());
            System.out.println();
        }
    }
}


