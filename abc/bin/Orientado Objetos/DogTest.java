package abc;

public class DogTest {

	public static void main(String[] args) {
		Dog pitbull = new Dog();
		pitbull.raça = "Piiit BUUUUUUU";
		pitbull.tamanho = 40;
		pitbull.latir();
		
		Dog viravira = new Dog();
		viravira.raça = "VIrrraA Cavalooo";
		viravira.tamanho = 30;
		viravira.latir();
		
		Dog abu = new Dog();
		abu.raça = "Cavalooo";
		abu.tamanho = 20;
		abu.latir();
	}

}
