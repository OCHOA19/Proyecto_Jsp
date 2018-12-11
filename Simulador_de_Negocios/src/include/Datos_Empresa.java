package include;

public class Datos_Empresa {
    private int id_empresa;
    private int usuario_idusuario;
    private String nombre_empresa;

    public Datos_Empresa(int id_empresa, int usuario_idusuario, String nombre_empresa) {
        this.id_empresa = id_empresa;
        this.usuario_idusuario = usuario_idusuario;
        this.nombre_empresa = nombre_empresa;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public int getUsuario_idusuario() {
        return usuario_idusuario;
    }

    public void setUsuario_idusuario(int usuario_idusuario) {
        this.usuario_idusuario = usuario_idusuario;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }
}



