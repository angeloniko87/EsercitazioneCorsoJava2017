package progetti.negozioalimentari.v1;

public class ProdottoInesistente extends Exception {
	
	public ProdottoInesistente(){
		super ("Il prodotto non è presente");
	}

}
