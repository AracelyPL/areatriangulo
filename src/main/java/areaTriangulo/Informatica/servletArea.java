package areaTriangulo.Informatica;

import java.io.IOException;


import claseTriangulo.calcularArea;
import claseTriangulo.datosTriangulo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="servletArea", urlPatterns={ "/servlets/servletArea" })
public class servletArea extends HttpServlet
{
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {

    String operation = request.getParameter("operation");
    int base = Integer.parseInt(request.getParameter("base"));
    int altura = Integer.parseInt(request.getParameter("altura"));
    int result = 0;

    switch(operation)
    {
      case "AREA":
        calcularArea calcular = new calcularArea();
        datosTriangulo dtri = new datosTriangulo();

        dtri.setArea(calcular.obtenerAreaTriangulo(base, altura));

        request.setAttribute("Resultado", dtri);
        operation = "*";
        break;
    }

    request.getRequestDispatcher("../view/bean.jsp").forward(request, response);
  
  }
}