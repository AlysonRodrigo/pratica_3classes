package br.com.alysonrodrigo;

public class Principal {

	 public static void main(String[] args){
	        Automovel carro = new Carro("Gol","Preto","2017",4);
	        carro.locomover();
	 
	        Automovel moto = new Moto("Honda","Preto","2017",true);
	        moto.locomover();
	 }
}
