/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package api;

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
@WebServlet(name = "GabrielApiXmlServlet", urlPatterns = {"/Gabriel-dados.xml"})
public class GabrielApiXmlServlet extends HttpServlet {

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
        if (request.getRequestURI().endsWith("/Gabriel-dados.xml")) {
            processXMLRequest(request, response);
        }
        
    }
    
    protected void processXMLRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/xml;charset=UTF-8");
        response.getWriter().println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        response.getWriter().println("<server>");
        response.getWriter().println("RA: 1290482112002");
        response.getWriter().println("Nome: Gabriel dos Santos Santana");
        response.getWriter().println("<disciplina");
        response.getWriter().println("<materia>POO</materia>");
        response.getWriter().println("<materia>Metodologia</materia>");
        response.getWriter().println("<materia>Engenharia de Software 3</materia>");
        response.getWriter().println("<materia>Banco de Dados</materia>");
        response.getWriter().println("<materia>SO2</materia>");
        response.getWriter().println("<materia>Inglês</materia>");
        response.getWriter().println("<materia>LP4</materia>");
        response.getWriter().println("</disciplina");
        response.getWriter().println("</server>");
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
