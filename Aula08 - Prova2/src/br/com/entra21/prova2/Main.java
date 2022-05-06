package br.com.entra21.prova2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String calculo;
		float numeroA, numeroB;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("CALCULADORA");
		System.out.println("Digite primeiro número:");
		numeroA = entrada.nextFloat();
		System.out.println("Digite o segundo número:");
		numeroB = entrada.nextFloat();
		System.out.println("Escolha a operação");
		System.out.println("\"1 - Adição\\n2 - Subtracão\\n3 - Divisão\\n4 - Multiplicacão\\n0");
		
		
		switch (calculo) {
		case "1":
		case "Adição":
			adicao();
			System.out.println("A soma do "+numeroA+" e "+numeroB+" foi "+verAdicao(numeroA, numeroB));
			break;
		case "2":
		case "Subtração":
			System.out.println("A subtração do "+numeroA+" e "+numeroB+" foi "+verAdicao(numeroA, numeroB));
			break;
		}
	}
	public static float adicao(float numeroA, float numeroB) {
		
		return numeroA + numeroB;
		
	}
	public static float adicao(float numeroA, float numeroB) {
		
		return numeroA + numeroB;
		
	}
}
