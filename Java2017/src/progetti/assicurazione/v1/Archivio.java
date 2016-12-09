package progetti.assicurazione.v1;

import java.util.ArrayList;

public class Archivio {
	private ArrayList<Automobile>automobili;
	private ArrayList<Cliente>clienti;

	public Archivio(){
		automobili=new ArrayList<Automobile>();
		clienti= new ArrayList<Cliente>();
	}
	
	public int posizioneCliente(String nominativo){
		int pos=clienti.indexOf(nominativo);
		if(pos>=0){
			return pos;
		}else{
			pos=-1;
		}
		return pos;
	}

	public int posizioneAutomobile(int targa){
		int pos=automobili.indexOf(targa);
		if(pos>=0){
			return pos;
		}else{
			pos=-1;
		}
		return pos;
	}
	
	
	
	public void aggiungiCliente(String nominativo){
	   if(posizioneCliente(nominativo) ==-1)
		{
			clienti.add(new Cliente(nominativo));	
		}	
	   else
	   {
		   System.out.println("Esiste");
	   }
    }
	
	
	
	
	
	

	
		
	}
	
	
	
	
		
	
	
	
	
	
	


