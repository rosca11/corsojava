public class Insegnante extends Persona{

	String materia;
	
	Insegnante(String nome, String cognome, int eta, String materia){
		super(nome, cognome, eta, null);
		this.materia = materia;
	}
	
	void insegna() {
		System.out.println("sto insegnando...");
	}
	
	@Override			//notazione che indica che si sta sovrascrivendo un metodo ereditato
	void saluta() {
		System.out.println("Buongiorno ragazzi!");
	}
}