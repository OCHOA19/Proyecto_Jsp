<%@page import="include.Inversiones" %>
<%@page import="include.Datos_Empresa" %>
<%@page import="include.Usuario" %>
<%@page import="controller.ControladorInversiones" %>
<%@page import="controller.ControladorTiposInversiones" %>
<%@page import="controller.ControladorDatos_Empresa" %>
<%@page import="controller.ControladorUsuario" %>
<%@page import="include.TiposInversiones" %>
<%@ page import="java.util.ArrayList" %>
<jsp:include page="views/header.jsp"></jsp:include>

<div class="container">
    <div class="row">
        <div class="input-field col s12 center">
           <h3 class="brown-text">INVERSIONES</h3>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <a class="btn" href="inversiones.jsp">Nuevo</a>
        </div>
    </div>
    <div class="row margin">
        <div class="col s12 center">
            <table class="striped">
                <thead>
                <tr>
                    <th>ID INVERSIONES</th>
                    <th>CONCEPTO</th>
                    <th>UNIDAD MEDIDA</th>
                    <th>CANTIDAD</th>
                    <th>PRECIO UNITARIO</th>
                    <th>SUBTOTAL 1</th>
                    <th>APORTACION PROPIO</th>
                    <th>APORTACION FINANCIACION</th>
                    <th>SUBTOTAL 2</th>
                    <th>TIPOS INVERSIONES ID TIPOS INVERSIONES</th>
                    <th>DATOS EMPRESA ID EMPRESA</th>
                    <th>DEPRECIACION AMORTIZACION</th>
                    <th></th>
                </tr>
                </thead>
                <%
                    String htmlcode = "<tbody>";
                    ControladorInversiones ci = new ControladorInversiones();
                    int contador = 0;
                    ArrayList<Inversiones> inversiones = new ArrayList<Inversiones>();
                    inversiones = ci.ObtenerInversiones();
                    if(inversiones.size() > 0){
                        for(int a=0; a<inversiones.size();a++){
                            htmlcode += "<tr><td>" + inversiones.get(a).getIdinversiones()
                                    + "</td><td>" + inversiones.get(a).getConcepto()
                                    + "</td><td>" + inversiones.get(a).getUnidad_medida()
                                    + "</td><td>" + inversiones.get(a).getCantidad()
                                    + "</td><td>" + inversiones.get(a).getPrecio_unitario()
                                    + "</td><td>" + inversiones.get(a).getSubtotal_1()
                                    + "</td><td>" + inversiones.get(a).getAportacion_propio()
                                    + "</td><td>" + inversiones.get(a).getAportacion_financiacion()
                                    + "</td><td>" + inversiones.get(a).getSubtotal_2()
                                    + "</td><td>" + inversiones.get(a).getTiposInversiones_idtiposInversiones()
                                    + "</td><td>" + inversiones.get(a).getDatos_empresa_id_empresa()
                                    + "</td><td>" + inversiones.get(a).getDepreciacion_amortizacion()
                                    + "<td><a class=\"btn\" href=\"#\"><i class=\"material-icons\">zoom_in</i></a>"
                                    + "<a class=\"btn blue\" href=\"m_datos.jsp?idinversiones="+inversiones.get(a).getIdinversiones()+"\"><i class=\"material-icons\">create</i></a>"
                                    + "<a class=\"btn red\" onclick=\"eliminarInversiones("+inversiones.get(a).getIdinversiones()+")\"><i class=\"material-icons\">delete</i></a>"
                                    + "</td></tr>";
                        }
                    } else{
                        htmlcode += "<tr><td colspan=\"10\">No existen Inversiones</td></tr>";
                    }
                    htmlcode += "</tbody>";

                    out.print(htmlcode);
                %>
            </table>
        </div>
    </div>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>
