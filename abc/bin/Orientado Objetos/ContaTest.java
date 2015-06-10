package abc;

public class ContaTest {

	public static void main(String[] args) {
		Conta usu = new Conta();
		
		usu.clinte = "José";
		usu.saldo = 123;
		usu.mostraSaldo();
		
		usu.sacaSaldo(100);
		usu.mostraSaldo();
		
		usu.depositoSaldo(50);
		usu.mostraSaldo();
		
		Conta adm = new Conta();
		
		adm.clinte = "Felipe";
		adm.saldo = 230;
		
		usu.transfereSaldo(adm, 23);
		
		usu.mostraSaldo();
		adm.mostraSaldo();
	}

}
