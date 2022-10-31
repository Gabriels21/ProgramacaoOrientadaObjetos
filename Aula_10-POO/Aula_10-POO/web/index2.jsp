<%-- 
    Document   : index2
    Created on : 31 de out de 2022, 14:15:46
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
        <h1>JSP Expressions</h1>
       
        <!-- Exemplo de expressions, só pode ser colocado algum comando que retorna um valor que não pode ser void -->
        <h2>Agora: <%= new Date()%></h2>
        
    </body>
</html>
