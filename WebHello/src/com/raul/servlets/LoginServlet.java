package com.raul.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.raul.database.PersonalData;
import com.raul.database.jdbc.DAO_ImplJDBC;

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
		
		
		DAO_ImplJDBC dao = new DAO_ImplJDBC();
		PersonalData pd = dao.getInfo(user, pwd);
		System.out.println(pd);
		String parametros = "";
		if(pd!=null){
			parametros += "id=" + pd.getId() + "&";
			parametros += "usuario=" + pd.getUsuario() + "&";
			parametros += "clave=" + pd.getClave() + "&";
			parametros += "nombre=" + pd.getNombre() + "&";
			parametros += "edad=" + pd.getEdad() + "&";
			parametros += "telefono=" + pd.getTelefono();
		}else{
			parametros += "id=NOT FOUND&";
			parametros += "usuario=NOT FOUND&";
			parametros += "clave=NOT FOUND&";
			parametros += "nombre=NOT FOUND&";
			parametros += "edad=NOT FOUND&";
			parametros += "telefono=NOT FOUND";
		}
		response.sendRedirect("datosPersonales.jsp"+ "?" +parametros);
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
