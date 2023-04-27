package POO_Herança;

public class PessoaJuridica extends Cliente {

	private String cnpj;

	public PessoaJuridica(String nome, int idade, String endereco, String telefone, String cnpj) {
		super(nome, idade, endereco, telefone);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void vizualizar() {
		System.out.println("\nCliente: " + getNome() + "\nIdade: " + getIdade() + "\nEndereço: " + getEndereco()
				+ "\nTelefone: " + getTelefone() + "\nCnpj: " + cnpj);
	}
}