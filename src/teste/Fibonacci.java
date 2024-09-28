package teste;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número para verificar se pertence à sequência: ");
		
		int numero = scanner.nextInt();
		scanner.close();

		boolean pertence = verificarFibonacci(numero);

		if (pertence) {
			System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
		}
	}


	public static boolean verificarFibonacci(int valor) {
		int primeiro = 0, segundo = 1, proximo = 0;

		while (proximo < valor) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
		}

		return valor == proximo || valor == 0;
	}
}