package br.com.entra21.operadores.aritmeticos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Operadores Aritm�ticos");
	
		System.out.println("Realizando uma soma "+ (1+7));
		System.out.println(4+10);
		
		float numeroA,numeroB;
		float calculoSoma;
		float resto;
		
		
		//objeto entrada da classe Scanner precisa utilizar o System.in para ter acesso ao teclado
		Scanner entrada =new Scanner(System.in);
		// new Scanner significa construa um objeto da classe Scanner e atribua na variavel entrada
		
		System.out.println("Informe o n�mero A:");
		numeroA = entrada.nextFloat();
		
		System.out.println("Informe o n�mero B:");
		numeroB = entrada.nextFloat();
		
		System.out.println("A soma entre esses dois n�meros � "+ (numeroA+numeroB));
		calculoSoma= numeroA+numeroB;
		
		System.out.println("Outra forma de exibir essa soma � "+ calculoSoma);
		
		System.out.println("A subtra��o entre esses dois n�meros � "+ (numeroA-numeroB));
		
		System.out.println("Multiplica��o "+numeroA*numeroB);
		
		System.out.println("Divis�o "+numeroA/numeroB);
		
		resto = numeroA%numeroB;
		
		System.out.println("O resto da divis�o "+ resto);
		
		boolean ehDivisivel = numeroA % numeroB == 0;
		
		System.out.println("� divisivel entre si? "+ ehDivisivel);
		
		
		
		
		
		
		
		
	
		
		
	}

}
