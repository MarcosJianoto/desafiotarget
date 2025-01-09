package main;

public class Desafio1 {

	public static void main(String[] args) {

		System.out.println("1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;\r\n"
				+ "Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }\r\n" + "Imprimir(SOMA);\r\n"
				+ "Ao final do processamento, qual será o valor da variável SOMA?");

		int indice = 13;
		int soma = 0;
		int k = 0;

		while (k < indice) {
			k = k + 1;
			soma = soma + k;
		}

		System.out.println(soma);

	}

}
