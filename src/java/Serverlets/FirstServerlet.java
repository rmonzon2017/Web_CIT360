/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serverlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rafael.M
 */
@WebServlet(name = "FirstOperation", urlPatterns = {"/FirstOperation"})
public class FirstServerlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FirstServerlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FirstServerlet at " + request.getContextPath() + "</h1>");
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
       // processRequest(request, response);
       /*
     response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /*
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Test Get methods</title>");
            out.println("</head>");
            out.println("<body>");   
            out.println("This is a test from Get Method Serverlets\n");
             String cont = request.getParameter("country");
            out.println("\nYou selected this country: " + cont.toUpperCase());
            
            out.println("</body>");
            out.println("</html>");
        }
        
    }
*/
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
        //processRequest(request, response);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>My First Servelets with Java</title>");
            out.println("</head>");
            out.println("<body>");
         
           

            String num1 = request.getParameter("btntext1");
            String num2 = request.getParameter("btntext2");
            String btnsum = request.getParameter("btnsum");
            String btnrest = request.getParameter("btnrest");
            
            if (btnsum!=null) {
                 int result = Integer.parseInt(num1) + Integer.parseInt(num2);
            
            out.println("The Sum  is: " + result);

            }
                       
            if (btnrest!=null) {
                 int result = Integer.parseInt(num1) - Integer.parseInt(num2);
            
            out.println("The Sustraction  is: " + result);

            }
            
             
             String cont = request.getParameter("country");
            out.println(">>>>>>>>>>>>>>>>>>You selected this country: " + cont.toUpperCase());
            
            out.println("</body>");
            out.println("</html>");
        }
        
    }
        

}

/**
 * Returns a short description of the servlet.
 *
 * @return a String containing servlet description
 */
/*
@Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>*/


