package br.com.entra21.aula10while;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Scanner entrada = new Scanner(System.in); (quando n�o vou precisar utilizar
		// ele em outro momento utilizo direto na vari�vel
		System.out.println("\n\t0 - sair\n\t1 - while\n\t2 - do-while");
		System.out.println("Escolha uma op��o");
		// instanciando objeto da classe Scanner e j� utilizando o metodo next, chama
		// ele direto aqui
		switch (new Scanner(System.in).next().toLowerCase()) {

		case "0", "sair":
			System.out.println("Escolha sair");
			break;// o break encerra o switch e o programa acaba
		case "1", "while":
			aprenderWhile();
			break;
		case "2", "do-while":
			aprenderDoWhile();
			// main(null); pode colocar o main aqui por�m no final colocar return
			break;
		default:
			System.out.println("Op��o inv�lida");
			main(null); // volta ao inicio passando nenhum argumento (null)
			break;

		}
	}

	private static void aprenderWhile() {
		System.out.println("Vamos aprender o WHILE aqui");
		byte contagem = 1;// definir a vari�vel antes para o while testar
		while (contagem <= 10) {// somente esse escopo, � o que quero repetir (condi��o de perman�ncia)
			System.out.println("Contando" + contagem);
			contagem++;// a vari�vel precisa alterar para n�o ficar no loop
		}

		System.out.println("Acabei");

		Scanner entrada = new Scanner(System.in);
		System.out.println("Deseja iniciar uma repeti��o"); // alt seta pra cima ou baixo, move no c�digo
		String resposta = entrada.next();
		while (resposta.equals("continuar") || resposta.toLowerCase().equals("sim")) {// os dois devem dar TRUE,
																						// comparar o que digitei
																						// (resposta) com o "continuar"
			// equalsIgnoreCase() compara o que foi escrito tudo minusculo mas n�o muda o
			// que foi enviado
			// contagem tem que ser diferente de zero e resposta tem que ser continuar
			// basta um dar false para sair do while
			System.out.println("Voc� respondeu:" + resposta);
			System.out.println("Deseja continuar?");
			resposta = entrada.next(); // variavel resposta esta sendo modificada
		}
		System.out.println("Terminou meu while com base em decis�o");

		main(null);// chamada do m�todo, volta ao in�cio. Ctrl + clicar direciona
	}

	private static void aprenderDoWhile() {
		System.out.println("Vamos aprender DO WHILE aqui");
		Scanner entrada = new Scanner(System.in);
		String resposta;
		do {
			System.out.println("Existiam 2 dogs pita e repita, pita morreu quem ficou?");
			resposta = entrada.next();
		} while (resposta.equalsIgnoreCase("repita"));
		System.out.println("Entendeu n�?");

		byte dia;
		do {
			System.out.println("Informe o dia do seu anivers�rio");
			dia = entrada.nextByte();
		} while (dia > 31); // repetir enquanto informar algo maior que 31
		System.out.println("Espero que n�o tenho errado...");

		byte mes;
		byte contador = 0;
		do {
			System.out.println("Informe o dia do seu aniversario ex(1 at� 31)");
			dia = entrada.nextByte();

			System.out.println("Informe o mes do seu aniversario ex(1 at� 12)");
			mes = entrada.nextByte();
			contador++;
		} while (dia < 1 || dia > 31 || mes < 1 || mes > 12);// condi��o de perman�ncia no loop
		System.out.println("Finalmente voc� digitou certo " + dia + "/" + mes + "mas tbm errou " + --contador);
		main(null);
	}

}
