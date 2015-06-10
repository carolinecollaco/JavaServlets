
public class Encontro4 {

	
	public static boolean isPositive(int numero){
		if (numero < 0){
			return Boolean.FALSE;
			
		}else{
			return Boolean.TRUE;
		}
	}
	
	public static boolean isZero(int numero){
		if (numero != 0){
			return Boolean.FALSE;
			
		}else{
			return Boolean.TRUE;
		}
			
	}
	
	public static int calcDelta(int a, int b, int c){
		return ((a*a) - 4*a*c);
	}
	
	public static int maior(int a, int b){
		
		if (a > b){
			return a;
			
		}else{
			return b;
		}
		
	}
	
public static int maiorDeTres(int um, int dois, int tres){		
		
	int maior = Math.max(um, dois);
	if (maior < tres){				
		maior = tres;
		}
			
		return maior;		
	}

public static int menorDeTres(int um, int dois, int tres){		
	
	int menor = Math.min(um, dois);
	if (menor > tres){				
		menor = tres;
		}
			
		return menor;		
	}

	
	
	public static void main(String[] args) {
		

		System.out.println(isPositive(-12));
		System.out.println(isZero(0));
		System.out.println(calcDelta(2,3,4));		
		System.out.println(maior(10,18));
		System.out.println(maiorDeTres(12,135,65));
		System.out.println(menorDeTres(12,5,65));
		
	}

}
