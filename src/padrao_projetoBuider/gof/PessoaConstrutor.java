package padrao_projetoBuider.gof;

public class PessoaConstrutor {

	protected String nome;
	protected int idade;
	protected String endereco;

	public PessoaConstrutor() {

	}

	public PessoaConstrutor withNome(String nome) {
		this.nome = nome;
		return this;

	}
	
	public PessoaConstrutor withIdade(int idade) {
		this.idade = idade;
		return this;

	}
	
	public PessoaConstrutor withEndereco(String endereco) {
		this.endereco = endereco;
		return this;

	}
	
	public Pessoa construtor() {
        return new Pessoa(this);
    }

}
