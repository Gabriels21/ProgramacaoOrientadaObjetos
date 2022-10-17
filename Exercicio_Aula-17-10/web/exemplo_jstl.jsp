<%-- 
    Document   : exemplo_jstl
    Created on : 17 de out de 2022, 14:45:31
    Author     : Fatec
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file = "/WEB-INF/jspf/exemplo_jspf.jspf"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL</title>
    </head>
    <body>
        <jsp:useBean id="dataHora" class="java.util.Date"/>
        <h1>JSTL</h1>
        
        <br>
Data Curta: <fmt:formatDate value="${dataHora}" />
<br>
Data Longa: <fmt:formatDate value="${dataHora}" dateStyle="full"/>
    </body>
</html>

<!-- biblioteca de tags (cada tag realiza um tipo de processamento equivalente ao código Java dentro do JSP) que podem ser utilizadas dentro de uma página JSP-->
