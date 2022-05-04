package br.com.entra21.exercicio.ifswitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Você pode entrar no brinquedo?");
	
	Scanner entrada = new Scanner(System.in);
	
	float altura,alturam;
	String nome;
	alturam = 1.5f;
	
	System.out.println("Qual o seu nome?");
	nome = entrada.nextLine();
	System.out.println("Qual a sua altura?");
	altura = entrada.nextFloat();
	
	if (altura<alturam){
		System.out.println("Olá "+nome+"! Infelizmente você não tem a altura mínima, quem sabe na próxima.");
	}if (altura>alturam) {
		System.out.println("Olá "+nome+"! Parabéns, você pode entrar no brinquedo!!");
	}
	
		
	}

}
