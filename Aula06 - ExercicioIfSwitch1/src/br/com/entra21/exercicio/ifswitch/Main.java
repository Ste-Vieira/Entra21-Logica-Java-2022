package br.com.entra21.exercicio.ifswitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Voc� pode entrar no brinquedo?");
	
	Scanner entrada = new Scanner(System.in);
	
	float altura,alturam;
	String nome;
	alturam = 1.5f;
	
	System.out.println("Qual o seu nome?");
	nome = entrada.nextLine();
	System.out.println("Qual a sua altura?");
	altura = entrada.nextFloat();
	
	if (altura<alturam){
		System.out.println("Ol� "+nome+"! Infelizmente voc� n�o tem a altura m�nima, quem sabe na pr�xima.");
	}if (altura>alturam) {
		System.out.println("Ol� "+nome+"! Parab�ns, voc� pode entrar no brinquedo!!");
	}
	
		
	}

}
