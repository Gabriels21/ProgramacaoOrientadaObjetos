<%-- 
    Document   : Exemplo
    Created on : 31 de out de 2022, 14:01:37
    Author     : Fatec
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>JSP Scriplet</h1>
        
        <!-- Exemplo de scriplet -->
        <%     
        Date atual = new Date();
        out.println("<h1> Agora: " + atual + "</h1>");
        %>
        
    </body>
</html>
