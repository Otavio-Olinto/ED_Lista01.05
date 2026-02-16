package controller;

public class SomaFracao {

	public SomaFracao() {
		super();
	}
		
	public double Sequencia(double num) {
		
		// A sequência começa com 1 e será somado até 1/num
		// Portanto iremos inverter a ordem para que o ponto de parada seja num==1
		// Pois 1/1 = 1
		
		if(num==1) return 1;
		
		
		// Caso num!=1 empilhar retornos da função com num-1 somado a 1/num
		return 1.0/num + Sequencia(num-1);
	}
}
