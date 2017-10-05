package br.com.alysonrodrigo;

public class Carro extends Automovel{

	public int quantidade_porta;
	 
	public Carro(String marca, String cor, String ano, int quant_porta){
	    super(marca,cor,ano);
	    this.quantidade_porta = quant_porta;
	}
	
	@Override
	public void locomover(){
	   System.out.println("Voce esta fazendo seu carro andar");
	}
}
