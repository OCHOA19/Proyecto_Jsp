<%@ page import="controller.ControladorInversiones" %>
<%@ page import="include.Inversiones" %>
<%@ page import="java.util.ArrayList" %>
<jsp:include page='views/header.jsp'></jsp:include>
<%

    int idinversiones = 0;
    try {
        idinversiones = Integer.parseInt(request.getParameter("idinversiones"));
    }catch (NumberFormatException e){

    }
    ControladorInversiones ci = new ControladorInversiones();
    if(ci.eliminarInversiones(idinversiones)){

    }
    ArrayList<Inversiones> inversiones = new ArrayList<Inversiones>();
    inversiones = ci.ObtenerInversiones(idinversiones);
%>

<div class="container">
    <form class="col s12" action="/modificarinversiones" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <p class="center login-form-text">Modificar Inversiones</p>
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8 center">
                <input id="idinversiones" name="idinversiones" type="text" value="<% out.print(inversiones.get(0).getIdinversiones()); %>">
                <label for="idinversiones" class="center-align">ID INVERSIONES</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="concepto" name="concepto" type="text" value="<% out.print(inversiones.get(0).getConcepto()); %>">
                <label for="concepto" class="center-align">Concepto</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="unidad_medida" name="unidad_medida" type="text" value="<% out.print(inversiones.get(0).getUnidad_medida()); %>">
                <label for="unidad_medida" class="center-align">Unidad Meidida</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="cantidad" name="cantidad" type="text" readonly="readonly" value="<% out.print(inversiones.get(0).getCantidad()); %>">
                <label for="cantidad" class="center-align">Cantidad</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="precio_unitario" name="precio_unitario" type="text" value="<% out.print(inversiones.get(0).getPrecio_unitario()); %>" >
                <label for="precio_unitario" class="center-align">Precio Unitario</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="subtotal_1" name="subtotal_1" type="text" value="<% out.print(inversiones.get(0).getSubtotal_1()); %>">
                <label for="subtotal_1" class="center-align">Subtotal 1</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="aportacion_propio" name="aportacion_propio" type="text" value="<% out.print(inversiones.get(0).getAportacion_propio()); %>">
                <label for="aportacion_propio" class="center-align">Aportacion Propio</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="aportacion_financiacion" name="aportacion_financiacion" type="text" value="<% out.print(inversiones.get(0).getAportacion_financiacion()); %>">
                <label for="aportacion_financiacion" class="center-align">Aportacion Financiacion</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">
            </div>
            <div class="input-field col s8">
                <input id="subtotal_2" name="subtotal_2" type="text" value="<% out.print(inversiones.get(0).getSubtotal_2()); %>">
                <label for="subtotal_2" class="center-align">Subtotal 2</label>
            </div>
            <div class="col s2">

            </div>
        </div>

        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="tiposInversiones_idtiposInversiones" name="tiposInversiones_idtiposInversiones" type="text" value="<% out.print(inversiones.get(0).getTiposInversiones_idtiposInversiones()); %>">
                <label for="tiposInversiones_idtiposInversiones" class="center-align">Tipos Inversiones</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="datos_empresa_id_empresa" name="datos_empresa_id_empresa" type="text" value="<% out.print(inversiones.get(0).getDatos_empresa_id_empresa()); %>">
                <label for="datos_empresa_id_empresa" class="center-align">Datos Empresa Id Empresa</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="depreciacion_amortizacion" name="depreciacion_amortizacion" type="text" value="<% out.print(inversiones.get(0).getDepreciacion_amortizacion()); %>">
                <label for="datos_empresa_id_empresa" class="center-align">Depreciacion Amortizacion</label>

            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input type="submit" value="Actualizar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s6">
                <a class="btn col s6" href="inversiones.jsp">Regresar</a>
            </div>
            <div class="col s2">

            </div>
        </div>
    </form>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>