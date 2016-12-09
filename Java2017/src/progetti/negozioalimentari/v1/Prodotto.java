package progetti.negozioalimentari.v1;

public class Prodotto {

	private String id, desc;
	private double prezzoLordo;
	
	public Prodotto(String id, String desc, double prezzoLordo){
		
		this.id=id;
		this.desc=desc;
		this.prezzoLordo=prezzoLordo;

		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrezzoLordo() {
		return prezzoLordo;
	}

	public void setPrezzoLordo(double prezzoLordo) {
		this.prezzoLordo = prezzoLordo;
	}
	
	
}

