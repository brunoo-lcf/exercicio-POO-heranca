package POO_Herança;

public class PessoaFisica extends Cliente {

	private String cpf;

	public PessoaFisica(String nome, int idade, String endereco, String telefone, String cpf) {
		super(nome, idade, endereco, telefone);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void vizualizar() {
		System.out.println("\nCliente: " + getNome() + "\nIdade: " + getIdade() + "\nEndereço: " + getEndereco()
				+ "\nTelefone: " + getTelefone() + "\nCpf: " + cpf);
	}

}
