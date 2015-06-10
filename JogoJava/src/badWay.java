import java.util.*;


public class badWay {
	
	// cria o tabuleiro
	public static void criaTabuleiro(int lin, int col){	
		
		String[][] tabuleiro = new String [5][5];
		
		for (lin = 0; lin < 5; lin++) {
			for (col = 0; col < 5; col++) {
				tabuleiro[lin][col] = "*";
			}
		}
		
		for (lin = 0; lin < 5; lin++) {									
				for (col = 0; col < 5; col++) {					
					System.out.print("\t" + tabuleiro [lin][col]);
				}				
				System.out.print("\n" );
			}	
	}	
	
	public static void colocaArmadilhas(){
		Random sorteio = new Random();
		for (int lin = 0; lin < 5; lin++){
			for (col = 0; col < 5; col++)
				sortLin = sorteio.nextInt();
				sorteCol = sorteio.nextInt();
			}
			
		}
		
		
		
		//String[] armas = {"machado", "fósforo", "corda", "detector de mina", "soro atiofídico"}; 
		
		String[] armadilhas = {"selva", "animais selvagens", "areia movediça", "mina", "cobra venenosa"};
		
	}
	
	public static void main(String[] args) {
		criaTabuleiro(5,5);
		
	}

}
