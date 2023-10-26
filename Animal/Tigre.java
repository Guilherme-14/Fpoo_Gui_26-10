package Animal;

public class Tigre extends Animal{

	public Tigre(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void dormir() {
		System.out.println("O Lobo está dormindo");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O Lobo está caminhando");
	}
	
	@Override
	public void correr() {
		System.out.println("O Lobo está correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Miando");
	}
}
