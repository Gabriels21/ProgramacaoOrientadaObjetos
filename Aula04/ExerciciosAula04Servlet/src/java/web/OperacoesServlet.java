/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fatec
 */
@WebServlet(name = "OperacoesServlet", urlPatterns = {"/operacoes.html"})
public class OperacoesServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OperacoesServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            double n1 = 2.0, n2 = 2.0;
            int op = 1;
            try{
                n1= Double.parseDouble(request.getParameter("n1"));
                n2 =Double.parseDouble(request.getParameter("n2"));
                op =Integer.parseInt(request.getParameter("op"));
            }catch(Exception ex){
                out.println("<div style='color:red'>" + "Parâmetro inválido!" + "</div>");
            }
            
            out.println("<a href='index.html'>Voltar</a>");
            
            out.println("<h1>Servlet OperacoesServlet at " + request.getContextPath() + "</h1>");
            
            out.println("<h2>Operações</h2>" +
"        <form action='operacoes.html'>" +
"        <input type='number' name='n1' value='"+n1+"' step='0.1'>" +
"        <input type='number' name='n2' value='"+n2+"' step='0.1'>" +
"        " +
"        <br>" +
"        Soma <input type='radio' name='op' value='1'>" +
"        <br>" +
"        Subtração <input type='radio' name='op' value='2'>" +
"        <br>" +
"        Multiplicação <input type='radio' name='op' value='3'>" +
"        <br>" +
"        Divisão <input type='radio' name='op' value='4'>" +
"        <br>" +
"        " +
"        <input type='submit' name='calcular' value='Calcular'>" +
"        </form>");
            
            switch (op) {
                case 1:
                    out.println("<h2>"+n1+ " + "+ n2+ " = " + (n1 + n2) + "</h2>");
                    break;
                case 2:
                    out.println("<h2>"+n1+ " - "+ n2+ " = " + (n1 - n2) + "</h2>");
                    break;
                case 3:
                    out.println("<h2>"+n1+ " * "+ n2+ " = " + (n1 * n2) + "</h2>");
                    break;
                default:
                    out.println("<h2>"+n1+ " / "+ n2+ " = " + (n1 / n2) + "</h2>");
                    break;
            }
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
