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

		//lezione sulla struttura di controllo if
		Struttura_if.main(null);

		//lezione sulla struttura di controllo switch
		Struttura_switch.main(null);

		//lezione sui cicli While / Do while
		Ciclo_while.main(null);

		//lezione sul ciclo for
		Ciclo_for.main(null);

		//lezione su array
		Array.main(null);
		
		//lezione su array bidimensionali
		Array_2d.main(null);

		//lezione su metodi stringhe
		Metodi_stringhe.main(null);

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

class Struttura_if{
	
	public static void main(String[] args){	
		/* 
		 * LEZIONE SULLA STRUTTURA IF
		 * L'if è una struttura di controllo condizionale
		 * che permette di eseguire un blocco di codice solo se
		 * una determinata condizione è vera.
		 * 
		 * IF
		 * ELSE
		 * ELSE IF
		 * if annidati
		 * ternary operator
		 */
		
		boolean isOnline = true;
		String nome = "Luca";
		int num = 3;
		
		if(3 < 10) {
			System.out.println("ok");
		}
		
		if(isOnline){
			System.out.println("è online");
		}else {
			System.out.println("non è online");
		}
		
		if(nome == "Luca") {
			System.out.println("è Luca");
		}else if(nome == "Marco") {
			System.out.println("è Marco");
		}else {
			System.out.println("è qualcun'altro");
		}
		
		if(num < 10) {
			System.out.println("è minore di 10");
			if(num % 2 == 0) {
				System.out.println("è pari");
			}else {
				System.out.println("è dispari");
			}
		}else {
			System.out.println("non è minore di 10");
		}
		
		String x = 3 < 10 ? "buongiorno" : "buonasera";	//if con operatore ternario
		System.out.println(x);
	}
	
}

class Struttura_switch{

	public static void main(String[] args){
		/*
		 * LEZIONE SULLA STRUTTURA SWITCH
		 * Lo switch è una struttura di controllo di flusso che consente di eseguire
		 * diverse istruzioni a seconda del valore di una variabile o di un'espressione.
		 * Uno switch è spesso utilizzato quando si desidera eseguire un blocco di codice
		 * diverso in base al valore di una variabile.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual è il tuo nome?");
		String nome = scanner.nextLine();
		
		switch(nome) {
		case "Luca":
			System.out.println("ciao Luca");
			break;
		case "Marco":
			System.out.println("ciao Marco");
			break;
		case "Anna":
			System.out.println("ciao Anna");
			break;
		case "Antonio":
			System.out.println("ciao Antonio");
			break;
		case "Edoardo":
			System.out.println("ciao Edoardo");
			break;
		default:
			System.out.println("ciao!");
		}
	}

}

class Ciclo_while{

	public static void main(String[] args){
		/*
		 * LEZIONE SUI CICLI WHILE / DO WHILE
		 * Il while è una struttura di controllo iterativa che consente di eseguire ripetutamente
		 * un blocco di istruzioni fintanto che una determinata condizione è vera.
		 * In altre parole, il "while" crea un ciclo che continua ad eseguire il suo blocco di codice
		 * finché la condizione specificata è valutata come vera.
		 * 
		 * Cos'è un ciclo
		 * A cosa serve un ciclo
		 * Ciclo while
		 * Ciclo do while
		 * 
		 * Un ciclo è un porzione di codice che ci permette di eseguire ripetutamente
		 * una o piu istruzioni finché una condizione è verificata.
		 * E' necessario quando non ci conosce a priori il numero di volte che occorre
		 * ripetere le istruzioni.
		 */
		
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		
		do {
			System.out.println("do while " + i);
			i++;
		} while(i<5);
		
		/*
		 * il do while differisce dal while per il fatto che permette
		 * di eseguire almeno una volta il blocco di codice anche se la
		 * condizione non è verificata
		 */
	}

}

class Ciclo_for{

	public static void main(String[] args){
		/*
		 * LEZIONE SUL CICLO FOR
		 * Il costrutto for è una struttura di controllo iterativa,
		 * spesso utilizzata quando si conosce a priori il numero
		 * di iterazioni che si desidera eseguire
		 * 
		 * Ciclo for
		 * for annidati
		 * versione enhanced/foreach
		 * break e continue
		 */
		
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("riga " + i);
			for(int j=0; j<5; j++) {
				System.out.println("colonna " + j);
			}
		}
		
