package br.com.entra21.prova;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	String nome, opcao;
			
	System.out.println("----Descubra qual o seu signo----");
	System.out.println("Informe seu nome:");
	nome = entrada.nextLine();
	System.out.println(nome+". Informe o mês que você nasceu:");
	System.out.println("1 - Janeiro");
	System.out.println("2 - Fevereiro");
	System.out.println("3 - Março");
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
	case "Março":
		verMarço();
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
		System.out.println("Informe o dia que você nasceu:");
		dia = entrada.nextByte();
		if ((dia>=1)&&(dia<=20)) {
			System.out.println("Seu signo é Capricórnio.");
		} else if ((dia>=21)&&(dia<=31)){
			System.out.println("seu signo é Aquário");	
		}else {
		}
		}
	
	public static void verFevereiro() {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		byte diaLimite=28;
		System.out.println("Informe o dia que você nasceu:");
		dia = entrada.nextByte();
		
		if (dia>diaLimite){
			System.out.println("Esse mês vai até 28");
		}else if ((dia>=1)&&(dia<=18)) {
			System.out.println("Seu signo é Aquário.");
		}else if ((dia>=19)&&(dia<=28)){
			System.out.println("seu signo é Peixes");	
		}else {	
		}
		
	}
	
	public static void verMarço() {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		System.out.println("Informe o dia que você nasceu:");
		dia = entrada.nextByte();
		if ((dia>=1)&&(dia<=20)) {
			System.out.println("Seu signo é Peixes.");
		} else if ((dia>=21)&&(dia<=31)){
			System.out.println("seu signo é Áries");	
		}else {	
		}
	}
	public static void verAbril() {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		byte diaLimite=30;
		System.out.println("Informe o dia que você nasceu:");
		dia = entrada.nextByte();
		
		if (dia>diaLimite) {
			System.out.println("Esse mês vai até 30");
		}else if((dia>=1)&&(dia<=20)) {
			System.out.println("Seu signo é Áries.");
		} else if ((dia>=21)&&(dia<=30)){
			System.out.println("seu signo é Touro");	
		}else {	
		}
	}
	
	public static void verMaio() {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		System.out.println("Informe o dia que você nasceu:");
		dia = entrada.nextByte();
		if ((dia>=1)&&(dia<=20)) {
			System.out.println("Seu signo é Touro.");
		} else if ((dia>=21)&&(dia<=31)){
			System.out.println("seu signo é Gêmeos");	
		}else {	
		}	
	}
	
	public static void verJunho() {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		byte diaLimite=30;
		System.out.println("Informe o dia que você nasceu:");
		dia = entrada.nextByte();
		if (dia>diaLimite) {
			System.out.println("Esse mês vai até 30");
	    }else if((dia>=1)&&(dia<=20)) {
			System.out.println("Seu signo é Gêmeos.");
		} else if ((dia>=21)&&(dia<=30)){
			System.out.println("seu signo é Câncer");	
		}else {	
		}	
	}
	
	public static void verJulho() {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		System.out.println("Informe o dia que você nasceu:");
		dia = entrada.nextByte();
		if ((dia>=1)&&(dia<=22)) {
			System.out.println("Seu signo é Câncer.");
		} else if ((dia>=23)&&(dia<=31)){
			System.out.println("seu signo é Leão");	
		}else {	
		}	
	}
	
	public static void verAgosto() {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		System.out.println("Informe o dia que você nasceu:");
		dia = entrada.nextByte();
		if ((dia>=1)&&(dia<=22)) {
			System.out.println("Seu signo é Leão.");
		} else if ((dia>=23)&&(dia<=31)){
			System.out.println("seu signo é Virgem");	
		}else {	
		}	
	}
	
	public static void verSetembro () {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		byte diaLimite=30;
		System.out.println("Informe o dia que você nasceu:");
		dia = entrada.nextByte();
		if (dia>diaLimite) {
			System.out.println("Esse mês vai até 30");
	 	}else if((dia>=1)&&(dia<=22)) {
			System.out.println("Seu signo é Virgem.");
		} else if ((dia>=23)&&(dia<=30)){
			System.out.println("seu signo é Libra");	
		}else {	
		}	
	}
	
	public static void verOutubro () {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		System.out.println("Informe o dia que você nasceu:");
		dia = entrada.nextByte();
		if ((dia>=1)&&(dia<=22)) {
			System.out.println("Seu signo é Libra.");
		} else if ((dia>=23)&&(dia<=31)){
			System.out.println("seu signo é Escorpião");	
		}else {	
		}	
	}
	
	public static void verNovembro () {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		byte diaLimite=30;
		System.out.println("Informe o dia que você nasceu:");
		dia = entrada.nextByte();
		if (dia>diaLimite) {
			System.out.println("Esse mês vai até 30");
		}else if((dia>=1)&&(dia<=21)) {
			System.out.println("Seu signo é Escorpião.");
		} else if ((dia>=22)&&(dia<=30)){
			System.out.println("seu signo é Sagitário");	
		}else {	
		}	
		
	}
	
	public static void verDezembro() {
		Scanner entrada = new Scanner(System.in);
		byte dia;
		System.out.println("Informe o dia que você nasceu:");
		dia = entrada.nextByte();
		if ((dia>=1)&&(dia<=21)) {
			System.out.println("Seu signo é Sagitário.");
		} else if ((dia>=22)&&(dia<=31)){
			System.out.println("seu signo é Capricórnio");	
		}else {	
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}