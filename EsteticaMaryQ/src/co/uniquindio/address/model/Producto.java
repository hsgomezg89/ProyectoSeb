package co.uniquindio.address.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.StringProperty;

public class Producto {

	// Atributos referencias de otras clases
	private EnumTipoCategoria categoria;
	private EnumTipoProducto producto;

	// Atributos propios de la clase
	private BooleanProperty disponible;
	private DoubleProperty precio;
	private StringProperty nombre;

	public Producto() {

	}

	public Producto(EnumTipoCategoria categoria, EnumTipoProducto producto, BooleanProperty disponible,
			DoubleProperty precio, StringProperty nombre) {
		super();
		this.categoria = categoria;
		this.producto = producto;
		this.disponible = disponible;
		this.precio = precio;
		this.nombre = nombre;
	}

	public EnumTipoCategoria getCategoria() {
		return categoria;
	}

	public EnumTipoProducto getProducto() {
		return producto;
	}

	public BooleanProperty getDisponible() {
		return disponible;
	}

	public void setDisponible(BooleanProperty disponible) {
		this.disponible = disponible;
	}

	public DoubleProperty getPrecio() {
		return precio;
	}

	public void setPrecio(DoubleProperty precio) {
		this.precio = precio;
	}

	public StringProperty getNombre() {
		return nombre;
	}

	public void setNombre(StringProperty nombre) {
		this.nombre = nombre;
	}

}