		int[] numeri = {10, 20, 30, 40, 50};
		for(int numero: numeri) {			//versione enhanced del ciclo for, chiamata foreach in altri linguaggi;
			System.out.println(numero);		//si usa con gli array
		}
		
		for(int i=0; i<5; i++) {
			if(i == 4) {
				break;
			}else if(i == 2) {
				continue;
			}
			System.out.println(i);
		}
		
		/*
		 * break e continue sono istruzioni di controllo utilizzate
		 * all'interno di cicli per alterare il flusso di esecuzione
		 * del programma:
		 * - break consente di uscire dal ciclo
		 * - continue consente di saltare l'iterazione corrente
		 */
	}

}

class Array{

	public static void main(String[] args){
		/*
		 * LEZIONE SUGLI ARRAY
		 * Che cosa sono gli array
		 * Creare un array vuoto
		 * Associare elementi
		 * Array.tostring
		 * lunghezza array
		 * modificare elementi
		 * mostrare elementi
		 * ciclare array con for e foreach
		 * 
		 * Gli array sono strutture dati che consentono di memorizzare
		 * una collezione di elementi dello stesso tipo in una sequenza
		 * contigua di memoria.
		 * 
		 * Gli array in Java si comportano come oggetti, infatti:
		 * - sono gestiti per riferimento: una variaile array è una reference
		 * - vengono creati dinamicamente con new
		 * - vengono distrutti automaticamente dal garbage collector quando
		 *   non servono piu, ovvero quando non ci sono piu riferimenti a quell'oggetto
		 * 
		 * Tuttavia non sono propriamente oggetti poiché non sono istanze di una classe;
		 * non esiste infatti una classe Array
		 *
		 * Il tipo di elemento di un array può essere un tipo di dato primitivo
		 * o una reference, che quindi punta a un oggetto (istanza di String o un'altra classe).
		 * 
		 * E' importante notare che quando dichiariamo un array in questo modo:
		 * int[] a;
		 * stiamo semplicemente creando una reference ad un array,
		 * e non propriamente un array, poiché infatti non è stata
		 * specificata la dimensione
		 * 
		 * Per creare l'array usiamo l'operatore new, specificandone la dimensione:
		 * a = new int[50];
		 * 
		 * In questo modo abbiamo creato un array di 50 interi
		 * e a è una reference ad esso.
		 * 
		 * In java possiamo anche avere array di oggetti, o meglio array di reference ad oggetti.
		 * Se scriviamo:
		 * String[] a;
		 * a = new String[4];
		 * 
		 * Abbiamo creato un array di riferimenti a[], infatti creando l'array non ho creato
		 * automaticamente anche gli oggetti di tipo String: devo farlo esplicitamente
		 * 
		 * a[0] = new String();
		 * a[1] = new String();
		 * ...
		 * ...
		 * OPPURE
		 * for(int i=0; i<4; i++){
		 * 	a[i] = new String();
		 * 
		 */
		
		int[] numeri = new int[3];
		int[] numeri2 = {10, 20, 30, 40}; 	//estensione sintattica che consente di creare un array
											//di n elementi e assegnare loro un valore in un'unica istruzione.
											//L'elenco di valori tra parentesi graffa prende il nome
											//di inizializzatore e consente in un colpo solo di creare l'array,
											//definre la dimensione dell'array e attribuire i valori iniziali
											//dei suoi elementi; è solo una scorciatoia, infatti l'effetto
											//è lo stesso della serie di istruzioni standard
		numeri[0] = 10;
		numeri[1] = 20;
		numeri[2] = 30;
		
		System.out.println(numeri.length);	//numero di elementi dell'array
		
		System.out.println(numeri[0]);	//primo elemento dell'array
		numeri[0] = 100;
		System.out.println(numeri[0]);
		
		System.out.println(numeri[numeri.length-1]);	//ultimo elemento dell'array
		
		for(int i=0; i<numeri.length; i++) {	//iterare un array stampandone gli elementi
			System.out.println(numeri[i]);
		}
		
		for(int numero: numeri2) {				//iterare un array con foreach
			System.out.println(numero);
		}
		
		System.out.println(numeri.toString());

		String[] a = new String[3];		//crea un array di tre reference di tipo String
		for(int i=0; i<3; i++){
			a[i] = new String();	//crea un istanza (oggetto) di String e la associa alla reference a[i]		
		}

		/*
		 * In questo esempio si è utilizzata la classe String per semplicità:
		 * E' importante notare che l'uso di "new String()" per creare nuove instanze
		 * di String non è comune in Java; si preferisce di solito invece la sintassi
		 * delle stringhe letterali (a[i]="") come convenzione comune, in particolare a causa
		 * di alcune ottimizzazioni automatiche per le stringhe letterali che Java effettua automaticamente
		 * per migliorare l'efficienza e risparmiare risorse.
		 * Utilizzare stringhe letterali quando possibile contribuisce a sfruttare queste ottimizzazioni,
		 * di conseguenza a meno che non ve ne sia motivo si tende a non utilizzare il "new String()".
		 */
	}

}

