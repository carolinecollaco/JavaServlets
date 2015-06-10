
public class jogo {

	public static void main(String[] args) {
		int[][] baralho = new int[10][4];
		// preenchimento da matriz
		
		for(int i = 0; i< 10; i++){
			
			for (int j = 0; j<4; j++){
				baralho[i][j] = 10 * i +j;
			}
		}

		// imprime baralho
		for(int i = 0; i< 10; i++){
			
			String linha = "";
			for (int j = 0; j<4; j++){
				linha += "\t " + linha + baralho[i][j];			
			}
			System.out.println("\n" + linha);
		} 
		// escolha da carta 1 (5 de paus)
		
		int cartaDoJogador1 = baralho[1][3];
		
		// escolha da carta 2 (K de ouros)
		int cartaDoJogador2 = baralho[6][0];
		
		if (cartaDoJogador1 > cartaDoJogador2){
			System.out.println("\nJOGADOR 1 VENCEU");
		}else{
			System.out.println("\nJOGADOR 1 VENCEU");
		}
			
				
	}

}
