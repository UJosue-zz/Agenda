package org.josue.servlet.agenda;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CerrarSesion extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		HttpSession sesion = req.getSession();
		sesion.setAttribute("idUsuario", "");
		sesion.invalidate();
			RequestDispatcher despachador=null;
			despachador=req.getRequestDispatcher("index.jsp");
			despachador.forward(req, res);
}
	
public void doGet(HttpServletRequest req, 
		HttpServletResponse res)throws IOException,ServletException{
	doPost(req,res);
}
}
