<%@ page import="controller.ControladorInversiones" %>
<%
    int idinversiones = 0;
    try {
        idinversiones = Integer.parseInt(request.getParameter("idinversiones"));
    }catch (NumberFormatException e){

    }
    ControladorInversiones ci = new ControladorInversiones();
    if(ci.eliminarInversiones(idinversiones)){
        response.sendRedirect("inversiones.jsp");
    } else {
        response.sendRedirect("index.jsp");
    }
%>