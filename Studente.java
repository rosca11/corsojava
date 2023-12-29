public class Studente extends Persona{
	
	String materiaPreferita;
	String classe;
	
	Studente(String nome, String cognome, int eta, String materiaPreferita, String classe){
		super(nome, cognome, eta, null);
		this.materiaPreferita = materiaPreferita;
		this.classe = classe;
	}
	
	void studia() {
		System.out.println("sto studiando...");
	}
	
	@Override			//notazione che indica che si sta sovrascrivendo un metodo ereditato
	void saluta() {
		System.out.println("Buongiorno prof!");
	}
}