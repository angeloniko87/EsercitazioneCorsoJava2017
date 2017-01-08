package natale.progetti.biblioteca;

public class Abbonato{

	private String cognome, nome;

	public Abbonato(String unNome, String unCognome){

		nome = unNome;
		cognome = unCognome;
	}

	public String getCognome(){
		return cognome;
	}

	public String getNome(){
		return nome;
	}

}
	


