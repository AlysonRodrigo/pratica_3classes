package br.com.alysonrodrigo;

public class Principal {

	 public static void main(String[] args){
	        
	        Moto moto = new Moto("Honda","Preto","2017",true);
	        
	        System.out.println("INFORMA��O DO AUTOMOVEL");
	        System.out.println("MARCA: " + moto.marca);
	        System.out.println("COR: " + moto.cor);
	        System.out.println("ANO: " + moto.ano);
	        String escolha = moto.partida_eletrica ? "SIM" : "N�O";
	        System.out.println("PARTIDA ELETRICA? " + escolha);
	     
	        
	        moto.locomover();
	 }
}
