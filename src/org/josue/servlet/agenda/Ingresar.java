package org.josue.servlet.agenda;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.josue.controlador.ControladorUsuario;

public class Ingresar extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		String usuario = req.getParameter("txtUsuario");
		String contraseña = req.getParameter("txtContrasena");
		RequestDispatcher despachador=null;
		
		ControladorUsuario.getInstancia().Ingresar(usuario, contraseña);
		
		ControladorUsuario.getInstancia().getUsuario().setNick(usuario);
		ControladorUsuario.getInstancia().getUsuario().setContraseña(contraseña);
		
		despachador=req.getRequestDispatcher("agenda/inicio.jsp");
		despachador.forward(req, res);
}
public void doGet(HttpServletRequest req, 
		HttpServletResponse res)throws IOException,ServletException{
	doPost(req,res);
}
}
