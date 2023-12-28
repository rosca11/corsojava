public class Main {

	public static void main(String[] args) {

		//lezione su metodi di output
		metodi_output.main(null);
		
		//lezione su variabili
		variabili.main(null);
		
		//lezione sui tipi di dati
		tipi_di_dati.main(null);
				
	}

}

class metodi_output{

	public static void main(String[] args){
		System.out.print("Ciao");  //manda a schermo
		System.out.print("Ciao di nuovo\n");  //utilizza \n per newline
		
		System.out.println("Ciao");  //manda a schermo nuova riga
		System.out.println("Ciao di nuovo");  //manda a schermo nuova riga
	}

}

class variabili{

	public static void main(String[] args){
		int x;	//dichiarazione
		x = 45;	//assegnazione
		
		int y = 30;	//inizializzazione (comprende dichiarazione e assegnazione)
		
		System.out.println(x);
		
		int camelCase;	//usato per le variabili
		int SNAKE_CASE; //usato per le costanti
	}

}

class tipi_di_dati{

	public static void main(String[] args){
		boolean bool = true;
		byte b = 127;
		short s = -32768;
		int i = 2000000000;
		long l = 3000000000000L;
		
		float f = 5.12345f;
		double d = 5.12345678912345;
		
		char c = 'f';
		String stringa = "fffffffff";
		
		//I tipi di dati si dividono tra primitive e reference (come String)
		//le primitive sono fornite dal sistema e cominciano con la minuscola
		//le reference cominciano con la maiuscola
		
		stringa.toLowerCase(); //le reference forniscono anche metodi e attributi per lavorare su quel tipo di dati
	}

}
