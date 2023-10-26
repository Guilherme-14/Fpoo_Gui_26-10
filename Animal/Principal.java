package Animal;

public class Principal {

	public static void main(String[] args) {
		Lobo l1 = new Lobo ("Luiz" , "Masculino" , "Lobo-Guará");
		l1.dormir();
		l1.correr();
		l1.caminhar();
		l1.emitirSom();
		
		System.out.println("--------------");

		Leao l2 = new Leao ("David" , "Masculino" , "Africano");
		l2.dormir();
		l2.correr();
		l2.caminhar();
		l2.emitirSom();
		
		System.out.println("--------------");
		
		Tigre t1 = new Tigre ("Gui" , "Masculino" , "Tigre de Bengala");
		l2.dormir();
		l2.correr();
		l2.caminhar();
		l2.emitirSom();
		
		System.out.println("--------------");
		
		Cachorro c1 = new Cachorro ("Jp" , "Masculino" , "Poodle");
		l2.dormir();
		l2.correr();
		l2.caminhar();
		l2.emitirSom();
		
		System.out.println("--------------");
		
		Gato g1 = new Gato ("Rafinha" , "Masculino", "Siames");
		g1.dormir();
		g1.correr();
		g1.caminhar();
		g1.emitirSom();
	}

}
