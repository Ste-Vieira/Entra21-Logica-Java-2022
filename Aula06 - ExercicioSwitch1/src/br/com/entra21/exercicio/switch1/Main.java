package br.com.entra21.exercicio.switch1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Qual sua esta��o preferida?");
		System.out.println("1 = Primavera");
		System.out.println("2 = Outuno");
		System.out.println("3 = Inverno");
		System.out.println("4 = Ver�o");
		Scanner entrada = new Scanner (System.in);
		byte opcao;
		
		opcao = entrada.nextByte();
		
		switch (opcao) {
		case 1:
			System.out.println("Na primavera temos muitas flores");
			break;
		case 2:
			System.out.println("No outono as folhas caem");
			break;
		case 3:
			System.out.println("Uma sopinha cai bem");
			break;
		case 4:
			System.out.println("Esta��o boa para praia");
		default:
			System.out.println("op��o inv�lida");
			break;
		}

	}

}
