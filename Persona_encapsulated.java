//DEFINIZIONE DI PERSONA UTILIZZANDO L'INCAPSULAMENTO
public class Persona_encapsulated{
	
	private String nome;
	private String cognome;
	
	Persona_encapsulated(String nome, String cognome){	
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	//utilizzati nella lezione sulla copia di oggetti
	public void copy(Persona_encapsulated persona) {		//TRAMITE METODO
		this.setNome(persona.getNome());
		this.setCognome(persona.getCognome());
	}
	Persona_encapsulated(Persona_encapsulated persona) {	//TRAMITE COSTRUTTORE
		this.setNome(persona.getNome());
		this.setCognome(persona.getCognome());
	}
	
}