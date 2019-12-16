package javafiles;

/**
 * Clase que representa al empleado.
 * 
 * @author davii
 * @version 1.0
 * @since 0.3
 * @license GPL v3
 * @see Jefe
 *
 */

public class Empleado {

	/**
	 * Clave Primaria
	 */
	
	public String numempleado;
	public String nombre;
	public String dni;
	
	
	public String getNumempleado() {
		return numempleado;
	}
	
	public void setNumempleado(String numempleado) {
		this.numempleado = numempleado;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
}
