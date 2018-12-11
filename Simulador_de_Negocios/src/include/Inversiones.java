package include;

public class Inversiones {
    private int idinversiones;
    private String concepto;
    private String unidad_medida;
    private int cantidad;
    private Double precio_unitario;
    private Double subtotal_1;
    private Double aportacion_propio;
    private Double aportacion_financiacion;
    private Double subtotal_2;
    private int tiposInversiones_idtiposInversiones;
    private int datos_empresa_id_empresa;
    private int depreciacion_amortizacion;

    public Inversiones(int idinversiones, String concepto, String unidad_medida, int cantidad, Double precio_unitario, Double subtotal_1, Double aportacion_propio,
                       Double aportacion_financiacion, Double subtotal_2, int tiposInversiones_idtiposInversiones,
                      int datos_empresa_id_empresa, int depreciacion_amortizacion) {
        this.idinversiones = idinversiones;
        this.concepto = concepto;
        this.unidad_medida = unidad_medida;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.subtotal_1 = subtotal_1;
        this.aportacion_propio = aportacion_propio;
        this.aportacion_financiacion = aportacion_financiacion;
        this.subtotal_2 = subtotal_2;
        this.tiposInversiones_idtiposInversiones = tiposInversiones_idtiposInversiones;
        this.datos_empresa_id_empresa = datos_empresa_id_empresa;
        this.depreciacion_amortizacion = depreciacion_amortizacion;
    }

    public int getIdinversiones() {
        return idinversiones;
    }

    public void setIdinversiones(int idinversiones) {
        this.idinversiones = idinversiones;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(Double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public Double getSubtotal_1() {
        return subtotal_1;
    }

    public void setSubtotal_1(Double subtotal_1) {
        this.subtotal_1 = subtotal_1;
    }

    public Double getAportacion_propio() {
        return aportacion_propio;
    }

    public void setAportacion_propio(Double aportacion_propio) {
        this.aportacion_propio = aportacion_propio;
    }

    public Double getAportacion_financiacion() {
        return aportacion_financiacion;
    }

    public void setAportacion_financiacion(Double aportacion_financiacion) {
        this.aportacion_financiacion = aportacion_financiacion;
    }

    public Double getSubtotal_2() {
        return subtotal_2;
    }

    public void setSubtotal_2(Double subtotal_2) {
        this.subtotal_2 = subtotal_2;
    }

    public int getTiposInversiones_idtiposInversiones() {
        return tiposInversiones_idtiposInversiones;
    }

    public void setTiposInversiones_idtiposInversiones(int tiposInversiones_idtiposInversiones) {
        this.tiposInversiones_idtiposInversiones = tiposInversiones_idtiposInversiones;
    }

    public int getDatos_empresa_id_empresa() {
        return datos_empresa_id_empresa;
    }

    public void setDatos_empresa_id_empresa(int datos_empresa_id_empresa) {
        this.datos_empresa_id_empresa = datos_empresa_id_empresa;
    }

    public int getDepreciacion_amortizacion() {
        return depreciacion_amortizacion;
    }

    public void setDepreciacion_amortizacion(int depreciacion_amortizacion) {
        this.depreciacion_amortizacion = depreciacion_amortizacion;
    }
}
