package br.com.entra21.exercicio.switch2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	String resposta;
	
	System.out.println("Qual a sua cor favorita? :\nVerde\nAzul\nAmarelo\nVermelho");	
	resposta = entrada.next();
	
	switch (resposta) {
	
	case "verde":
	case "Verde":
		System.out.println("cor das árvores.");		
		break;	
	case "azul":
	case "Azul":
		System.out.println("cor do mar");
		break;
	case "amarelo":
	case "Amarelo":
		System.out.println("cor do sol");
		break;
	case "vermelho":
	case "Vermelho":
		System.out.println("cor do fogo");
		break;		
	default:
		System.out.println("Resposta inválida");
		break;
	}	

	}

}
