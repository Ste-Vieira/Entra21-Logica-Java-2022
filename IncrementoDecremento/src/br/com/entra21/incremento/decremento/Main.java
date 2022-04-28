package br.com.entra21.incremento.decremento;

public class Main {

	public static void main(String[] args) {
	
	int idade=33;
	
	//incremento (somar) forma longa:
	//aniversário
	idade = idade+1;  //34
	System.out.println(idade);
	
	//ano bisexto 29/02 4 em 4 anos
	
	idade= idade+4;
	System.out.println(idade);

	idade++; //soma 1
	System.out.println(idade);
	
	idade+=2;  //soma 2
	System.out.println(idade);
			
	idade*=2;  //dobra o valor
	System.out.println(idade);
	
	//vai atualizando a variavel idade.
		
	//decremento reduzir
	idade--;
	System.out.println(idade);
	
	idade-=10;
	System.out.println(idade);
	idade=idade-10;
	System.out.println(idade);
	
	

	

	}

}
