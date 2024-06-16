package pacchetto1;
import pacchetto2.*;

public class Main{

	public static void main(String[] args) {
		/*
		 * LEZIONE SUI MODIFICATORI DI ACCESSO
		 * Cosa sono
		 * creare 2 package con 2 classi
		 * 
		 * I modificatori di accesso servono per aggiungere un livello di sicurezza aggiuntivo
		 * nell'applicazione.
		 * 
		 * 			class   	package   	subclass  	 world
		 * public		si		si		  si		 si		
		 * protected		si		si		  si		 no
		 * default		si		si		  no		 no
		 * private		si		no		  no		 no
		 * 
		 * Possiamo avere uno scope limitato alla:
		 * - stessa classe (private)
		 * - stesso package (default)
		 * - stesso package + sottoclassi, anche se si trovano su un package diverso (protected)
		 * - qualsiasi altro package (public)
		 */
		
		B prova = new B();
//		prova.nome_default = "nome";	//non posso accedere a nome_default
	
		prova.nome_public = "nome";	//posso accedere a nome_public
		
		A prova2 = new A();		
		prova2.nome_protected = "nome";	//posso accedere a nome_protected
		
//		prova2.nome_private = "nome";	//non posso accedere a nome_private

	}

}
