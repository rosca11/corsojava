import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		//lezione su metodi di output
		Metodi_output.main(null);
		
		//lezione su variabili
		Variabili.main(null);
		
		//lezione sui tipi di dati
		Tipi_di_dati.main(null);

		//lezione su input da utente
		Input_utente.main(null);

		//lezione su operazioni aritmetiche
		Operazioni_aritmetiche.main(null);

		//lezione sulla classe Math
		Classe_math.main(null);

		//lezione su operatori di comparazione
		Operatori_comparazione.main(null);

		//lezione su operatori logici
		Operatori_logici.main(null);
				
	}

}

class Metodi_output{

	public static void main(String[] args){
		System.out.print("Ciao");  //manda a schermo
		System.out.print("Ciao di nuovo\n");  //utilizza \n per newline
		
		System.out.println("Ciao");  //manda a schermo nuova riga
		System.out.println("Ciao di nuovo");  //manda a schermo nuova riga
	}

}

class Variabili{

	public static void main(String[] args){
		int x;	//dichiarazione
		x = 45;	//assegnazione
		
		int y = 30;	//inizializzazione (comprende dichiarazione e assegnazione)
		
		System.out.println(x);
		
		int camelCase;	//usato per le variabili
		int SNAKE_CASE; //usato per le costanti
	}

}

class Tipi_di_dati{

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

class Input_utente{
	
	public static void main(String[] args){	
		/* 
		 * LEZIONE SU INPUT DA UTENTE
		 * importare java.util.Scanner
		 * creare oggetto scanner
		 * creare domande per utente: nome, cognome, eta, citta
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual è il tuo nome?");
		String nome = scanner.nextLine();
		
		System.out.println("Qual è il tuo cognome?");
		String cognome = scanner.nextLine();
		
		System.out.println("Qual è la tua età?");
		int eta = scanner.nextInt();
		
		scanner.nextLine(); // spiegazione sotto l'output
		
		System.out.println("In che città vivi?");
		String citta = scanner.nextLine();
		
		System.out.println("Ciao " + nome + " " + cognome);
		System.out.println("Hai " + eta + " anni");
		System.out.println("Vivi a " + citta);
		
		/*
		 * Si è aggiunto uno scanner.nextLine() dopo lo scanner.nextInt()
		 * poiché, se questo non ci fosse allora il programma non permetterebbe 
		 * l'inserimento dell'input successivo:
		 * 
		 * ESEMPIO: 
		 * (1) quando inserisco il nome, inserisco "Marco" e il carattere \n (newline)
		 * con il tasto invio. Poiché scanner.nextLine() legge l'intera riga,
		 * inclusi nome e \n, non avrò piu \n nel buffer
		 * 
		 * (2) quando inserisco l'età, inserisco "20" e il carattere \n, ma poiché
		 * scanner.nextInt() consuma solo parzialmente la riga, questo legge il numero
		 * ma lascia \n nel buffer; in questo modo, il \n rimasto nel buffer verrà letto
		 * dal prossimo scanner.nextLine() come riga vuota
		 */
	}
	
}

class Operazioni_aritmetiche{
	
	public static void main(String[] args){	
		/* 
		 * LEZIONE SU OPERAZIONI ARITMETICHE
		 * operatori aritmetici + - / * %
		 * shorthand
		 * incremento e decremento
		 * esempi di espressioni
		 */
		
		int x = 11;
		int y = 5;
		int z;
		
		z = x + y;
		z = x - y;
		z = x * y;
		z = x / y;
		z = x % y;
		
		z = x + y;
		System.out.println(z);
		System.out.println(x+y);
		
		x = x + 3;	//incrementa se stesso di 3
		x += 3;		//shorthand dell'addizione a se stesso
		
		//ESEMPI DI SHORTHAND
		x *= 3;
		x /= 3;
		
		x++;	//incrementa di 1 il valore di x
		x--;	//decrementa di 1 il valore di x
		
		x = 11;
		y = 3;
		z = 9;
		int result = ((x + y) * y + (4-2)) * z; //espressione aritmetica
	
		System.out.println(result);	
	}
	
}

class Classe_math{
	
	public static void main(String[] args){	
		/* 
		 * LEZIONE SULLA CLASSE MATH
		 * alcuni metodi: abs, min, max, pow, sqrt
		 * attributi: PI
		 */
		
		System.out.println(Math.abs(-55));	//valore assoluto di 55
		System.out.println(Math.min(55,21));	//valore minimo tra un insieme di valori
		System.out.println(Math.max(55,21));	//valore massimo tra un insieme di valori
		System.out.println(Math.pow(5, 2));	//potenza con base 5 ed esponente 2
		System.out.println(Math.sqrt(25));	//radice quadrata di 25
		
		System.out.println(Math.PI);	//pi greco
	}
	
}

class Operatori_comparazione{
	
	public static void main(String[] args){	
		/* 
		 * LEZIONE SUGLI OPERATORI DI COMPARAZIONE
		 * operatori:
		 * >
		 * >=
		 * <
		 * <=
		 * ==
		 * !=
		 */
		
		boolean risultato = 3 > 10;
		
		System.out.println(risultato);	//tue o false
		System.out.println(3 < 10);		//true o false
		
		risultato = 33 > 10;
		System.out.println(risultato);
		
		risultato = 10 >= 10;
		System.out.println(risultato);
		
		risultato = 9 < 10;
		System.out.println(risultato);
		
		risultato = 9 <= 9;
		System.out.println(risultato);
		
		risultato = 10 == 10;
		System.out.println(risultato);
		
		risultato = 11 != 10;
		System.out.println(risultato);
	}
	
}

class Operatori_logici{
	
	public static void main(String[] args){	
		/* 
		 * LEZIONE SUGLI OPERATORI LOGICI
		 * operatori: AND OR NOT
		 */

		boolean x;
		x = 3 > 10;		//true se 3 è maggiore di 10, false altrimenti
		x = 3 % 2 == 0;	//true se 3 è pari, false altrimenti
		
		x = 3 < 10 && 3 % 2 == 0;	//true se entrambe le condizioni sono verificate, false altrimenti
		System.out.println(x);
		
		x = 3 < 10 || 3 % 2 == 0;	//true se almeno una delle due condizioni è verificata, false altrimenti
		System.out.println(x);
		
		x = !(3 < 10);			//negazione del risultato di (3 < 10)
		System.out.println(x);
		
		boolean y = ((3 < 10 && 3 % 2 == 0) || (6 < 10 && 6 % 2 == 0)) && 10 < 100;
		System.out.println(y);
	}
	
}

