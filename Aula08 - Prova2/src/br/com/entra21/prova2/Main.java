package br.com.entra21.prova2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String option;

		System.out.println("|-----------------------------------------------|");
		System.out.println("|------------------CALCULADORA------------------|");
		System.out.println("|-----------------------------------------------|");
		System.out.println("choose an option:");
		System.out.println("0 - QUIT \n1 - ADD  \n2 - SUBTRACT  \n3 - MULTIPLY \n4 - DIVIDE");
		option = input.next();

		runSwitch(option.toLowerCase());

	}

	private static void runSwitch(String choseOption) {
		final String INVALID_OPTION = "Invalid option try again";

		switch (choseOption) {

		case "0", "quit":
			System.out.println("closing calculator");
			break;
		case "1", "add":
			runAdd(inputNumber((byte) 1), inputNumber((byte) 2));
			break;
		case "2", "subtract":
			runSubtract(inputNumber((byte) 1), inputNumber((byte) 2));
			break;
		case "3", "multiply":
			runMultiply (inputNumber((byte)1), inputNumber((byte) 2));
			break;
		case "4", "divide":
			runDivide (inputNumber((byte)1), inputNumber((byte) 2));
			break;
		default:
			System.out.println(INVALID_OPTION);
			main(null);
			break;
		}
	}

	private static float inputNumber(byte position) {
		System.out.println("Inform the " + position + "" + (position == 1 ? "st" : "nd") + " number");
		float number;
		number = new Scanner(System.in).nextFloat();
		return number;
	}

	private static void runAdd(float firstNumber, float secondNumber) {
		System.out.println("Result: " + (firstNumber + secondNumber));
		main(null);
	}

	private static void runSubtract(float firstNumber, float secondNumber) {
		System.out.println("Result: " + (firstNumber-secondNumber));
		main(null);
	}
	
	private static void runMultiply (float firstNumber, float secondNumber) {
		System.out.println("Resut: "+(firstNumber*secondNumber));
		main(null);
	}
	
	private static void runDivide (float firstNumber, float secondNumber) {
		System.out.println("Result: "+(firstNumber/secondNumber));
		main(null);
	}

}