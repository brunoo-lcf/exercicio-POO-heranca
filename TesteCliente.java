package POO_Herança;

public class TesteCliente {

	public static void main(String[] args) {
										
		Cliente cliente1 = new PessoaFisica ("Bruno",22,"R. Airton, 00","1191234-4321","111.222.333-44");
		cliente1.vizualizar();
		Cliente cliente2 = new PessoaFisica ("Samuel",24,"R. Brasil, 01","1194321-1234","555.666.777-88");
		cliente2.vizualizar();
		Cliente cliente3 = new PessoaJuridica ("Cleiton",21,"R. Cascalho, 02","1195678-8765","88.999.000/0001-22");
		cliente3.vizualizar();
		Cliente cliente4 = new PessoaJuridica ("Joao",29,"R. Dunas, 03","1198765-5678","99.888.777/0001-66");
		cliente4.vizualizar();
	}

}
