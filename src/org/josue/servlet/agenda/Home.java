package org.josue.servlet.agenda;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.josue.controlador.ControladorContacto;

public class Home extends HttpServlet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
			HttpSession sesion = req.getSession();
			Integer idUsuario = (Integer) sesion.getAttribute("idUsuario");
			System.out.println("ID USUARIO REGRESAR " + idUsuario);
			RequestDispatcher despachador=null;
			req.setAttribute("listaContacto", ControladorContacto.getInstancia().listar(idUsuario));
			despachador=req.getRequestDispatcher("agenda/inicio.jsp");
			despachador.forward(req, res);
}
	
public void doGet(HttpServletRequest req, 
		HttpServletResponse res)throws IOException,ServletException{
	doPost(req,res);
}
}
