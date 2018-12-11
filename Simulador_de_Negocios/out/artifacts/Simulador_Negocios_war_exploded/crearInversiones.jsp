<%@ page import="include.Inversiones" %>
<%@ page import="controller.ControladorInversiones" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    String concepto = request.getParameter("concepto");
    String unidad_medida = request.getParameter("unidad_medida");;

    int idinversiones = 0;
    int cantidad = 0;
    int tiposInversiones_idtiposInversiones = 0;
    int datos_empresa_id_empresa =0;
    int depreciacion_amortizacion =0;

    Double precio_unitario = .0;
    Double subtotal_1 = .0;
    Double aportacion_propio = .0;
    Double aportacion_financiacion = .0;
    Double subtotal_2 = .0;

    try {
        idinversiones = Integer.parseInt(request.getParameter("idinversiones"));

    } catch (NumberFormatException e){

    }

    Inversiones inversiones = new Inversiones( idinversiones, concepto,unidad_medida, cantidad, precio_unitario,  subtotal_1,  aportacion_propio,
     aportacion_financiacion,  subtotal_2,  tiposInversiones_idtiposInversiones, datos_empresa_id_empresa,  depreciacion_amortizacion);

    ControladorInversiones ci = new ControladorInversiones();
    if(ci.AgregarInversiones(inversiones)) {
        response.sendRedirect("inversiones.jsp");
    } else {
        response.sendRedirect("a_inversiones.jsp");
    }
%>