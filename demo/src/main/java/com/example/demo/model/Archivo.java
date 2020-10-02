package com.example.demo.model;

public class Archivo {
	
	String nombre;
	String apellido;
	int edad;
	Direccion direccion;
	String[] autos;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public String[] getAutos() {
		return autos;
	}
	public void setAutos(String[] autos) {
		this.autos = autos;
	}

}
