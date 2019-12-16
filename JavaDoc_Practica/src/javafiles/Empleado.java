package javafiles;

/**
 * Clase que representa al empleado.
 * 
 * <h2>Proyecto Javadoc</h2>
 * <p><b> Clase Empleado </b></p>
 * <p><a> href = "https://github.com/david10paz/JavaDoc"</a> Ver proyecto JavaDoc en github </p>
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
	
	/**
	 * 
	 * @return El numero de empleado del empleado
	 */
	public String getNumempleado() {
		return numempleado;
	}
	/**
	 * 
	 * @param numempleado Este es el numero que identifica al empleado
	 */
	public void setNumempleado(String numempleado) {
		this.numempleado = numempleado;
	}
	
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre Es el nombre del empleado
	 * @throws nombreException (excepcion de este si ocurriera cierta circunstancia)
	 * @deprecated indica que este método ha quedado obsoleto, se desaconseja su uso y puede que en futuras versiones desaparezca.
	 */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	/**
	 * 
	 * @param dni Es el DNI del empleado
	 * @serial donde describe el significado de este campo del empleado y sus valores aceptables
	 */
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
}
