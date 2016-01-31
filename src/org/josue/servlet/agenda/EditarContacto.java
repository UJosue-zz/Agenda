package org.josue.servlet.agenda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.josue.bean.Contacto;
import org.josue.controlador.ControladorContacto;

public class EditarContacto extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		RequestDispatcher despachador=null;
		HttpSession sesion= (HttpSession) req.getSession();
		Integer idUsuario = (Integer) sesion.getAttribute("idUsuario");
		
		Contacto contacto =new Contacto(
				new Integer(req.getParameter("txtIdContacto")),
				req.getParameter("txtNombre"),
				new Integer(req.getParameter("txtTelCasa")),
				new Integer(req.getParameter("txtTelMovil")),
				req.getParameter("txtCorreo"),
				req.getParameter("txtDireccion"),
				idUsuario
				);
		
		ControladorContacto.getInstancia().Editar(contacto);
		req.setAttribute("listaContacto", ControladorContacto.getInstancia().listar(idUsuario));
		despachador=req.getRequestDispatcher("agenda/inicio.jsp");
		despachador.forward(req, res);
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		doPost(req,res);
	}
}
