package br.com.entra21.matrizes;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	// definindo minha variavel Scanner acessivel em toda a classe Main
	// como o metodo main é static, tanto metodos ou variaveis devem ser static para
	// se relacionarem com o metodo main

	public static void main(String[] args) {

		byte option;

		do {
			System.out.println(escrevaMenu());
			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Saidno...");
				break;
			case 1:
				aprenderMatrizes();
				break;
			case 2:
				aprenderMatrizesInicializadas();
				break;

			default:
				System.out.println("Digite uma opção valida");
				break;

			}
		} while (option != 0);

	}

	private static String escrevaMenu() {

		String conteudoMenu = "Escolha uma opção para aprender:\n";
		conteudoMenu += "\t1 - Inicializando matrizes com tamanho definidos\n";
		conteudoMenu += "\t2 - Inicializando matrizes com valores predeterminados\n";
		return conteudoMenu;
	}

	private static void aprenderMatrizes() {

		System.out.println("Armazenar as 3 notas de 10 alunos");
		float notas[][];
		notas = new float[10][4]; // aqui eu defini diretamente no código o tamanho da minha matriz
		// primeiro indice é a quantidade de vetores
		// e o segundo indice é a capacidade de cada vetor
		// apenas o ultimo indice ficam os valores

		byte quantidadeAlunos, quantidadeNotas;
		System.out.println("Informe a quantidade de alunos");
		quantidadeAlunos = input.nextByte();

		System.out.println("Informe a quantidade de notas para cada aluno");
		quantidadeNotas = input.nextByte();

		// quem decide o tamanho da minha matriz é o usuário
		float novasNotas[][] = new float[quantidadeAlunos][quantidadeNotas];

		for (byte aluno = 0; aluno < novasNotas.length; aluno++) {
			System.out.println("Nessa posição [" + aluno + "] temos " + novasNotas[aluno].length + " notas");

			for (byte nota = 0; nota < novasNotas[aluno].length; nota++) {
				System.out.println("\tvalor da nota [" + nota + "]====> " + novasNotas[aluno][nota]);

			}
		}

	}

	private static void aprenderMatrizesInicializadas() {

		System.out.println("Aprendendo sobre matrizes inicializadas e irregulares");
		float salarioAlunos[][]= { 
				{1000,1250.50f,2500.35f},
				{2600,3500,4500},
				{50000,150000,2000000}
		};
	
		byte matrizIrregular[][]= {
				{1,2,3,4,5,6,7},
				{4,3,2,1,},
				{10,12},
				{-127,0,127},
		};
	
		String ementa[][]= {
			{"Metodologia ágeis","introdução","metodologias","git"},
			{"lógica com java", "variaveis","constantes","comentarios","desvios condicionais","laços de repetição"},
			{"POO","Classes","Objetos","Herança","Polimorfismo","conceitos"},
		};
	
	
	}

}