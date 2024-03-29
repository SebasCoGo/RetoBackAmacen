package com.almacen.model;

/*
 * Esta clase simula el Entity del Cliente
 */
/**
 * @version: 17/04/2021/A
 * @author SebasCoGo
 */

public class Cliente {
	private String id;
	private String nombre;
	private String telefono;
	private String direccion;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

}
