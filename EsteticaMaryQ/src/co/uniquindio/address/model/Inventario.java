package co.uniquindio.address.model;

import java.util.ArrayList;

public class Inventario {
	
	private Producto inventarioExistencias;
	private ArrayList<Producto>inventarioProductosNacional;
	
	
	
	
	public Inventario(Producto inventarioExistencias, ArrayList<Producto> inventarioProductosNacional) {
		super();
		this.inventarioExistencias = inventarioExistencias;
		this.inventarioProductosNacional = inventarioProductosNacional;
	}
	
	
	public Inventario() {
		
		// TODO Auto-generated constructor stub
	}


	public Producto getInventarioExistencias() {
		return inventarioExistencias;
	}
	public void setInventarioExistencias(Producto inventarioExistencias) {
		this.inventarioExistencias = inventarioExistencias;
	}
	public ArrayList<Producto> getInventarioProductosNacional() {
		return inventarioProductosNacional;
	}
	public void setInventarioProductosNacional(ArrayList<Producto> inventarioProductosNacional) {
		this.inventarioProductosNacional = inventarioProductosNacional;
	}

   	
}
