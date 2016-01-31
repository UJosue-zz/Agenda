package org.josue.controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.josue.bean.Contacto;
import org.josue.db.Conexion;

public class ControladorContacto {
		private static ControladorContacto instancia;
		public static ControladorContacto getInstancia(){
			return (instancia==null)?
					new ControladorContacto():instancia;
		}
		
		public void Agregar(String nombre, Integer telCasa, Integer telMovil,
				String correo, String direccion, Integer idUsuario){
			Conexion.getInstancia().EjecutarConsulta("INSERT INTO contacto (`nombre`, `telCasa`, `telMovil`, `correo`, `direccion`, `idUsuario`)"
					+ " VALUES (' " + nombre + "', " + telCasa + ", " + telMovil + ", '" + correo + "', '" + direccion  +"'," + idUsuario + ")");
			System.out.println("El usuario " + idUsuario + " agrego un nuevo contacto");
		}
		
		public List<Contacto> listar(Integer idUsuario){
			ResultSet rs=Conexion.getInstancia().obtenerConsulta("Select * from contacto");
			List<Contacto> listado=new ArrayList();
			try {
				while(rs.next()){
					if(rs.getInt("idUsuario") == idUsuario){
						listado.add(new Contacto(
								rs.getInt("idContacto"),
								rs.getString("nombre"),
								rs.getInt("telCasa"),
								rs.getInt("telMovil"),
								rs.getString("correo"),
								rs.getString("direccion"),
								rs.getInt("idUsuario")
								));
						System.out.println("Contactos del usuario " + idUsuario);
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error de ControladorContacto.java [1]");
			}
			return listado;
		}
}
