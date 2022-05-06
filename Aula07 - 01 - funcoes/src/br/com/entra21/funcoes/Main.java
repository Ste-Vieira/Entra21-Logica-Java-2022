package br.com.entra21.funcoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String opcao;
		System.out.println("Quero executar o assunto abaixo");
		System.out.println("1 - Procedimento");	
		System.out.println("2 - Parametros");
		System.out.println("3 - Retornos");
		System.out.println("4 - Completo");
		System.out.println("11 - Exercicios1");
		System.out.println("12 - Exercicio2");
		opcao = entrada.nextLine();
		switch (opcao.toLowerCase()) {
		case "1":
		case "procedimento":
			verProcedimentos();
			verProcedimentos();
			break;
		case "2":
		case "parametros":
			break;
		default:
			System.out.println("Não tem essa opção no menu");
			break;
		}		
	}
			
	//declaração de função
	//regras de uso e como será executado
	public static void capturarFrase() {
		System.out.println("Escreva uma frase...");
		System.out.println("---------------------------");
		System.out.println("  ENTER PARA CONFIRMAR");
		System.out.println("---------------------------");
	}
	
	public static void verProcedimentos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("1 - procedimentos");
		
		String frase;

		// chamada de função onde eu passo os argumento caso precise
		capturarFrase();
		frase = entrada.nextLine();

		System.out.println("voce disse :" + frase);

		// chamada de função onde eu passo os argumento caso precise
		capturarFrase();
		frase = entrada.nextLine();

		System.out.println("voce disse :" + frase);

		// chamada de função onde eu passo os argumento caso precise
		capturarFrase();
		frase = entrada.nextLine();

		System.out.println("voce disse :" + frase);

	}

	public static void verParametros(int numero) {// o valor informado cai nessa variavel temporaria
		System.out.println("Vc me passou por paramtro o numero " + numero);
		if (numero % 2 == 0) {
			System.out.println("Que legal e esse numero ainda é par...");
		}
	}

	public static void verMaisParametros(String escolha, String nome, int numero) {
		System.out.println("Recebi isso tudo de vc ");
		System.out.println(escolha);
		System.out.println(nome);
		System.out.println(numero);

		if (numero < 100) {
			System.out.println("Menor que 100");
		} else {
			System.out.println("É maior ou igual a 100");
		}
	}

	public static byte retornarValorInteiro() {
		byte variavelParaRetorno = 25;
		System.out.println("Aqui sempre retornando 15 pq nao tenho parametos para deixar isso dinamico");
		return variavelParaRetorno;
	}
	
	public static float calcularDivisao(float numeroA,float numeroB) { 
		System.out.println("O calculo esta sendo executado e se quiser pegue o retorno");
		return numeroA/numeroB;
	}
	
	public static String operacoesCalculadora(float numeroA,float numeroB) {

		float soma=  numeroA+ numeroB;
		float subtracao=  numeroA- numeroB;
		float multiplicacao=  numeroA* numeroB;
		float divisao=  numeroA/ numeroB;
		
		return "Executei tudo soma="+soma+" sub="+subtracao+" div="+divisao+" mult="+multiplicacao;
	}
}