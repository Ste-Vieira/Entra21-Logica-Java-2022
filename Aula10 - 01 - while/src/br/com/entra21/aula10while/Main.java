package br.com.entra21.aula10while;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Scanner entrada = new Scanner(System.in); (quando não vou precisar utilizar
		// ele em outro momento utilizo direto na variável
		System.out.println("\n\t0 - sair\n\t1 - while\n\t2 - do-while");
		System.out.println("Escolha uma opção");
		// instanciando objeto da classe Scanner e já utilizando o metodo next, chama
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
			// main(null); pode colocar o main aqui porém no final colocar return
			break;
		default:
			System.out.println("Opção inválida");
			main(null); // volta ao inicio passando nenhum argumento (null)
			break;

		}
	}

	private static void aprenderWhile() {
		System.out.println("Vamos aprender o WHILE aqui");
		byte contagem = 1;// definir a variável antes para o while testar
		while (contagem <= 10) {// somente esse escopo, é o que quero repetir (condição de permanência)
			System.out.println("Contando" + contagem);
			contagem++;// a variável precisa alterar para não ficar no loop
		}

		System.out.println("Acabei");

		Scanner entrada = new Scanner(System.in);
		System.out.println("Deseja iniciar uma repetição"); // alt seta pra cima ou baixo, move no código
		String resposta = entrada.next();
		while (resposta.equals("continuar") || resposta.toLowerCase().equals("sim")) {// os dois devem dar TRUE,
																						// comparar o que digitei
																						// (resposta) com o "continuar"
			// equalsIgnoreCase() compara o que foi escrito tudo minusculo mas não muda o
			// que foi enviado
			// contagem tem que ser diferente de zero e resposta tem que ser continuar
			// basta um dar false para sair do while
			System.out.println("Você respondeu:" + resposta);
			System.out.println("Deseja continuar?");
			resposta = entrada.next(); // variavel resposta esta sendo modificada
		}
		System.out.println("Terminou meu while com base em decisão");

		main(null);// chamada do método, volta ao início. Ctrl + clicar direciona
	}

	private static void aprenderDoWhile() {
		System.out.println("Vamos aprender DO WHILE aqui");
		Scanner entrada = new Scanner(System.in);
		String resposta;
		do {
			System.out.println("Existiam 2 dogs pita e repita, pita morreu quem ficou?");
			resposta = entrada.next();
		} while (resposta.equalsIgnoreCase("repita"));
		System.out.println("Entendeu né?");

		byte dia;
		do {
			System.out.println("Informe o dia do seu aniversário");
			dia = entrada.nextByte();
		} while (dia > 31); // repetir enquanto informar algo maior que 31
		System.out.println("Espero que não tenho errado...");

		byte mes;
		byte contador = 0;
		do {
			System.out.println("Informe o dia do seu aniversario ex(1 até 31)");
			dia = entrada.nextByte();

			System.out.println("Informe o mes do seu aniversario ex(1 até 12)");
			mes = entrada.nextByte();
			contador++;
		} while (dia < 1 || dia > 31 || mes < 1 || mes > 12);// condição de permanência no loop
		System.out.println("Finalmente você digitou certo " + dia + "/" + mes + "mas tbm errou " + --contador);
		main(null);
	}

}
