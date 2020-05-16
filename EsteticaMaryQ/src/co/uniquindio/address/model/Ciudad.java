package co.uniquindio.address.model;

import java.util.ArrayList;

import javafx.beans.property.StringProperty;

public class Ciudad {
	
	private StringProperty nombre;
	private Sede[]sedes;
	private ArrayList<Producto>productosDisponibles;
	
	
	public Ciudad() {
		
	}
	
	public Ciudad(StringProperty nombre, Sede[] sedes, ArrayList<Producto> productosDisponibles) {
		super();
		this.nombre = nombre;
		this.sedes = sedes;
		this.productosDisponibles = productosDisponibles;
	}
	public StringProperty getNombre() {
		return nombre;
	}
	public void setNombre(StringProperty nombre) {
		this.nombre = nombre;
	}
	public Sede[] getSedes() {
		return sedes;
	}
	public void setSedes(Sede[] sedes) {
		this.sedes = sedes;
	}
	public ArrayList<Producto> getProductosDisponibles() {
		return productosDisponibles;
	}
	public void setProductosDisponibles(ArrayList<Producto> productosDisponibles) {
		this.productosDisponibles = productosDisponibles;
	}

	
}
