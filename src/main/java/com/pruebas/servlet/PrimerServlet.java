package com.pruebas.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimerServlet
 */
@WebServlet("/PrimerServlet")
public class PrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PrimerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Especificamos formato de respuesta, lo recomendable es usar un JSP para
		// responder.
		PrintWriter salida = response.getWriter();
		// Generar respuesta de la peticion
		salida.println("<html><body>");
		salida.println("<h1 style='text-align:center'>PruebaServlet</h1>");
		salida.println("");
		salida.println("");
		salida.println("");
		salida.println("");
		salida.println("Fecha y hora actual: " + new Date());
		salida.println("</html></body>");
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
