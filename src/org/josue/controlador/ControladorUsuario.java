package org.josue.controlador;

import org.josue.db.Conexion;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import org.josue.bean.Usuario;

public class ControladorUsuario {
	
	Usuario usuario = new Usuario();
	private static ControladorUsuario instancia;
	public static ControladorUsuario getInstancia(){
		return (instancia==null)?
				new ControladorUsuario():instancia;
	}
	
	public void Ingresar(String usuario, String contrase�a){
		ResultSet rs = Conexion.getInstancia()
		.obtenerConsulta("Select * from usuario where nick = '" + usuario 
				+ "' AND contrase�a = '" + contrase�a + "'");
		try {
			String usuariodb = rs.getString("nick");
			String contrase�adb = rs.getString("contrase�a");
			System.out.println(usuariodb + contrase�adb);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("De clase ControladorUsuario.java");
		}
		
	}
	
	public void Agregar(String nick, String contrase�a){
		Conexion.getInstancia().EjecutarConsulta("INSERT INTO usuario "
				+ "(`nombre`, `correo`,`nick`, `contrase�a`) "
				+ "VALUES ('Estuardo', 'klj@kjl', '" + nick + "','" + contrase�a + "')");
	}
	
	public Usuario getUsuario(){
		return usuario;
	}	
		
}
