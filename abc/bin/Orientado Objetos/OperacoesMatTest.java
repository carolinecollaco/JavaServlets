package abc;

public class OperacoesMatTest {

	public static void main(String[] args) {
		OperacoesMat num = new OperacoesMat();
		/*int top = num.maior(15, 2);		
		
		System.out.println(top);
		
		double result = num.soma(23, 19);
		System.out.println(result);
		
		int par = num.maior(6, 3);
		int impar = num.maior(7, 2);
		double somar = num.maior(par, impar);
		System.out.println(somar);	*/	
		
		int rai = num.raiz(27);	
		System.out.println(rai);
		
		int res = num.raizes(27);	
		System.out.println(res);
	}
}
