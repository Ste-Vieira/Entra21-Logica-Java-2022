package br.com.entra21.operadores.relacionais;

public class Main {

	public static void main(String[] args) {
		System.out.println("Operadores Relacionais");
		
		System.out.println("Menor < ");
		
		byte idadeA=51,idadeB=50;
		boolean resultado;
		
		resultado = idadeA < idadeB; //idadeA � menos que idadeB;
		
		System.out.println("idadeA � (<)menor que idadeB? "+resultado);
		
		System.out.println("idadeA � (<)menor que idadeB? "+ (idadeA<idadeB));
		
		resultado = idadeA <= idadeB;
		
		System.out.println("idade � (<=)menor ou igual que idadeB? "+resultado);
		
		System.out.println("Maior > ");
		
		resultado = idadeA > idadeB;
		
		System.out.println(idadeA+"� maior (>) que "+idadeB+" ? "+resultado);
		
		resultado = idadeA >= idadeB;
		
		System.out.println(idadeA+" � maior ou igual (>=) que "+idadeB+ " ? "+resultado);
		
		
	
	}

}
