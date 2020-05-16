package co.uniquindio.address.model;

public enum EnumTipoCategoria {
	HOMBRE(0),MUJER(1),BEBE(2),NIÑO(3);
	
	private int numTipo;

	
	
	private EnumTipoCategoria(int numTipo) {
		this.numTipo = numTipo;
	}



	public int getNumTipo() {
		return numTipo;
	}

	public String toString() {
	
		String tipo = "";

		switch (numTipo) {
		case 0:
			tipo = "HOMBRE";
			break;
		case 1:
			tipo = "MUJER";
			break;

		case 2:

			tipo = "BEBE";
			break;

		case 3:
			tipo = "NIÑO";

			break;
		}

		return tipo;

	}
}