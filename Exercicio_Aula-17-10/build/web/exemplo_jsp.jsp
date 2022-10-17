<%-- 
    Document   : exemplo_jsp
    Created on : 17 de out de 2022, 13:58:00
    Author     : Fatec
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file = "/WEB-INF/jspf/exemplo_jspf.jspf"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <div class="container-fluid">
            
            <h1>Página JSP</h1><!-- Uma página JSP permite que você escreva HTML (estático) com códigos JSP embutidos nela fazendo com que a página possa se tornar dinâmica -->
            <br>
            <h3>Nome: Gabriel dos Santos Santana</h3>
            <br>
            <h4>Código JSP sendo utilizado:</h4><!-- Código JSP sendo utilizado para pegar o dia atual e exibir: -->
            <%
                int diaAtual = Integer.parseInt((new SimpleDateFormat("dd"))
                        .format(new Date()));
                out.println("<br>Hoje é dia" + diaAtual + "<br>");
            %>
        </div>
        <br>   
    </body>
</html>


