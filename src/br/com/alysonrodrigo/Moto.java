package br.com.alysonrodrigo;

public class Moto extends Automovel {

	public boolean partida_eletrica;
	 
	public Moto(String marca, String cor, String ano, boolean partida_eletrica){
	   super(marca,cor,ano);
	   this.partida_eletrica = partida_eletrica;
	}
	
	
	@Override
	public void locomover() {
		System.out.println("Voce esta fazendo sua moto andar");
	}

}
