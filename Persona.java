//DEFINIZIONE DI UNA CLASSE
/*
 * E' importante notare che in questi esempi si rende possibile l'accesso e la manipolazione diretta
 * degli attributi, che ovviamente si vuole evitare.
 * Si approfondisce questo aspetto (variabili private) in altre lezioni.
 */

public class Persona {

	String nome;
	String cognome;
	int eta;
	String colorePreferito;
	
	Persona(String nome, String cognome, int eta, String colorePreferito){	//costruttore con argomenti
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.colorePreferito = colorePreferito;
    }

	void saluta() {
		System.out.println("Ciao sono " + nome);
	}
	
	void cammina() {
		System.out.println("Sto camminando...");
	}
}

class Prova {				//non ho dichiarato alcun costruttore, quindi Java ne aggiungerà automaticamente uno senza argomenti
    						//e tutti gli attributi saranno inizializzati con valori di default (NULL per nome, 0 per età e false per adulto)
	String nome;
    int eta;
    boolean adulto;
}