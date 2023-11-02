package com.pruebas.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistroDeUsuarios
 */
@WebServlet("/RegistroDeUsuarios")
public class RegistroDeUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroDeUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//envio una respuesta al usuario con la informacion que inserto en el form
		PrintWriter salida = response.getWriter();
		salida.println("<html><body>");
		// request.getParameter("nombredelinputAtributoName")
		salida.println("Nombre introducido " + request.getParameter("nombre"));
		salida.println("<br><br>");
		salida.println("Apellido introducido " + request.getParameter("apellido"));
		salida.println("<br><br>");
		salida.println("</body></html>");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//envio una respuesta al usuario con la informacion que inserto en el form
		
		// en el metodo post debemos indicar quetipo de contenido va a tener la respuesta
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		salida.println("<html><body>");
		// request.getParameter("nombredelinputAtributoName")
		salida.println("Nombre introducido " + request.getParameter("nombre"));
		salida.println("<br><br>");
		salida.println("Apellido introducido " + request.getParameter("apellido"));
		salida.println("<br><br>");
		salida.println("</body></html>");
	}

}
