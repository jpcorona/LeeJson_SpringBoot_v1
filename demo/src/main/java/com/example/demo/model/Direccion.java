package com.example.demo.model;

public class Direccion {
	
	String calle;
	String ciudad;
	String zip;
	
	public Direccion(){}
	public Direccion(String calle, String ciudad, String zip) {
		super();
		this.calle = calle;
		this.ciudad = ciudad;
		this.zip = zip;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}
