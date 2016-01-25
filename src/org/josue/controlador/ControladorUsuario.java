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
	
	public void Ingresar(String usuario, String contraseña){
		ResultSet rs = Conexion.getInstancia()
		.obtenerConsulta("Select * from usuario where nombre = " + usuario 
				+ "AND contraseña = " + contraseña);

	}
	
	public Usuario getUsuario(){
		return usuario;
	}	
		
}
