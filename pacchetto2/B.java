package pacchetto2;
import pacchetto1.*;

public class B{

	String nome_default = "Luca";	//dichiarando nome come default, potrò
									//accedervi solo dalla stessa classe, e quindi da questo file,
									//o dallo stesso package
	
	public String nome_public = "Luca";	//dichiarando nome come public, potrò
										//accedervi sia dalla stessa classe, e quindi da questo file,
										//sia dallo stesso package, in sottoclassi e in package separati
	
	public static void main(String[] args) {
		
		A prova = new A();
//		prova.nome_protected = "Marco";	//non posso accedere a nome_protected
		
	}
	
}