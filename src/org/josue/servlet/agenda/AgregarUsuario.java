package org.josue.servlet.agenda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.josue.controlador.ControladorUsuario;

public class AgregarUsuario extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		String usuario = req.getParameter("txtNick");
		String contrase�a = req.getParameter("txtContrasena");
		RequestDispatcher despachador=null;
		
		ControladorUsuario.getInstancia().Agregar(usuario, contrase�a);
		
		/*ControladorUsuario.getInstancia().getUsuario().setNick(usuario);
		ControladorUsuario.getInstancia().getUsuario().setContrase�a(contrase�a);*/

		despachador=req.getRequestDispatcher("agenda/inicio.jsp");
		despachador.forward(req, res);
}
public void doGet(HttpServletRequest req, 
		HttpServletResponse res)throws IOException,ServletException{
	doPost(req,res);
}
}