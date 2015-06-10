
import java.util.Scanner;

public class Aula5 {
	
public static void lerNum(){
		
		Scanner leitor = new Scanner(System.in);		
		int[] numeros = new int [5];
		int i;
		for (i = 0; i<5; i++){			
			System.out.println("digite  5 numeros, teclando enter após cada um ");
			numeros[i] = leitor.nextInt();
		}
		
		System.out.println("ordem normal");
		for(i=0;i<5;i++){
			
			System.out.println(numeros[i]);
		}	
		
		System.out.println("ordem inversa");
		for (i = 4; i >= 0; i--){
			System.out.println(numeros[i]);
		}	
		leitor.close();
	}

public static void ordenaInt(){
	
	int[] vetor = new int[5];
	int aux,i;
	int maior;
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("digite  5 numeros, teclando enter após cada um ");
	
	for(i = 0; i < 5; i++){
		
		vetor [i] = leitor.nextInt();
	}
	
	for(i = 0; i < 5; i++){	
		
			System.out.println(vetor[i]);
	}
	
	maior = vetor[0];
	
	for(i = 0; i < 4; i++){
		
		if(vetor[i]  > vetor[i+1]){
			aux = vetor[i];
			vetor[i] = vetor[i+1];
			vetor[i+1] = aux;					
			
		}		
			
	}
	
	for(i = 0; i < 5; i++){	
		
		System.out.println(vetor[i]);
	}
	
	leitor.close();
	
}


	public static void main(String[] args) {

		ordenaInt();
		
	}

}
