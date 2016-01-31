package org.josue.servlet.agenda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.josue.bean.Contacto;
import org.josue.controlador.ControladorContacto;

public class CargarContacto extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
	RequestDispatcher despachador=null;
	Integer idContacto = new Integer(req.getParameter("idContacto"));
	Contacto contacto = ControladorContacto.getInstancia().Buscar(idContacto);
	req.setAttribute("contacto", contacto);
	System.out.println("Se encontro el contacto " + idContacto);
	despachador=req.getRequestDispatcher("agenda/editar.jsp");
	despachador.forward(req, res);
}
public void doGet(HttpServletRequest req, 
		HttpServletResponse res)throws IOException,ServletException{
	doPost(req,res);
}
}
