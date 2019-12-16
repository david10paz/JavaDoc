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
