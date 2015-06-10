
/*EXERCÃ�CIO 4:
		- Entre com uma frase com 6 palavras
			Ex: Eu amo java, java Ã© VIDA...
		- Quebre a string em um array de String (DICA: utilize o mÃ©todo split da classe String)
		- Gere uma frase nova com as palavras de forma aleatÃ³ria
		- Imprima a frase em uma Ãºnica linha
			Ex: VIDA... java, java Eu amo
*/

import java.util.Scanner;
import java.util.Random;

public class Exe4 {	
		
	public static void lerNomes(){
		
		Scanner leitor = new Scanner(System.in);		
		String[] palavras = new String [6];
		int i, num;
		Random sort = new Random();
		
		int[] vetor = new int[6];
		
		
		for (i = 0; i < 5; i++){			
			System.out.println("digite as palavras, teclando enter após cada uma ");
			palavras[i] = leitor.nextLine();
		}		
		for (i = 4; i >= 0; i--){
			System.out.println(palavras[i]);
		}	
		
		for (i = 0; i < 6; i++){
			
			int numSort = sort.nextInt();
			
		}
		
		leitor.close();
	}
	
	public static void main(String[] args) {		
		lerNomes();		
	}
}