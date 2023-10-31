package Veiculos;

public class Carro extends Veiculos{

	public Carro(String placa, String modelo, String cor, String ano) {
		super(placa, modelo, cor, ano);
	}

	@Override
	public void acelerar() {
		System.out.println("Está acelerando");
	}
	
	@Override
	public void frear() {
		System.out.println("Está freando");
	}
	
	@Override
	public void virar() {
		System.out.println("Está virando");
	}
	
	@Override
	public void ligar() {
		System.out.println("Está ligado");
	}
	
}
