package br.com.entra21.pratica.em.sala;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte option;

		do {
			System.out.println("\nEscolha uma das opções: ");
			System.out.println(" 0 - \"Sair\" ");
			System.out.println(" 1 - Calculando a soma ");
			System.out.println(" 2 - Repetir 20 vezes");
			System.out.println(" 3 - Capturar 20 pessoas exibir a soma de todas as idades");
			System.out.println(" 4 - Entre 20 pessoas quantas são de maior");
			System.out.println(" 5 - Entre 10 pessoas qual a mais nova");
			System.out.println(" 6 - ");
			System.out.println(" 7 - ");
			System.out.println(" 8 - ");
			System.out.println(" 9 - Solicite a quantidade de notas e calcule a média");

			option = input.nextByte();
			switch (option) {
			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				calculandoASoma();
				break;

			case 2:
				runRepeat20();
				break;

			case 3:
				sumAge();
				break;

			case 4:
				maioresDeIdade();
				break;

			case 5:
				exibirMaisNovo();
				break;

			case 9:
				mediaAlunos();
				break;

			default:
				System.out.println("Escolha uma opção válida!");
				break;
			}

		} while (option != 0);
		System.out.println("Obrigada por usar o programa Lista de Exercicios!");
	}

	public static void calculandoASoma() {
		System.out.println("CALCULANDO A SOMA");
		byte soma = 0;
		for (byte counter = 1; counter <= 15; counter++) {
			System.out.println(
					"Soma = soma + counter, " + soma + " = " + soma + " + " + counter + "==> " + (soma + counter));
			soma = (byte) (soma + counter);
		}
	}

	public static void runRepeat20() {
		for (byte cont = 1; cont <= 20; cont++)
			System.out.print("Eu gosto de algoritimos " + (cont % 5 == 0 ? "\n" : " "));

		// if(cont%5==0) {
		// System.out.println("\n");
		// }
	}

	public static void sumAge() {
		int sumAge = 0;
		byte age;
		Scanner input = new Scanner(System.in);

		for (byte count = 0; count <= 5; count++) {
			System.out.println("No momento a doma está em " + sumAge);
			System.out.println("Por favor, insira a idade: ");
			age = input.nextByte();
			sumAge = sumAge + age;
		}
		System.out.println("A soma total foi " + sumAge);
	}

	private static void maioresDeIdade() {
		System.out.println("Exibir apenas os maiores de idade");
		byte maiores = 0;
		byte idade, count;
		Scanner input = new Scanner(System.in);
		for (count = 1; count <= 20; count++) {
			System.out.println("Informe a idade da pessoa " + count);
			idade = input.nextByte();
			if (idade >= 18) {
				maiores++;
				System.out.println("A última pessoa informada era de maior.");
			}
		}
		System.out.println("Entre " + (count - 1) + " pessoas, apenas " + maiores + " são maiores de idade");
	}

	private static void exibirMaisNovo() {
		Scanner input = new Scanner(System.in);
		String name, youngerName = "";
		byte age, ageMinimal = 0;

		for (byte count = 1; count <= 10; count++) {
			System.out.println("Informe seu nome ");
			name = input.next();
			System.out.println(name + ", informe sua idade");
			age = input.nextByte();
			// no primeiro laço, sempre a primeira idade será a menor.
			if (count == 1) {
				ageMinimal = age;
				youngerName = name;
				System.out.println("Sou o primeiro e por isso sou o mais novo " + name + " " + age);
			} else {
				// a partir do segundo laço já tenho como comparar com "ageMinimal"
				System.out.println("Estou no laço " + count + " e preciso verificar");
				if (age < ageMinimal) {
					System.out.println("Ainda bem que testei, pq agora o mais novo é " + name + " com " + age);
					ageMinimal = age;
					youngerName = name;
				}
			}
		}
		System.out.println("Após isso tudo o mais novo é " + youngerName + " " + ageMinimal);

	}

	private static void mediaAlunos() {
		Scanner input = new Scanner(System.in);
		byte qtd, contador = 0;
		float nota, soma = 0f;
		System.out.println("Quantas notas vc quer capturar?");
		qtd = input.nextByte();
		String resposta;

		do {
			contador++;
			System.out.println("Informe uma nota");
			nota = input.nextFloat();
			if (contador >= qtd) {
				System.out.println("Quer capturar mais alguma nota?");
				resposta = input.next();
				if (resposta.equals("sim")) {
					contador--;
				}
			}

			soma = soma + nota;
		} while (contador <= qtd);
		System.out.println("Soma =" + soma);

	}
}
