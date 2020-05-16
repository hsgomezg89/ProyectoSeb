package co.uniquindio.address.model;

import java.util.ArrayList;

import javafx.beans.property.StringProperty;

public class Cliente {
	
	private StringProperty id;
	private StringProperty nombre;
	private StringProperty direccion;
	private StringProperty correo;
	private StringProperty fechaNacimiento;
	private ArrayList<Producto>productosFavoritos;
	
	
	
	
	
	
	
	public Cliente(StringProperty id, StringProperty nombre, StringProperty direccion, StringProperty correo,
			StringProperty fechaNacimiento, ArrayList<Producto> productosFavoritos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
		this.productosFavoritos = productosFavoritos;
	}
	
	public Cliente() {
		
	}
	
	

	public StringProperty getId() {
		return id;
	}

	public void setId(StringProperty id) {
		this.id = id;
	}

	public StringProperty getNombre() {
		return nombre;
	}

	public void setNombre(StringProperty nombre) {
		this.nombre = nombre;
	}

	public StringProperty getDireccion() {
		return direccion;
	}

	public void setDireccion(StringProperty direccion) {
		this.direccion = direccion;
	}

	public StringProperty getCorreo() {
		return correo;
	}

	public void setCorreo(StringProperty correo) {
		this.correo = correo;
	}

	public StringProperty getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(StringProperty fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public ArrayList<Producto> getProductosFavoritos() {
		return productosFavoritos;
	}

	public void setProductosFavoritos(ArrayList<Producto> productosFavoritos) {
		this.productosFavoritos = productosFavoritos;
	}

}
