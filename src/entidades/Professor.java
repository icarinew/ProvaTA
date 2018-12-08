package entidades;

public class Professor {
	private String nome;
	private int id;
	
	
	public Professor(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
	}
	
	public Professor() {
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
