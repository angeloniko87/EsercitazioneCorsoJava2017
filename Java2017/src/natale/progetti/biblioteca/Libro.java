package natale.progetti.biblioteca;

public class Libro{

	private String titolo;
	private Abbonato utente;
	private Data scadenza;

	public Libro(String unTitolo){

		titolo = unTitolo;
		utente = null;
		scadenza = null;
	}

	public String getTitolo(){
		return titolo;
	}

	public Abbonato getUtente(){
		return utente;
	}

	public Data getScadenza(){
		return scadenza;
	}

	public void setUtente(Abbonato unUtente){
		utente = unUtente;
	}

	public void setScadenza(Data unaData){
		scadenza = unaData;
	}

}