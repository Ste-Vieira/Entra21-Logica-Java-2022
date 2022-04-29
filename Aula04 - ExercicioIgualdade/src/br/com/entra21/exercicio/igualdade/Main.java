package br.com.entra21.exercicio.igualdade;

public class Main {

	public static void main(String[] args) {

	byte idadeA,idadeB;
	boolean resultado;
	
	idadeA=6;	
	idadeB=10;
		
	resultado= idadeA==idadeB;
	
	System.out.println("As idades "+idadeA+ " e "+idadeB+ " são iguais " +resultado);

		
	idadeA=5;
	idadeB=5;
	
	resultado = idadeA != idadeB;
	
	System.out.println("As idades "+idadeA+ " e "+idadeB+" são diferentes " +resultado);

			
		
		
	}

}
