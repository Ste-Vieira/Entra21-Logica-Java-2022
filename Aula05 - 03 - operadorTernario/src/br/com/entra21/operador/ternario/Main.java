package br.com.entra21.operador.ternario;

public class Main {

	public static void main(String[] args) {
	System.out.println("Aprendendo sobre operdor ternario");

	String nome;
	boolean condicao=true;
	
	nome= (true)?"Nome":"Sobrenome";
	
	System.out.println("Ent�o vc � "+(condicao?"de maior":"de menor"));

	
	byte idade = 30;
	
	if(idade>17) {
		System.out.println("Vc � de maior");
	}else {									//forma muito comprida
		System.out.println("vc � de menor");
	}
	
	System.out.println("Vc � de "+ (idade>17?" de maior":" de menor"));
	// forma simplificada
	
	condicao=(idade==30?true:false);
	
	
	
	
	
	
	}

}
