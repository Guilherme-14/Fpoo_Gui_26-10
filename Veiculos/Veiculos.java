package Veiculos;

public abstract class Veiculos {
	private String placa;
	private String modelo;
	private String cor;
	private String ano;
	
	public Veiculos(String placa, String modelo, String cor, String ano) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public abstract void acelerar();
	public abstract void frear();
	public abstract void virar();
	public abstract void ligar();
	
}