class Array_2d{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SU ARRAY 2D
		 * Cosa sono gli array 2D
		 * Creare un array 2D in entrambi i modi: creazione e poi assegnamento o inizializzazione diretta
		 * accedere agli elementi degli array
		 * ciclare con for e foreach
		 * 
		 * Gli array 2D sono array di array, anche chiamati array multidimensionali.
		 * Un array 2D è essenzialmente la rappresentazione di una
		 * tabella (o matrice) sottoforma di array
		 */
		
		String[][] classi = new String[3][3];	//dichiara e crea un array bidimensionale di dimensione 3*3,
												//e quindi un array di tre array di stringhe di dimensione 3
		
		classi[0][0] = "Luca";
		classi[0][1] = "Anna";
		classi[0][2] = "Marco";
		
		classi[1][0] = "Edoardo";
		classi[1][1] = "Leonardo";
		classi[1][2] = "Antonio";
		
		classi[2][0] = "Arianna";
		classi[2][1] = "Paolo";
		classi[2][2] = "Andrea";
		
		System.out.println(classi[2][1]);
		classi[2][1] = "Giovanni";
		System.out.println(classi[2][1]);
		
		for(int classe=0; classe<classi.length; classe++) {							//stampa dell'array 2D con for
			System.out.println();
			for(int studente=0; studente<classi[classe].length; studente++) {
				System.out.print(classi[classe][studente] + " ");
			}
		}
		
		String[][] classi2 = {														//inizializzazione diretta di array 2D
									{"Luca", "Anna", "Marco"},
									{"Edoardo", "Leonardo", "Antonio"},
									{"Arianna", "Paolo", "Andrea"}
							 };
		
		System.out.println();
		for(String[] classe: classi) {						//stampa dell'array 2D con foreach
			System.out.println();
			for(String studente: classe) {
				System.out.print(studente + " ");
			}
		}
	}
	
}

class Metodi_stringhe{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SU METODI STRINGHE
		 * equals, equalsIgnoreCase, length, charAt,
		 * indexOf, isEmpty, toUpperCase, toLowerCase,
		 * trim, replace
		 */
		
		String nome = "Leonardo";
		boolean risultato;
		
		risultato = nome.equals("Leonardo");	//restituisce true se nome è uguale a "Leonardo", false altrimenti
		System.out.println(risultato);
		
		risultato = nome.equalsIgnoreCase("leoNardo");	//uguale ad equals ma non case sensitive
		System.out.println(risultato);
		
		int result1 = nome.length();	//restituisce il numero di caratteri
		System.out.println(result1);
		
		char result2 = nome.charAt(7);	//restituisce il carattere presente alla posizione 7
		System.out.println(result2);
		
		int result3 = nome.indexOf("a");	//restituisce l'indice della lettera a nella parola
		System.out.println(result3);
		
		risultato = nome.isEmpty();		//restituisce true se nome è una stringa vuota, false altrimenti
		System.out.println(risultato);
		
		String result4;
		result4 = nome.toUpperCase();	//restituisce la stessa stringa ma in maiuscolo
		System.out.println(result4);
		
		result4 = nome.toLowerCase();	//restituisce la stessa stringa ma in minuscolo
		System.out.println(result4);
		
		nome = "   Leonardo  ";
		nome = nome.trim();			//restituisce la stessa stringa rimuovendo gli spazi all'inizio e alla fine
		System.out.println(nome);
		
		result4 = nome.replace('o', 'w');	//restituisce la stessa stringa rimpiazzando tutte le occorrenze di o con w
		System.out.println(result4);
	}
	
}

