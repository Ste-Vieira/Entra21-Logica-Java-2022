package br.com.entra21.operadores.relacionais;

public class Main {

	public static void main(String[] args) {
		System.out.println("Operadores Relacionais");
		
		System.out.println("Menor < ");
		
		byte idadeA=51,idadeB=50;
		boolean resultado;
		
		resultado = idadeA < idadeB; //idadeA é menos que idadeB;
		
		System.out.println("idadeA é (<)menor que idadeB? "+resultado);
		
		System.out.println("idadeA é (<)menor que idadeB? "+ (idadeA<idadeB));
		
		resultado = idadeA <= idadeB;
		
		System.out.println("idade é (<=)menor ou igual que idadeB? "+resultado);
		
		System.out.println("Maior > ");
		
		resultado = idadeA > idadeB;
		
		System.out.println(idadeA+"é maior (>) que "+idadeB+" ? "+resultado);
		
		resultado = idadeA >= idadeB;
		
		System.out.println(idadeA+" é maior ou igual (>=) que "+idadeB+ " ? "+resultado);
		
		
	
	}

}
