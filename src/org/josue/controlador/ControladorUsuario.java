package org.josue.controlador;

import org.josue.db.Conexion;
import org.josue.bean.Usuario;

public class ControladorUsuario {
	private static ControladorUsuario instancia;
	public static ControladorUsuario getInstancia(){
		return (instancia==null)?
				new ControladorUsuario():instancia;
	}
	
	public void Ingresar(String usuario, String contraseña){
		Conexion.getInstancia()
		.EjecutarConsulta("Select * from usuario where nombre = " + usuario 
				+ "AND contraseña = " + contraseña);
	}
	
	Usuario usuario = new Usuario();
	
	public Usuario getUsuario(){
		return usuario;
	}
}
