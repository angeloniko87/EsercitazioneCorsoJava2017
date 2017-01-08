package natale.progetti.biblioteca;

import java.util.Scanner;

	public class BiliotecaTester{

		public static void main (String[] args){

			Scanner in = new Scanner (System.in);

			Data dataCorr = new Data();
			dataCorr.setYear(2009);
			dataCorr.setMonth(1);
			dataCorr.setDay(4);

			Biblioteca cogolloBibl = new Biblioteca (dataCorr);

			boolean finito = false;

			int selezione;

			while (!finito){

				System.out.println("\n Premere:");
				System.out.println("1) per inserire un nuovo libro");
				System.out.println("2) per inserire un nuovo utente");
				System.out.println("3) per prestare un libro");
				System.out.println("4) per aggiornare");
				System.out.println("5) per listare il numero di libri in prestito a un utente");
				System.out.println("6) per listare i libri");
				System.out.println("7) per listare gli utenti");
				System.out.println("9) per uscire");

				System.out.print("Selezione: ");
				selezione = in.nextInt();
				in.nextLine();

				if (selezione==1){

					System.out.print("Titolo del libro: ");
					String title = in.nextLine();
					cogolloBibl.nuovoLibro(title);
				}else if (selezione==2){

					System.out.print("Nome: ");
					String name = in.next();
					System.out.print("Cognome: ");
					String surname = in.next();
					cogolloBibl.nuovoUtente(name, surname);
				}else if (selezione==3){

					System.out.print("Titolo del libro: ");	
					String title = in.nextLine();
					System.out.print("Nome: ");
					String name = in.next();
					System.out.print("Cognome: ");
					String surname = in.next();
					if (cogolloBibl.presta(title, name, surname) == 0)
						System.out.println("prestito eseguito");
					else
						System.out.println("errore!");
				}else if (selezione==4){
					
					cogolloBibl.aggiorna();
					System.out.println("data corrente: "+cogolloBibl.getDate());
				}else if (selezione==5){

					System.out.print("Nome: ");	
					String name = in.next();
					System.out.print("Cognome: ");
					String surname = in.next();
					System.out.println(cogolloBibl.numLibri(name, surname) + " libro/i in prestito");
				}else if (selezione==6){

					System.out.println(cogolloBibl.getListaLib());
				}else if (selezione==7){

					System.out.println(cogolloBibl.getListaUt());
				}else if (selezione==9){

					finito = true;
				}
			}
		}
	}