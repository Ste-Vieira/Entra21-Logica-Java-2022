package br.com.entra21.exercicio.switch2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	String resposta;
	
	System.out.println("Qual a sua cor favorita? (responda em min�sculo)");	
	resposta = entrada.next();
	
	switch (resposta) {
	case "verde":
		System.out.println("cor das �rvores.");		
		break;
	case "azul":
		System.out.println("cor do mar");
		break;
	case "amarelo":
		System.out.println("cor do sol");
		break;
	case "vermelho":
		System.out.println("cor do fogo");
		break;		
	default:
		System.out.println("Resposta inv�lida");
		break;
	}	

	}

}
