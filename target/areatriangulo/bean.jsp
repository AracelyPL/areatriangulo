<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="areaTriangulo.Informatica.servletArea"%>
<!DOCTYPE html>
<html>
    <body>
        <% 
          String b = request.getParameter("base");
          String a = request.getParameter("altura");

          areaTriangulo tri = new areaTriangulo(a, b);
          tri.obtenerArea();
          int area = tri.getArea();
        %>
        <%=area%>
    </body>

</html>