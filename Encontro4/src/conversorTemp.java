import java.util.Scanner;
import java.io.IOException;  
import java.lang.StringBuffer;  
import java.lang.NumberFormatException;



public class conversorTemp {
	
	public static double c2f(double temperatura){
		
		return (temperatura = (9*temperatura/5) + 32);
		
	}
	
public static double f2c(double temperatura){
		
		return (temperatura = 5*(temperatura-32)/9);
		
	}

public static char readChar () {  
    int in = 0;  
    char chr;  
    int cont = 0;  
    StringBuffer Valor = new StringBuffer("");  
    do {  
        try {  
            in = System.in.read();  
            chr = (char) in;  
            if ((in != 10) & (in != 13)) {  
                if ( cont == 0 ) {  
                    Valor.append(chr);  
                }  
                cont++;  
            }  
        } catch (IOException e) { } 
        
    } while (in != 10);  
    return Valor.charAt(0);  
}  


	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		char op;
		double original, convertido;
		
		System.out.println("Selecione C caso a temperatura esteja em Graus Celsius");
		System.out.println("Selecione F caso a temperatura esteja em Graus Farenheit");
		
		op = readChar();
		
		//try{
		
		switch(op){
		
		case 'C': {
			
			System.out.println("\nDigite a temperatura" );
			
			original = ler.nextFloat();
			convertido = c2f(original);
			System.out.println(original + "°C equivale a " + convertido + "°F");
			break;
						
		}
		case 'F': {
			
				System.out.println("Digite a temperatura ");
				original = ler.nextFloat();
				convertido = f2c(original);
				System.out.println(original + "°F a " + convertido + "°C");
				break;						
			}		
		
		}
		//} catch ()
		
		//System.out.println(op);
		
		ler.close();		
		
	//		}while(op=='C' || op=='F');

}
}
