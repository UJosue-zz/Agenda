package org.josue.servlet.agenda;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.josue.bean.Usuario;
import org.josue.controlador.ControladorUsuario;
import org.josue.db.Conexion;
import org.josue.db.Encriptar;

public class Ingresar extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		
		String usuario = req.getParameter("txtUsuario");
		String contraseña = Encriptar.getInstancia().getMD5(req.getParameter("txtContrasena"));
		RequestDispatcher despachador=null;
		
		if(ControladorUsuario.getInstancia().Ingresar(usuario, contraseña) == true){
			HttpSession sesion= req.getSession(true);
			Integer idUsuario = 0;
			ResultSet rs = Conexion.getInstancia().obtenerConsulta("Select * From usuario");
			try {
				while(rs.next()){
					if(usuario.equals(rs.getString("nick"))){
						idUsuario = rs.getInt("idUsuario");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error en Ingresar.java (1)");
			}
			sesion.setAttribute("usuario", idUsuario);
			System.out.println("Sesion iniciada " + idUsuario);
			despachador=req.getRequestDispatcher("agenda/inicio.jsp");
			despachador.forward(req, res);
		}else{
			System.out.println("El usuario no fue encontrado");
			despachador=req.getRequestDispatcher("index.jsp");
			despachador.forward(req, res);
		}
}
	
public void doGet(HttpServletRequest req, 
		HttpServletResponse res)throws IOException,ServletException{
	doPost(req,res);
}
}
