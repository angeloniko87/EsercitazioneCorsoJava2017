package progetti.negozioalimentari.v1;

import java.util.Scanner;

public class NegozioAlimentari {

	public static void main(String[] args) {
		
		CassaNegozio cassaNegozio = new CassaNegozio();
		Scanner sc = new Scanner(System.in);
		int scelta;
		
		for(;;){
			System.out.println("\n---------------Negozio Alimentari---------\n\n");
			
			System.out.println("1) Per inserire un nuovo prodotto");
			System.out.println("2) Prodotto in Promozione");
			System.out.println("3) Leggi Prodotti");
			System.out.println("4) Elenca prodotti");
			System.out.println("5) Calcolo prezzo lordo");
			System.out.println("6) Calcolo Iva");
			System.out.println("7) Calcolo importo totale");
			System.out.println("8) Esci");
			
			
			try{
				System.out.println("\nScegli un'opzione del menù");
				scelta=sc.nextInt();
			}catch (Exception e) {
				System.out.println("Scelta non corretta");
				continue;
			}
			
			switch(scelta){
			case 1:
				System.out.println("Inserisci Prodotto");
				//inserire prodotti
				cassaNegozio.addProdotto();
				break;
				
			case 2:
				System.out.println("Prodotto in promozione");
				//applicare sconto a prodotto
				System.out.println("Inserisci codice prodotto in promozione");
				String idPromozione = sc.next();
				
				System.out.println("Inserisci sconto da applicare");
				 int idSconto=sc.nextInt();	
				
				cassaNegozio.promozione(idPromozione, idSconto);
				System.out.println("Sconto applicato correttamente");
				break;
			
			
			case 3:
				System.out.println("Lista dei prodotti");
				try {
					System.out.println("Inserisci id Prodotto");
					String id=sc.next();
					System.out.println("Inserisci numero di pezzi");
					int pezzi=sc.nextInt();
					cassaNegozio.Leggi(id, pezzi);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				};
				
				break;
			
			case 4:
				System.out.println("Elenco prodotti");
				cassaNegozio.stampa();
				break;
			
			case 5:
				System.out.println("Calcola prezzo lordo");
				System.out.println(cassaNegozio.netto()+"€");
				break;
				
			case 6:
				System.out.println("Calcola iva");
				System.out.println(cassaNegozio.tasse()+"€");
				break;
				
			case 7:
				System.out.println("Calcola importo totale");
				System.out.println(cassaNegozio.totale()+"€");
				break;
				
			case 8:
				System.out.println("Arrivederci");
				return;
				
			default:
				System.out.println("Errore!!!!!!!!!!!!!!!!!!!!!");
				break;
		}

	}

		
		
		
		
		

	}

}
