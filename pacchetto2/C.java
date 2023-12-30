package pacchetto2;
import pacchetto1.*;

public class C extends A{

	public static void main(String[] args) {
		
		B prova = new B();
		prova.nome_default = "Marco";	//posso accedere a nome_default
		
		C prova2 = new C();
		prova2.nome_protected = "Marco";	//posso accedere a nome_protected
	}
	
}