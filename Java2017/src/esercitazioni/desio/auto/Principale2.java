package esercitazioni.desio.auto;

public class Principale2 {

	public static void main (String [] args){
		Auto fiat600;
		fiat600=new Auto();
		fiat600.cilindrata=1100;
		fiat600.muoviti();
		
		Auto california= new Auto();
		california.cilindrata=4300;
		california.muoviti();
	}
}
