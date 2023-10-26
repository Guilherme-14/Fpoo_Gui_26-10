package Calculos2;

public class Principal {

	public static void main(String[] args) {
		Calculando valor = new Calculando();
		System.out.println(valor.somar(4, 4));
		System.out.println(valor.sub(8, 4));
		System.out.println(valor.multi(4, 4));
		System.out.println(valor.div(8, 2));
		System.out.println(valor.exp(4, 2));
	}

}
