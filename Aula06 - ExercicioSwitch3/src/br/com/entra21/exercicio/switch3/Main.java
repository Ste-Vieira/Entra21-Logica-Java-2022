package br.com.entra21.exercicio.switch3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Situa��o que o usu�rio n�o escolheu nenhuma op��o listada");
		Scanner entrada = new Scanner(System.in);
		byte opcao;
		
		System.out.println("Voc� est� com sono?");
		System.out.println("1 - sim");
		System.out.println("2 - n�o");
		opcao = entrada.nextByte();
		
		switch (opcao) { 
		
		case 1:
			System.out.println("Pode dormir");
			break;
		case 2:
			System.out.println("Espere mais um pouco");
			break;
		default:
			System.out.println("Resposta inv�lida");
			break;
		}
	}

}
