package co.uniquindio.address.model;

import javafx.beans.property.DoubleProperty;

public class DetalleCompra {
	
	private DoubleProperty valorEnvio;
	private Cliente cliente;
	
	
	
	public DetalleCompra(DoubleProperty valorEnvio, Cliente cliente) {
		super();
		this.valorEnvio = valorEnvio;
		this.cliente = cliente;
	}
	
	

	public DetalleCompra() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DoubleProperty getValorEnvio() {
		return valorEnvio;
	}
	public void setValorEnvio(DoubleProperty valorEnvio) {
		this.valorEnvio = valorEnvio;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
   
	
}
