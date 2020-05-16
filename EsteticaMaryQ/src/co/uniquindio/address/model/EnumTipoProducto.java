package co.uniquindio.address.model;

public enum EnumTipoProducto {
	CUIDADOFACIAL(0),CUIDADOCORPORAL(1),FRAGANCIA(2),MAQUILLAJE(3),CAPILAR(4);
	
	
	private int numTipo;

	private EnumTipoProducto(int numTipo) {
		this.numTipo = numTipo;
	}

	public int getNumTipo() {
		return numTipo;
	}
	
	public String toString() {
		
		String tipo = "";

		switch (numTipo) {
		case 0:
			tipo = "CUIDADOFACIAL";
			break;
		case 1:
			tipo = "CUIDADOCORPORAL";
			break;

		case 2:

			tipo = "FRAGANCIA";
			break;

		case 3:
			tipo = "MAQUILLAJE";

			break;
		case 4:
			tipo = "CAPILAR";
			break;
		}

		return tipo;

	}
}
