package org.josue.servlet.agenda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.josue.bean.Usuario;
import org.josue.controlador.ControladorContacto;
import org.josue.controlador.ControladorUsuario;
import org.josue.db.Conexion;

public class AgregarContacto extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		HttpSession sesion= (HttpSession) req.getSession();
		String nombre = req.getParameter("txtNombre");
		String correo = req.getParameter("txtCorreo");
		String direccion = req.getParameter("txtDireccion");
		Integer telCasa = new Integer(req.getParameter("txtTelCasa"));
		Integer telMovil = new Integer(req.getParameter("txtTelMovil"));
		Integer idUsuario = (Integer) sesion.getAttribute("idUsuario");
		
		ControladorContacto.getInstancia().Agregar(nombre, telCasa, telMovil, correo, direccion, idUsuario);
		
		
		
		
		RequestDispatcher despachador=null;
		despachador=req.getRequestDispatcher("agenda/inicio.jsp");
		despachador.forward(req, res);
}
public void doGet(HttpServletRequest req, 
		HttpServletResponse res)throws IOException,ServletException{
	doPost(req,res);
}
}
