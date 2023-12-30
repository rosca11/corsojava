package pacchetto1;

public class A {

	protected String nome_protected = "Luca";	//dichiarando nome come protected potrò accedervi dalla stessa classe, e quindi da questo file,
												//dallo stesso package e in sottoclassi (anche se sono in package separati)
												//ma non in package separati
	
	private String nome_private = "Luca";	//dichiarando nome come private potrò accedervi solo dalla stessa classe,
											//e quindi da questo file

}
