
public class Main {
	
	public static void main(String[] args) {
		Cliente shelia = new Cliente();
		shelia.setNome("Shelia");

		// TODO Auto-generated method stub
		Conta cc = new ContaCorrente(shelia);
		Conta poupanca = new ContaPoupanca(shelia);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
