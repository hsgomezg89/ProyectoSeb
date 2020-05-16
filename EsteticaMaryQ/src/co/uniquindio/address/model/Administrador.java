package co.uniquindio.address.model;

import java.util.ArrayList;

import javafx.beans.property.StringProperty;

public class Administrador {
	
	/// Atributos referencias de otras clases
	private ArrayList<Ciudad>ciudades;
	private Sede[]sedes;
	private ArrayList<Cliente>clientes;
	private ArrayList<Producto>productos;
	private ArrayList<Producto>nuevosProductos;
	
	///Atributos propios de la clase
	private StringProperty id;
	private StringProperty nombre;
	private StringProperty direccion;
	private StringProperty correo;
	private StringProperty fechaNacimiento;
	private StringProperty estudiosRealizados;
	
	
	
	public Administrador() {
		
		// TODO Auto-generated constructor stub
	}

	public Administrador(ArrayList<Ciudad> ciudades, Sede[] sedes, ArrayList<Cliente> clientes,
			ArrayList<Producto> productos, ArrayList<Producto> nuevosProductos, StringProperty id,
			StringProperty nombre, StringProperty direccion, StringProperty correo, StringProperty fechaNacimiento,
			StringProperty estudiosRealizados) {
		super();
		this.ciudades = ciudades;
		this.sedes = sedes;
		this.clientes = clientes;
		this.productos = productos;
		this.nuevosProductos = nuevosProductos;
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
		this.estudiosRealizados = estudiosRealizados;
	}

	public ArrayList<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(ArrayList<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

	public Sede[] getSedes() {
		return sedes;
	}

	public void setSedes(Sede[] sedes) {
		this.sedes = sedes;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public ArrayList<Producto> getNuevosProductos() {
		return nuevosProductos;
	}

	public void setNuevosProductos(ArrayList<Producto> nuevosProductos) {
		this.nuevosProductos = nuevosProductos;
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

	public StringProperty getEstudiosRealizados() {
		return estudiosRealizados;
	}

	public void setEstudiosRealizados(StringProperty estudiosRealizados) {
		this.estudiosRealizados = estudiosRealizados;
	}

}
