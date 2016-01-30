package org.josue.servlet.agenda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.josue.controlador.ControladorUsuario;
import org.josue.db.Encriptar;

public class AgregarUsuario extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		String usuario = req.getParameter("txtNick");
		String contraseña = Encriptar.getInstancia().getMD5(req.getParameter("txtContrasena"));
		RequestDispatcher despachador=null;
		
		if(ControladorUsuario.getInstancia().Agregar(usuario, contraseña)== true){
			System.out.println("Se agrego el usuario con exito");
			despachador=req.getRequestDispatcher("agenda/inicio.jsp");
			despachador.forward(req, res);
		}else{
			System.out.println("El usuario no se agrego");
			despachador=req.getRequestDispatcher("index.jsp");
			despachador.forward(req, res);
		}
		

		
}
public void doGet(HttpServletRequest req, 
		HttpServletResponse res)throws IOException,ServletException{
	doPost(req,res);
}
}
