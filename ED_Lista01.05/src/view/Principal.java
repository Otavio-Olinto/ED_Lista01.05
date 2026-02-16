package view;

import controller.SomaFracao;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Instanciando os métodos da classe SomaFracao
		SomaFracao metodos = new SomaFracao();
		
		// Gerando o método de leitura com Scanner
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o número(N) máximo da sequência 1 + 1/2 + 1/3 +...+ 1/N: ");
		double soma, num = Integer.parseInt(ler.nextLine());
		
		soma = metodos.Sequencia(num);
		
		System.out.println("A soma desta sequência até "+num+" é: "+soma);
		
		ler.close();
		
		System.exit(0);
		
		
	}

}
