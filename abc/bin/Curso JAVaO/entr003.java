import java.util.Scanner;

public class entr003 {	
	public static void main(String[] args) {		
		//System.out.println(args[0]);
		
		System.out.println("\nAlohaaa\n");
		System.out.println("\nEscreva seu nome: ");
		
		Scanner abc = new Scanner(System.in);
		
		String nome = abc.nextLine();
		
		System.out.println("Bem-vindo " + nome + ".");
	}
}