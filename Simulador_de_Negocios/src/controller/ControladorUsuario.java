package controller;

import include.Usuario;
import model.ModeloTiposInversiones;
import model.ModeloUsuarios;

import java.util.ArrayList;
public class ControladorUsuario {
    public ArrayList<Usuario> obtenerUsuarios() {
        ModeloUsuarios usuario = new ModeloUsuarios();
        return usuario.obtenerUsuarios();
    }

    public ArrayList<Usuario> obtenerUsuario(int idusuario) {
        ModeloUsuarios usuarios = new ModeloUsuarios();
        return usuarios.obtenerUsuario(idusuario);
    }
    public static void main (String[]args){
        ControladorUsuario cu= new ControladorUsuario();

        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios= cu.obtenerUsuarios();
        for (int a=0; a<usuarios.size(); a++){
            System.out.println("idusuario: " + usuarios.get(a).getIdusuario());
            System.out.println("usuario: " + usuarios.get(a).getUsuario());
            System.out.println("password:" + usuarios.get(a).getPassword());
            System.out.println();
        }
    }
}

