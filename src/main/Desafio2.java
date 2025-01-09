package main;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int numero = scanner.nextInt();

		int a = 0, b = 1, fibonacci = 0;

		while (fibonacci < numero) {
			fibonacci = a + b;
			a = b;
			b = fibonacci;
		}

		if (fibonacci == numero || numero == 0) {
			System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
		}

		scanner.close();

	}

}
