package org.josue.controlador;

import org.josue.db.Conexion;

public class ControladorContacto {
		private static ControladorContacto instancia;
		public static ControladorContacto getInstancia(){
			return (instancia==null)?
					new ControladorContacto():instancia;
		}
		
		public void Agregar(String nombre, Integer telCasa, Integer telMovil,
				String correo, String direccion){
			Integer idUsuario = ControladorUsuario.getInstancia().getUsuario().getIdUsuario();
			Conexion.getInstancia().EjecutarConsulta("INSERT INTO contacto (`nombre`, `telCasa`, `telMovil`, `correo`, `direccion`, `idUsuario`)"
					+ " VALUES (' " + nombre + "', " + telCasa + ", " + telMovil + ", '" + correo + "', '" + direccion  +"'" + idUsuario + ")");
		}

	

}
