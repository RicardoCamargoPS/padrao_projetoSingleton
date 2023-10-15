package padrao_projetoBuider.gof;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String enderco;
	
	public Pessoa(PessoaConstrutor construtor) {
		this.nome = construtor.nome;
		this.idade = construtor.idade;
		this.enderco = construtor.endereco;		
	}
	
	public String toString() {
		return "Nome : " + nome + ", idade " + idade + ", endereço " + enderco;				
	}

}
