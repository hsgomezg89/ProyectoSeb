package co.uniquindio.address.model;

public class Pago {
	
	private DetalleCompra pago;
	private EnumTipoTarjeta  Tipo;
	
	

	
	public Pago(DetalleCompra pago, EnumTipoTarjeta tipo) {
		super();
		this.pago = pago;
		Tipo = tipo;
	}
	
	
	public Pago() {
		
	}
	
	public DetalleCompra getPago() {
		return pago;
	}
	public void setPago(DetalleCompra pago) {
		this.pago = pago;
	}
	public EnumTipoTarjeta getTipo() {
		return Tipo;
	}
	
	
	
	
 
	
}
