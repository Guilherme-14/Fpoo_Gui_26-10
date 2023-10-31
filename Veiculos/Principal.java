package Veiculos;

public class Principal {

	public static void main(String[] args) {
		Carro c1 = new Carro("XYZ2020" , "OPALA" , "VERMELHO" , "2000");
		c1.acelerar();
		c1.frear();
		c1.ligar();
		c1.virar();
	
		Onibus o1 = new Onibus("XYZ2020" , "OPALA" , "VERMELHO" , "2000");
		o1.acelerar();
		o1.frear();
		o1.ligar();
		o1.virar();
	}

}
