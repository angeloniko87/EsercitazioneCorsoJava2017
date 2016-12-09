package progetti.assicurazione.v1;

public class Automobile {
	private int numeroTarga;
	private Cliente c;
	
	public Automobile(int numeroTarga, Cliente c){
		this.numeroTarga=numeroTarga;
		this.c=c;
	}

	public int getNumeroTarga() {
		return numeroTarga;
	}

	public void setNumeroTarga(int numeroTarga) {
		this.numeroTarga = numeroTarga;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}
	
	

}
