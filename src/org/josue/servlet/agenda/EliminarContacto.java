package org.josue.servlet.agenda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.josue.controlador.ControladorContacto;

public class EliminarContacto extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		HttpSession sesion= (HttpSession) req.getSession();
		Integer idUsuario = (Integer) sesion.getAttribute("idUsuario");
		Integer idContacto =  new Integer(req.getParameter("idContacto"));
		ControladorContacto.getInstancia().Eliminar(idContacto);
		System.out.println("El usuario " + idUsuario + " elimino al contacto " + idContacto);
		req.setAttribute("listaContacto", ControladorContacto.getInstancia().listar(idUsuario));
		RequestDispatcher despachador=null;
		despachador=req.getRequestDispatcher("agenda/inicio.jsp");
		despachador.forward(req, res);
}
public void doGet(HttpServletRequest req, 
		HttpServletResponse res)throws IOException,ServletException{
	doPost(req,res);
}
}
