package br.com.entra21.aula5.exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Capturar 2 numeros informar qual � o maior");

		Scanner entrada = new Scanner(System.in);
		byte numeroA, numeroB;

		System.out.println("Informe o valor do numero A");
		numeroA = entrada.nextByte();

		System.out.println("Informe o valor do numero B");
		numeroB = entrada.nextByte();

		if (numeroA > numeroB) {
			System.out.println("Numero A � maior");
		} else if (numeroA == numeroB) {
			System.out.println("S�o iguais");
		} else {
			System.out.println("Numero B � maior");
		}

		System.out.println("==================================");

		System.out.println("Capturar ano de nascimento e informar se j� tem idade para votar");

		short anoNascimento;
		short calculo;

		System.out.println("Informe ano de nascimento");
		anoNascimento = entrada.nextShort();

		calculo = (short) (2022 - anoNascimento);

		if (calculo > 15) {
			System.out.println("Tem idade para votar");
		} else {
			System.out.println("Ta cedo ainda vai brincar");
		}

		System.out.println(calculo >= 16 ? "Pode votar" : "N�o pode votar"); // forma simplificada

		System.out.println("============================================");

		System.out.println("Capturar 3 notas do aluno para calcular a m�dia e informar se est� aprovado ou reprovado");

		float notaA, notaB, notaC;
		float resultado;

		System.out.println("Infome as suas tr�s notas:");
		notaA = entrada.nextFloat();
		notaB = entrada.nextFloat();
		notaC = entrada.nextFloat();

		resultado = ((notaA + notaB + notaC) / 3);

		if (resultado < 7) {
			System.out.println("Voc� est� reprovado!!");
		} else {
			System.out.println("Voc� foi aprovado!!");
		}
		// outra forma
		System.out.println(resultado < 7 ? "Sua nota � " + resultado + ". Voc� est� reprovado"
				: "Sua nota � " + resultado + ". Voc� est� aprovado!");

		System.out.println("===============================================");

		System.out.println("Capturar peso e altura para calcular o IMC e exibir o resultado e em qual faixa de peso");

		float peso, altura, imc;

		System.out.println("Informe seu peso: ");
		peso = entrada.nextFloat();
		System.out.println("Informa sua altura: ");
		altura = entrada.nextFloat();

		imc = peso / (altura * altura);

		if (imc < 18.5) {
			System.out.println("Abaixo do peso normal");
		} else if (18.5 <= imc && imc <= 24.9) {
			System.out.println("Peso normal");
		} else if (25 <= imc && imc <= 29.9) {
			System.out.println("Excesso de peso");
		} else if (30 <= imc && imc <= 34.9) {
			System.out.println("Obesidade classe I");
		} else if (35 <= imc && imc <= 39.9) {
			System.out.println("Obesidade classe II");
		} else if (imc >= 40.0) {
			System.out.println("Obesidade classe III");
		} else {

		}

	}

}
