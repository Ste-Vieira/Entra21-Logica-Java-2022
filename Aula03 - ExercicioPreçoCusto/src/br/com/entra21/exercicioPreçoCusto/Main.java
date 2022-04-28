package br.com.entra21.exercicioPreçoCusto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	System.out.println ("Faça um programa que solicite o nome e preço de custo de um produto qualquer,"
			+ " após, processe um aumento de 65% e informe qual será o preço de venda.");
	
	
	String produto;
	float precoCusto,precoVenda;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Qual o produto?");
	produto = entrada.nextLine();
	
	System.out.println("Informe o preço de custo");
	precoCusto = entrada.nextFloat();
	
	precoVenda = precoCusto + (precoCusto * 65 / 100);
	precoVenda = precoCusto*6.5f; //forma abreviada;
	
	System.out.println("O preço de venda do produto é "+produto+" será: "+precoVenda);
	

		
		
		
	}

}
