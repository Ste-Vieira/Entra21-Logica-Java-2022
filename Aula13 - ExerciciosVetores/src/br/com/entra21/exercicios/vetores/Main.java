package br.com.entra21.exercicios.vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		byte option;

		do {
			System.out.println(escreverMenu());
			// utilizando do while, pq me permite entrar no blobo antes de testas a condi��o
			// de perman�ncia
		
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Programa finalizado");
				break;
			case 1:
				exibirTamanhosVetores();
				break;
			case 2:
				exibirTamanhoVetoresInicializados();
				break;
			case 3:
				vetorCom5ParaInicializar();
				break;
			case 4:
				definirTamanhoVetorParaInicializar();
				break;
			case 5:
				percorrerVetorInicializado();
				break;
			case 6:
				exibirVetoresInteirosNaoInicializado();
				break;
			default:
				System.out.println("Escolha uma op��o v�lida");
				break;
			}
			// caso a condi��o de permanencia seja True, repita o bloco
		} while (option != 0); // enquanto n�o for 0 repita

	}

	public static String escreverMenu() {
		String menu="Escolha uma op��o do menu de Pr�ticas\n";
		menu += "0 - Sair\n";
		menu += "1 - Criar vetores para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu += "2 - Criar vetores inicializados para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu += "3 - Criar 1 vetor de 5 posi��es, para que o usu�rio alimente esses valores\n";
		menu += "4 - Criar um vetor com o tamanho informado pelo usu�rio e depois solicitar que o usu�rio informe os respectivos valores\n";
		menu += "5 - Criar um vetor de inteiros inicializado , para percorrer\n";
		menu += "6 - Criar um vetor de inteiros n�o inicializado\n";
		menu += "--------------------------------------------------";
		
		return menu;
	}
	
	public static void exibirTamanhosVetores() {
		byte vetorBytes[] = new byte[1];
		short vetorShorts[] = new short[2];
		int vetorInts[] = new int[3];
		long vetorLongs[] = new long[4];
		char vetorChars[] = new char[5];
		float vetorFloats[] = new float[6];
		double vetorDoubles[] = new double[7];
		boolean vetorBooleans[] = new boolean[8];

		System.out.println("vetorBytes tamanho = " + vetorBytes.length);
		System.out.println("vetorShorts tamanho = " + vetorShorts.length);
		System.out.println("vetorInts tamanho = " + vetorInts.length);
		System.out.println("vetorLongs tamanho = " + vetorLongs.length);
		System.out.println("vetorChars tamanho = " + vetorChars.length);
		System.out.println("vetorFloats tamanho = " + vetorFloats.length);
		System.out.println("vetorDoubles tamanho = " + vetorDoubles.length);
		System.out.println("vetorBooleans tamanho = " + vetorBooleans.length);

	}

	public static void exibirTamanhoVetoresInicializados() {
		byte vetorBytes[] = { 5, 7, 9, 10 };
		short vetorShorts[] = { 140, 187, 195 };
		int vetorInts[] = { 1666, 1250 };
		long vetorLongs[] = { 100000, 200000, 300000 };
		float vetorFloats[] = { 10000.50f, 20000.2f, 50000.32f };
		double vetorDoubles[] = { 150000.354d, 400000.12345d };
		char vetorChars[] = { 'a', 'b', 'c', 'd', 'e' };
		boolean vetorBooleans[] = { true, false, false, true };

		System.out.println("vetorBytes tamanho = " + vetorBytes.length);
		System.out.println("vetorShorts tamanho = " + vetorShorts.length);
		System.out.println("vetorInts tamanho = " + vetorInts.length);
		System.out.println("vetorLongs tamanho = " + vetorLongs.length);
		System.out.println("vetorChars tamanho = " + vetorChars.length);
		System.out.println("vetorFloats tamanho = " + vetorFloats.length);
		System.out.println("vetorDoubles tamanho = " + vetorDoubles.length);
		System.out.println("vetorBooleans tamanho = " + vetorBooleans.length);

	}

	public static void vetorCom5ParaInicializar() {
		Scanner input = new Scanner(System.in);
		byte vetorBytes[] = new byte[5];

		for (byte contador = 0; contador < vetorBytes.length; contador++) {
			System.out.println("Inicializando a posi��o " + (contador + 1) + " no �ndice " + contador);
			vetorBytes[contador] = input.nextByte();

		}

	}

	public static void definirTamanhoVetorParaInicializar() {
		Scanner input = new Scanner(System.in);

		byte tamanho;
		byte vetorBytes[];

		System.out.println("Informe o tamanho do vetor:");
		tamanho = input.nextByte();

		vetorBytes = new byte[tamanho];

		for (byte contador = 0; contador < vetorBytes.length; contador++) {
			System.out.println("Informe o valor para o item " + (contador + 1) + " no �ndice [" + contador + "]");
			vetorBytes[contador] = input.nextByte();
		}

	}

	public static void percorrerVetorInicializado() {
		byte vetorBytes[] = { 7, 15, 2, 9, 54 };

		for (byte contador = 0; contador < vetorBytes.length; contador++) {
			System.out.println(vetorBytes[contador]);
		}
		System.out.println("-------------------------");

		for (byte contador = (byte) (vetorBytes.length - 1); contador >= 0; contador--) {
			System.out.println(vetorBytes[contador]);
			// come�ando com o tamanho -1, pq o �ndice sempre tem um valor a menos
			// condi��o de permenencia, enquanto meu contador for maior do que 0, pq comecei
			// com valor alto e estou diminuindo
			// como uma repeti��o decrescente utiliza o decremento no contador
		}

	}

	public static void exibirVetoresInteirosNaoInicializado() {
		Scanner input = new Scanner(System.in);
		byte vetorBytes[] = new byte[10];
		String resposta;
		byte index = 0;

		do {
			System.out.println("Informe um valor para o �ndice [" + index + "]");
			vetorBytes[index] = input.nextByte();

			System.out.println("Gostaria de inicializar outro indice?");
			resposta = input.next();

			if (resposta.equalsIgnoreCase("sim")) {

				do {
					System.out.println("Informe um �ndice v�lido entre 0 e " + (vetorBytes.length - 1));
					index = input.nextByte(); // se o usu�rio digitar um valor v�lido esse index ser� usado no meu DO
												// principal onde a l�gica se repete

				} while (index < 0 || index >= vetorBytes.length); // a posi��o escolhida n�o pode ser menor que 0, nem
																	// o tamanho do vetor ou superior
				// exemplo: o range v�lido � de 0 � 9 (linha 150) qualquer n�mero al�m disso
				// fica preso nesse loop.
			}
		} while (resposta.equalsIgnoreCase("sim"));

		for (byte contador = 0; contador < vetorBytes.length; contador++) {
			System.out.println("vetorBytes " + contador + " = " + vetorBytes[contador]);
		}

	}
}
