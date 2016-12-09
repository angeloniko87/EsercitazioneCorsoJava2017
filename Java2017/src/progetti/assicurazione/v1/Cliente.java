package progetti.assicurazione.v1;

public class Cliente {
	private String nominativo;
	
	public Cliente (String nominativo){
		this.nominativo=nominativo;
		
	}

	public String getNominativo() {
		return nominativo;
	}

	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}
	
}
