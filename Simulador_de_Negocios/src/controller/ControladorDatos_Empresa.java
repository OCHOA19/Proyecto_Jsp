package controller;
import include.Datos_Empresa;
import model.ModeloDatos_Empresa;
import java.util.ArrayList;
public class ControladorDatos_Empresa {
    public ArrayList<Datos_Empresa> obtenerDatos_Empresas() {
        ModeloDatos_Empresa datos_empresa = new ModeloDatos_Empresa();
        return datos_empresa.obtenerDatos_Empresas();
    }

    public ArrayList<Datos_Empresa> obtenerDatos_Empresa(int id_empresa) {
        ModeloDatos_Empresa datos_empresa = new ModeloDatos_Empresa();
        return datos_empresa.obtenerDatos_Empresa(id_empresa);
    }
    public static void main (String[]args){
        ControladorDatos_Empresa cde= new ControladorDatos_Empresa();

        ArrayList<Datos_Empresa> datos_empresas = new ArrayList<Datos_Empresa>();
        datos_empresas= cde.obtenerDatos_Empresas();
        for (int a=0; a<datos_empresas.size(); a++){
            System.out.println("id_empresa: " + datos_empresas.get(a).getId_empresa());
            System.out.println("usuario_idusuario: " + datos_empresas.get(a).getUsuario_idusuario());
            System.out.println("nombre_empresa: " + datos_empresas.get(a).getNombre_empresa());
            System.out.println();
        }
    }
}

