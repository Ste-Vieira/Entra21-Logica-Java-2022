package br.com.entra21.exercicio.relacional;

public class Main {

	public static void main(String[] args) {

	float alturaA=1.9f,alturaB=3.0f;
	boolean resultado;
		
	resultado = alturaA < alturaB;
	
	System.out.println("A altura "+alturaA+ " é menor que a altura " +alturaB + resultado);
	
		
	resultado = alturaA <= alturaB;
		
	System.out.println("A altura "+alturaA+ " é menor ou igual a altura "+alturaB + resultado);
			
			
	resultado = alturaA > alturaB;
		
	System.out.println(alturaA+"é maior que "+alturaB+" ? "+resultado);
		
	resultado = alturaA >= alturaB;
		
	System.out.println(alturaA+" é maior ou igual que "+alturaB+ " ? "+resultado);
		
		
	}

}
