package co.uniquindio.address.model;

public enum EnumTipoTarjeta {
	CREDITO(0), DEBITO(1);

	private int numTipo;

	private EnumTipoTarjeta(int numtipo) {
		this.numTipo = numtipo;
	}

	public int getNumtipo() {
		return numTipo;
	}

	public String toString() {

		String tipo = "";

		switch (numTipo) {
		case 0:
			tipo = "CREDITO";
			break;
		case 1:
			tipo = "DEBITO";
			break;

		}

		return tipo;

	}
}
