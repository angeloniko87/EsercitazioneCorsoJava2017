package natale.progetti.biblioteca;

import java.util.ArrayList;

	public class Biblioteca{

		private ArrayList<Abbonato> utenti;
		private ArrayList<Libro> libri;
		private Data dataCorr;

		public Biblioteca(Data unaData){

			utenti = new ArrayList<Abbonato>();
			libri = new ArrayList<Libro>();
			dataCorr = unaData;
		}



		public void nuovoLibro(String unTitolo){

			if(trovaLibro(unTitolo) != -1)
				return;

			Libro l = new Libro(unTitolo);
			libri.add(l);
		}



		public void nuovoUtente(String unNome, String unCognome){

			if(trovaUtente(unNome, unCognome) != -1)
				return;

			Abbonato nuovoAbb = new Abbonato(unNome, unCognome);
			utenti.add(nuovoAbb);
		}



		private int trovaUtente(String unNome, String unCognome){
			for(int i = 0; i < utenti.size(); i++)
				if(utenti.get(i).getNome().equalsIgnoreCase(unNome) &&
						utenti.get(i).getCognome().equalsIgnoreCase(unCognome))
					return i;
			return -1;
		}

		private int trovaLibro(String unTitolo){

			for(int i = 0; i < libri.size(); i++)
				if(libri.get(i).getTitolo().equalsIgnoreCase(unTitolo))
					return i;
			return -1;
		}

		private Data scadenza(Data date){

			Data d = new Data();
			d.setDay(date.getDay());
			if (date.getMonth() > 10){
				d.setMonth(date.getMonth() - 10);
				d.setYear(date.getYear() + 1);
			}else{
				d.setMonth(date.getMonth() + 2);
				d.setYear(date.getYear());
			}
			return d;
		}

		public int presta(String unTitolo, String unNome, String unCognome){

			int indexLib=trovaLibro(unTitolo);
			if ((indexLib==-1) || (libri.get(indexLib).getUtente() != null))
				return -1;

				int indexUt=trovaUtente(unNome, unCognome);
				if (indexUt==-1)
					return -1;

				libri.get(indexLib).setUtente(utenti.get(indexUt));
				libri.get(indexLib).setScadenza(this.scadenza(dataCorr));
				return 0;
		}	

		public void aggiorna(){

			dataCorr.nextDay();
			for (Libro lib : libri)
				if (lib.getScadenza().isEqual(dataCorr)){
					lib.setUtente(null);
					lib.setScadenza(null);
				}
		}

		public int numLibri(String unNome, String unCognome){

			int nLib = 0;
			for (Libro a: libri)
				if (a.getUtente() != null &&
				a.getUtente().getNome().equalsIgnoreCase(unNome) &&
				a.getUtente().getCognome().equalsIgnoreCase(unCognome))
					nLib = nLib + 1;
			return nLib;
		}

		public String getDate(){
			return dataCorr.stampa();

		}

		public String getListaLib(){

			String risp = "";
			for (Libro lib : libri)
				risp = risp + lib.getTitolo() + "\n";
			return risp;

		}



		public String getListaUt(){

			String risp = "";
			for (Abbonato a : utenti)
				risp = risp +a.getNome() + " " + a.getCognome() + "\n";
			return risp;	
		}

}