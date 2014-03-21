package com.raul.database;

public class PersonalData implements java.io.Serializable{

	private static final long serialVersionUID = -5915715564034200122L;

	private Integer id;
	private String usuario;
	private String clave;
	private String nombre;
	private Integer edad;
	private Long telefono;
	
	
	public PersonalData(){
	}
	
	public PersonalData(Integer id, String usuario, String clave,
			String nombre, Integer edad, Long telefono) {
		this.id = id;
		this.usuario = usuario;
		this.clave = clave;
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "PersonalData [id=" + id + ", usuario=" + usuario + ", clave="
				+ clave + ", nombre=" + nombre + ", edad=" + edad
				+ ", telefono=" + telefono + "]";
	}
	
	
}
