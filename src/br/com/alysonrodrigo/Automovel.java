package br.com.alysonrodrigo;

public abstract class Automovel {
	
	 public String marca;
	 public String cor;
	 public String ano;
	 
	 public Automovel(String marca, String cor, String ano){
	    this.marca = marca;
	    this.cor = cor;
	    this.ano = ano;
	 }
	 
	 public abstract void locomover();
}
