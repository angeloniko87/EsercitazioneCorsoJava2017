package progetti.negozioalimentari.v1;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class CassaNegozio {

	private Map <String, Prodotto> inventario= new HashMap<>();
	private Vector <Prodotto> listaProdotti= new Vector<>();
	
	private String idPromozione;
	private int idSconto;
	private double sconto, promo,totale;
	
	Scanner sc= new Scanner(System.in);
	
	//metodo che aggiunge un nuovo prodotto destro l'hashmap
	public void addProdotto(){
		
		System.out.println("Inserisci codice prodotto");
		 String id=sc.nextLine();
		System.out.println("Inserisci descrizione Prodotto");
		String desc=sc.nextLine();
		System.out.println("Inserisci prezzo prodotto");
		 double prezzoLordo=sc.nextDouble();
		Prodotto prodotto= new Prodotto(id, desc, prezzoLordo);
		inventario.put(id, prodotto); //inserimento della key e del valore del prodotto
	}
	
	//metodo che passa l'id del prodotto e lo sconto da applicare
	public void promozione (String id, int sconto){
		
		idPromozione = id;
		idSconto=sconto;	
	}
	
	// confronta se il prodotto è in promozione o meno
	public boolean prodPromozione (Prodotto p){
		return p.getId().equals(idPromozione);
	}
	
	public void Leggi(String id, int pezzi) throws ProdottoInesistente{
		
		Prodotto p = (Prodotto) inventario.get(id);
		double sconto = 0,prezzoLordo = 0;
		
		if(prodPromozione(p))
			sconto = ((prezzoLordo/100) * promo);
			prezzoLordo = prezzoLordo-sconto;
		
		if (p==null) {
			throw new ProdottoInesistente();
		}
		
		listaProdotti.add(p);
		
		 totale =+ prezzoLordo;
	}
	
	

	
	
		
	}
	
	

