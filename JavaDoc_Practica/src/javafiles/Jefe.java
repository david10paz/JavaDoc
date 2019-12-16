package javafiles;

/**
 * Clase que representa al jefe
 * 
 * @author davii
 * @version 1.0
 * @since 0.3
 * @license GPL v3
 * @see Empleado
 */

public class Jefe {

	public String id;
	public String nombre;
	public String dni;
	
	/**
	 * 
	 * @return id del jefe
	 */
	public String getId() {
		return id;
	}
	/**
	 * 
	 * @param id Es el id del jefe
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre Es el nombre del jefe
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
	 * @param dni Es el DNI del jefe
	 * @serial donde describe el significado de este campo del jefe y sus valores aceptables
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}
