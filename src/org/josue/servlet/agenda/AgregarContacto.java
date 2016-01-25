package org.josue.servlet.agenda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import org.josue.controlador.ControladorContacto;
import org.josue.controlador.ControladorUsuario;
import org.josue.db.Conexion;

public class AgregarContacto extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		String nombre = req.getParameter("txtNombre");
		Integer telCasa = Integer.parseInt(req.getParameter("txtTelCasa"));
		Integer telMovil = Integer.parseInt(req.getParameter("txtTelMovil"));
		String correo = req.getParameter("txtCorreo");
		String direccion = req.getParameter("txtDireccion");
		
		ControladorContacto.getInstancia().Agregar(nombre, telCasa, telMovil, correo, direccion);
		
		JOptionPane.showMessageDialog(null, "Agregado Correctamente a: " + nombre);
		RequestDispatcher despachador=null;
		
		
		
		despachador=req.getRequestDispatcher("agenda/inicio.jsp");
		despachador.forward(req, res);
}
public void doGet(HttpServletRequest req, 
		HttpServletResponse res)throws IOException,ServletException{
	doPost(req,res);
}
}
