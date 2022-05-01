package br.com.entra21.elseif;

public class Main {

	public static void main(String[] args) {
    System.out.println("Aprendendo sobre else if (ou seja renovando o if antes do else)");

    float altura=1.7f;
    double dinheiro=3000;
    
    if(altura<1.5) {//é baixinho ?
    	System.out.println("é bem baixinho");
    }else if(altura<=1.9f) {//é alto
    	System.out.println("é alto");
    }else {
    	//deixar o else mesmo que não seja utilizado, é uma boa pratica deixar o else
    }
    
    byte pontos;
    if(dinheiro <=1200) {
    	System.out.println("salario minimo");
    	pontos=5;
    }else if(dinheiro<=1800) {
    	System.out.println("ta ficando rico");
    	pontos=8;
    }else if (dinheiro<=2000) {
    	System.out.println("me empresta");
    	pontos=12;
    }else {
    	System.out.println("me contrata vai");
    	pontos=13;
    }
	
    
    System.out.println("sua pontuação "+pontos);
    
	
	
	}

}
