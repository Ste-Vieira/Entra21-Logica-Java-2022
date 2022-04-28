package br.com.entra21.exercicioAreaPerimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	//System.out.println("Faça um programa que solicite a base e altura de um retângulo e informe sua área e perimetro.");
	//System.out.println("Sabendo que a área é calculada com base no produto entre base e altura.");
	//System.out.println("O perímetro é obtido ao somar todos os vertices do retângulo.");
	
	float base,altura,area,perimetro;
	
	Scanner entrada = new Scanner(System.in);
		
	System.out.println("Informe a base retangulo");
	base = entrada.nextFloat();
	
	System.out.println("Informe a altura do retangulo");
	altura = entrada.nextFloat(); //se for nextInt continua float porem sem a precisao decimal (converte o float)
	
	area = base*altura;
	perimetro = base*2 + altura*2;
	
	System.out.println("A area do seu retangulo é "+area+ ", e o perimetro é "+perimetro);
	
	
	}

}
