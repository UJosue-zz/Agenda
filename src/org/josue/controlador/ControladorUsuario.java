package org.josue.controlador;

import org.josue.db.Conexion;
import org.josue.db.Encriptar;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import org.josue.bean.Usuario;

public class ControladorUsuario {
	private static ControladorUsuario instancia;
	public static ControladorUsuario getInstancia(){
		return (instancia==null)?
				new ControladorUsuario():instancia;
	}
	
	public boolean Ingresar(String usuario, String contraseña){
		boolean encontrado = false;
		ResultSet rs = Conexion.getInstancia()
		.obtenerConsulta("SELECT * FROM usuario");
		try {
			while(rs.next()){
				String userdb = rs.getString("nick");
				String passdb = rs.getString("contraseña");
				if(userdb.equals(usuario) && passdb.equals(contraseña)){
					System.out.println("Usuario encontrado " + rs.getInt("idUsuario"));
					encontrado = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error en Controlador Usuario (1)");
		}
		return encontrado;
	}
	
	public boolean Agregar(String nick, String contraseña){
		boolean encontrado = false;
		ResultSet rs =
		Conexion.getInstancia().obtenerConsulta("Select * from usuario");
		
		try {
			while(rs.next()){
				String nickdb = rs.getString("nick");
				if(Ocupado(nickdb, nick)==true){
					encontrado = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error en Controlador Usuario (2)");
		}
		
		if(encontrado== false){
			Conexion.getInstancia().EjecutarConsulta("INSERT INTO usuario "
					+ "(`nombre`, `correo`,`nick`, `contraseña`) "
					+ "VALUES ('Estuardo', 'klj@kjl', '" + nick + "','" + contraseña + "')");
			return true;
		}else{
			return false;
		}
	}
	
	private boolean Ocupado(String nickdb, String nick){
		if(nickdb.equals(nick)){
			System.out.println("El usuario ya existe" + nick + nickdb);
			return true;
		}else{
			System.out.println("El usuario no existe");
			return false;
		}
	}
}
