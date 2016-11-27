package progetti.automobile.v1;

public class Automobile {
	
	private int velocitaMassima;
	private int velocita;
	private String marca;
	private double cilindrata;
	private String modello;
	
	
	
	
	public Automobile(String marca, String modello, double cilindrata) {
		
		this.marca=marca;
		this.modello=modello;
		this.cilindrata=cilindrata;
		
	}

	public void setVelocitaMassima(int i) {
		this.velocitaMassima=i;
		
	}

	public int getVelocita() {
		velocita=0;
		
		return velocita;
	}

	public boolean isAccesa() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getMarca() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCilindrata() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getModello() {
		// TODO Auto-generated method stub
		return null;
	}

}
