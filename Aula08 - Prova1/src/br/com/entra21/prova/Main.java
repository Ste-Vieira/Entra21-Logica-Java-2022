package br.com.entra21.prova;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	String nome, opcao;
			
	System.out.println("----Descubra qual o seu signo----");
	System.out.println("Informe seu nome:");
	nome = entrada.nextLine();
	System.out.println(nome+". Informe o m�s que voc� nasceu:");
	System.out.println("1 - Janeiro");
	System.out.println("2 - Fevereiro");
	System.out.println("3 - Mar�o");
	System.out.println("4 - Abril");
	System.out.println("5 - Maio");
	System.out.println("6 - Junho");
	System.out.println("7 - Julho");
	System.out.println("8 - Agosto");
	System.out.println("9 - Setembro");
	System.out.println("10 - Outubro");
	System.out.println("11 - Novembro");
	System.out.println("12 - Dezembro");
	opcao = entrada.nextLine();
	
	switch (opcao.toLowerCase()) {
	case "1":
	case "Janeiro":
		verJaneiro();
		break;
	case "2":
	case "Fevereiro":
		verFevereiro();
		break;
	case "3":
	case "Mar�o":
		verMar�o();
		break;
	case "4":
	case "Abril":
		verAbril();
		break;
	case "5":
	case "Maio":
		verMaio();
		break;
	case "6":
	case "Junho":
		verJunho();
		break;
	case "7":
	case "Julho":
		verJulho();
		break;
	case "8":
	case "Agosto":
		verAgosto();
		break;
	case "9":
	case "Setembro":
		verSetembro();
		break;
	case "10":
	case "Outubro":
		verOutubro();
		break;
	case "11":
	case "Novembro":
		verNovembro();
		break;
	case "12":
	case "Dezembro":
		verDezembro();
		break;
	}	
	
	}
	
	public static void verJaneiro () {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		System.out.println("Informe o dia que voc� nasceu:");
		dia = entrada.nextByte();
		if ((dia>=1)&&(dia<=20)) {
			System.out.println("Seu signo � Capric�rnio.");
		} else if ((dia>=21)&&(dia<=31)){
			System.out.println("seu signo � Aqu�rio");	
		}else {
		}
		}
	
	public static void verFevereiro() {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		byte diaLimite=28;
		System.out.println("Informe o dia que voc� nasceu:");
		dia = entrada.nextByte();
		
		if (dia>diaLimite){
			System.out.println("Esse m�s vai at� 28");
		}else if ((dia>=1)&&(dia<=18)) {
			System.out.println("Seu signo � Aqu�rio.");
		}else if ((dia>=19)&&(dia<=28)){
			System.out.println("seu signo � Peixes");	
		}else {	
		}
		
	}
	
	public static void verMar�o() {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		System.out.println("Informe o dia que voc� nasceu:");
		dia = entrada.nextByte();
		if ((dia>=1)&&(dia<=20)) {
			System.out.println("Seu signo � Peixes.");
		} else if ((dia>=21)&&(dia<=31)){
			System.out.println("seu signo � �ries");	
		}else {	
		}
	}
	public static void verAbril() {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		byte diaLimite=30;
		System.out.println("Informe o dia que voc� nasceu:");
		dia = entrada.nextByte();
		
		if (dia>diaLimite) {
			System.out.println("Esse m�s vai at� 30");
		}else if((dia>=1)&&(dia<=20)) {
			System.out.println("Seu signo � �ries.");
		} else if ((dia>=21)&&(dia<=30)){
			System.out.println("seu signo � Touro");	
		}else {	
		}
	}
	
	public static void verMaio() {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		System.out.println("Informe o dia que voc� nasceu:");
		dia = entrada.nextByte();
		if ((dia>=1)&&(dia<=20)) {
			System.out.println("Seu signo � Touro.");
		} else if ((dia>=21)&&(dia<=31)){
			System.out.println("seu signo � G�meos");	
		}else {	
		}	
	}
	
	public static void verJunho() {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		byte diaLimite=30;
		System.out.println("Informe o dia que voc� nasceu:");
		dia = entrada.nextByte();
		if (dia>diaLimite) {
			System.out.println("Esse m�s vai at� 30");
	    }else if((dia>=1)&&(dia<=20)) {
			System.out.println("Seu signo � G�meos.");
		} else if ((dia>=21)&&(dia<=30)){
			System.out.println("seu signo � C�ncer");	
		}else {	
		}	
	}
	
	public static void verJulho() {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		System.out.println("Informe o dia que voc� nasceu:");
		dia = entrada.nextByte();
		if ((dia>=1)&&(dia<=22)) {
			System.out.println("Seu signo � C�ncer.");
		} else if ((dia>=23)&&(dia<=31)){
			System.out.println("seu signo � Le�o");	
		}else {	
		}	
	}
	
	public static void verAgosto() {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		System.out.println("Informe o dia que voc� nasceu:");
		dia = entrada.nextByte();
		if ((dia>=1)&&(dia<=22)) {
			System.out.println("Seu signo � Le�o.");
		} else if ((dia>=23)&&(dia<=31)){
			System.out.println("seu signo � Virgem");	
		}else {	
		}	
	}
	
	public static void verSetembro () {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		byte diaLimite=30;
		System.out.println("Informe o dia que voc� nasceu:");
		dia = entrada.nextByte();
		if (dia>diaLimite) {
			System.out.println("Esse m�s vai at� 30");
	 	}else if((dia>=1)&&(dia<=22)) {
			System.out.println("Seu signo � Virgem.");
		} else if ((dia>=23)&&(dia<=30)){
			System.out.println("seu signo � Libra");	
		}else {	
		}	
	}
	
	public static void verOutubro () {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		System.out.println("Informe o dia que voc� nasceu:");
		dia = entrada.nextByte();
		if ((dia>=1)&&(dia<=22)) {
			System.out.println("Seu signo � Libra.");
		} else if ((dia>=23)&&(dia<=31)){
			System.out.println("seu signo � Escorpi�o");	
		}else {	
		}	
	}
	
	public static void verNovembro () {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		byte diaLimite=30;
		System.out.println("Informe o dia que voc� nasceu:");
		dia = entrada.nextByte();
		if (dia>diaLimite) {
			System.out.println("Esse m�s vai at� 30");
		}else if((dia>=1)&&(dia<=21)) {
			System.out.println("Seu signo � Escorpi�o.");
		} else if ((dia>=22)&&(dia<=30)){
			System.out.println("seu signo � Sagit�rio");	
		}else {	
		}	
		
	}
	
	public static void verDezembro() {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		System.out.println("Informe o dia que voc� nasceu:");
		dia = entrada.nextByte();
		if ((dia>=1)&&(dia<=21)) {
			System.out.println("Seu signo � Sagit�rio.");
		} else if ((dia>=22)&&(dia<=31)){
			System.out.println("seu signo � Capric�rnio");	
		}else {	
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}