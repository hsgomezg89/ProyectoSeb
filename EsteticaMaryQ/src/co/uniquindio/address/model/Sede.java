package co.uniquindio.address.model;

import java.util.ArrayList;

import javafx.beans.property.StringProperty;

public class Sede {

	private StringProperty nombre;
	private ArrayList<Producto> productosDisponibles;
	private ArrayList<Cliente> listadoClientes;
	private Administrador administrador;

	public Sede() {

	}

	public Sede(StringProperty nombre, ArrayList<Producto> productosDisponibles, ArrayList<Cliente> listadoClientes,
			Administrador administrador) {
		super();
		this.nombre = nombre;
		this.productosDisponibles = productosDisponibles;
		this.listadoClientes = listadoClientes;
		this.administrador = administrador;
	}

	public StringProperty getNombre() {
		return nombre;
	}

	public void setNombre(StringProperty nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Producto> getProductosDisponibles() {
		return productosDisponibles;
	}

	public void setProductosDisponibles(ArrayList<Producto> productosDisponibles) {
		this.productosDisponibles = productosDisponibles;
	}

	public ArrayList<Cliente> getListadoClientes() {
		return listadoClientes;
	}

	public void setListadoClientes(ArrayList<Cliente> listadoClientes) {
		this.listadoClientes = listadoClientes;
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

}
