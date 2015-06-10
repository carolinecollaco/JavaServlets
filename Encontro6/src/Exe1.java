
import java.util.ArrayList;
import java.util.List;

public class Exe1 {
	
	//método imprime a lista
	public static void imprimeCidade(List<String> cidades){
		
		System.out.println(cidades.toString());
		
	}
	
	//criar nova cidade
	public static void insereCidade(List<String> nova , String novaCidade){
		//List<String> nova = new ArrayList<String>();
		nova.add(novaCidade);
		
	}
	
	//Excluir cidade
	public static void deletaCidade(List<String> tirar , String cidadeAExcluir){
		//List<String> nova = new ArrayList<String>();
			tirar.remove(cidadeAExcluir);
		
	}
	

	public static void main(String[] args) {
		List<String> cidades = new ArrayList<String>();
		
		cidades.add ("São Paulo");
		cidades.add ("Rio de Janeiro");
		cidades.add ("Salvador");
		cidades.add ("Belo Horizonte");
		cidades.add ("Porto Alegre");
		cidades.add ("Curitiba");
		cidades.add ("Recife");
		cidades.add ("Florianópolis");
		cidades.add ("Natal");
		cidades.add ("Brasília");
		
		imprimeCidade(cidades);
		
		insereCidade(cidades, "Londrina");
		insereCidade(cidades,"Pato Branco");
				
		imprimeCidade(cidades);
		deletaCidade(cidades,"Natal");
		imprimeCidade(cidades);
		
	}

}
