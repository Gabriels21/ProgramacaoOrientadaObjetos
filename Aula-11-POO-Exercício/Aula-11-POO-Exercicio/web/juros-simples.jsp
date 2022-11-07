<%-- 
    Document   : juros-simples
    Created on : 7 de nov de 2022, 15:39:47
    Author     : Fatec
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP</title>
    </head>
    <body>
    
        <%@include file="WEB-INF/jspf/menu.jspf"%>
        <%@include file="WEB-INF/jspf/css.jspf"%>
        
        <%             
           String errorMessage = null;
           boolean hasParameterC = request.getParameter("C") != null;
           boolean hasParameterI = request.getParameter("i") != null;
           boolean hasParameterT = request.getParameter("t") != null;
           double C = 0, i = 0, t = 0, resultado = 0;
           try {
               C = Double.parseDouble(request.getParameter("C"));
               i = Double.parseDouble(request.getParameter("i"));
               t = Double.parseDouble(request.getParameter("t"));
               resultado = C * i * t;
           }catch (Exception ex) {
                errorMessage = ex.getMessage();
           }        
        %>
                 
        <div class="container-fluid">
            
            <h1>Juros Simples</h1>
            
            
            <% if (errorMessage != null) {%>
            <div style="color:red"><%= errorMessage%></div>
            <% } %>

            <% if (hasParameterC && hasParameterI && hasParameterT) {%>
            <%= C%> * <%= i%> * * <%= t%> = <%=resultado%>
            <% }%>

            <form>           
                <div class="input-group mb-3">                
                    <input type="number" name="C" class="form-control" placeholder="Montante" aria-label="Juros Simples">                
                </div>
                <div class="input-group mb-3">                
                    <input type="number" step="0.01" name="i" class="form-control" placeholder="Taxa de Juros %" aria-label="Juros Simples">                
                </div>
                <div class="input-group mb-3">                
                    <input type="number" name="t" class="form-control" placeholder="Montante" aria-label="Tempo">                      
                </div>
                <input type="submit" value="Calcular" class="btn btn-success">
            </form>
        </div>
            
    </body>
</html>