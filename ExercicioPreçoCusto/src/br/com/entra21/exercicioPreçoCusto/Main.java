package br.com.entra21.exercicioPre�oCusto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	System.out.println ("Fa�a um programa que solicite o nome e pre�o de custo de um produto qualquer,"
			+ " ap�s, processe um aumento de 65% e informe qual ser� o pre�o de venda.");
	
	
	String produto;
	float precoCusto,precoVenda;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Qual o produto?");
	produto = entrada.nextLine();
	
	System.out.println("Informe o pre�o de custo");
	precoCusto = entrada.nextFloat();
	
	precoVenda = precoCusto + (precoCusto * 65 / 100);
	precoVenda = precoCusto*6.5f; //forma abreviada;
	
	System.out.println("O pre�o de venda do produto � "+produto+" ser�: "+precoVenda);
	

		
		
		
	}

}
