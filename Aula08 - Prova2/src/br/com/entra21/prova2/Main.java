package br.com.entra21.prova2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String calculo;
		float numeroA, numeroB;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("CALCULADORA");
		System.out.println("Digite primeiro n�mero:");
		numeroA = entrada.nextFloat();
		System.out.println("Digite o segundo n�mero:");
		numeroB = entrada.nextFloat();
		System.out.println("Escolha a opera��o");
		System.out.println("\"1 - Adi��o\\n2 - Subtrac�o\\n3 - Divis�o\\n4 - Multiplicac�o\\n0");
		
		
		switch (calculo) {
		case "1":
		case "Adi��o":
			adicao();
			System.out.println("A soma do "+numeroA+" e "+numeroB+" foi "+verAdicao(numeroA, numeroB));
			break;
		case "2":
		case "Subtra��o":
			System.out.println("A subtra��o do "+numeroA+" e "+numeroB+" foi "+verAdicao(numeroA, numeroB));
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
