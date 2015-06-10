import java.util.Scanner;

public class raio_dia_area006{
	public static void main(String[] args){
		Scanner raio = new Scanner(System.in);
		System.out.println("Tamanho do raio: ");
		
		double medida = raio.nextDouble();
		
		double diametro = 2 * medida;
		System.out.println("Tamanho do diametro: " + diametro);
		
		double pi = Math.PI;
		
		double circunferencia = 2 * pi * medida;
		System.out.println("Tamanho da circunferencia: " + circunferencia);
		
		double area = pi * (medida * medida);
		System.out.println("Tamanho da area: " + area);
		
		System.out.print("\n\t    __    \n"); 
		System.out.print("\t    ||    \n"); 
		System.out.print("\t    --    \n"); 
		System.out.print("\t   ----   \n"); 
		System.out.print("\t  ------  \n"); 
		System.out.print("\t -------- \n"); 
		System.out.print("\t----------\n"); 
		System.out.print("\t |      |\n"); 
		System.out.print("\t |  ok  |\n"); 
		System.out.print("\t |      |\n"); 
		System.out.print("\t |      |\n"); 
		System.out.print("\t |  ok  |\n"); 
		System.out.print("\t |      |\n"); 
		System.out.print("\t --------\n"); 
		System.out.print("\t --------"); 
	}
}