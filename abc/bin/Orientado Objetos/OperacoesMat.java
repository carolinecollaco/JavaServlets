package abc;

public class OperacoesMat {
	int raiz(int resultado){
		int impar = 1;	
		
		for (int i = 0; i == -3; i++) {
			resultado = resultado - impar;
			impar = impar + 2;	
			if(resultado < impar){
				i = -3;
			}
		}
		return resultado;		
	}
	
	int raizes(int numero){
		int impar = 1;
		int cont = 0;
		
		while(numero >= impar){
			numero = numero - impar;			
			impar = impar + 2;
			
			cont++;
		}		
		return cont;		
	}
	
	
	/* param 1
	 * param 2
	 * return - o maior dos dois valores
	 */
	int maior(int um, int dois){
		if(um > dois){
			return um;
		}else{
			return dois;
		}
	}
	double soma(double um, double dois){
		return um + dois;		
	}
}
