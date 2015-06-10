package abc;

public class Conta {
	String clinte;
	double saldo;
	
	void mostraSaldo(){
		System.out.println("Eiii mo�o seu saldo � " + saldo);
	}
	void sacaSaldo(double valor){
		saldo = saldo - valor;
	}
	void depositoSaldo(double valor){
		saldo = saldo + valor;
	}
	void transfereSaldo(Conta adm, double valor){
		this.sacaSaldo(valor);
		adm.depositoSaldo(valor);
	}
}
