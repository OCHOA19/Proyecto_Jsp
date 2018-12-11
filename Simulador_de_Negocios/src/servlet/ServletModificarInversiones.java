package servlet;
import controller.ControladorInversiones;
import include.Inversiones;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletModificarInversiones")
public class ServletModificarInversiones extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String concepto = request.getParameter("concepto");
        String unidad_medida = request.getParameter("unidad_medida");


        int idinversiones = 0;
        int cantidad = 0;
        int tiposInversiones_idtiposInversiones = 0;
        int datos_empresa_id_empresa = 0;
        int depreciacion_amortizacion = 0;

        Double precio_unitario = .0;
        Double subtotal_1 = .0;
        Double aportacion_propio = .0;
        Double aportacion_financiacion = .0;
        Double subtotal_2 = .0;

        try {
            idinversiones = Integer.parseInt(request.getParameter("idinversiones"));

        } catch (NumberFormatException e) {

        }

        Inversiones inversiones = new Inversiones(idinversiones, concepto, unidad_medida, cantidad, precio_unitario, subtotal_1, aportacion_propio,
                aportacion_financiacion, subtotal_2, tiposInversiones_idtiposInversiones, datos_empresa_id_empresa, depreciacion_amortizacion);

        ControladorInversiones ci = new ControladorInversiones();
        if (ci.AgregarInversiones(inversiones)) {
            response.sendRedirect("inversiones.jsp");
        } else {
            response.sendRedirect("m_inversiones.jsp?idinversiones=" + 2);
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
