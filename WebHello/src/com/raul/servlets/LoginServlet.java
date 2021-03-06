package com.raul.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name = "accionLoginServlet", urlPatterns = { "/accionLoginServlet" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = (String) request.getParameter("usuario");
		String pwd = (String) request.getParameter("clave");
		
		System.out.println("\t\tSERVLET-USUARIO: " + user);
		System.out.println("\t\tSERVLET-PASSWORD: " + pwd);
		
		String parametros = "?usuario="+user+"&clave="+pwd+"&nombre=Ra%20Antares&edad=21&telefono=60606060123";
		
		response.sendRedirect("datosPersonales.jsp"+parametros);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
