package br.com.entra21.exercicio.switch3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Situação que o usuário não escolheu nenhuma opção listada");
		Scanner entrada = new Scanner(System.in);
		byte opcao;
		
		System.out.println("Você está com sono?");
		System.out.println("1 - sim");
		System.out.println("2 - não");
		opcao = entrada.nextByte();
		
		switch (opcao) { 
		
		case 1:
			System.out.println("Pode dormir");
			break;
		case 2:
			System.out.println("Espere mais um pouco");
			break;
		default:
			System.out.println("Resposta inválida");
			break;
		}
	}

}
