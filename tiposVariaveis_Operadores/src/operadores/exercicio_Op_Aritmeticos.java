package operadores;

import java.util.Scanner;

public class exercicio_Op_Aritmeticos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Escolha a operação
		System.out.println("Escolha o numero da operação");
		System.out.println("----------------------------");
		System.out.println("1 - Multiplicação");
		System.out.println("2 - Divisão");
		System.out.println("3 - Subtração");
		System.out.println("4 - Adição");
		System.out.println("5 - Resto/modulo");
		System.out.println("----------------------------");

		System.out.print("Selecione a operação desejada: ");
		Integer operador = sc.nextInt();

		Double resultado = null;

		if (operador >= 1 && operador <= 5) {

			System.out.println("----------------------------");
			System.out.print("Informe o primeiro número: ");
			Double n1 = sc.nextDouble();
			System.out.print("Informe o segundo número: ");
			Double n2 = sc.nextDouble();

			if (operador.equals(1)) {
				resultado = n1 * n2;
			}
			if (operador.equals(2)) {
				resultado = n1 / n2;
			}
			if (operador.equals(3)) {
				resultado = n1 - n2;
			}
			if (operador.equals(4)) {
				resultado = n1 + n2;
			}
			if (operador.equals(5)) {
				resultado = n1 % n2;
			}
			System.out.println("O resultado da operação é: " + resultado);

		} else {
			System.out.println("O número informado, não corresponde a um operador válido");
		}

		sc.close();
	}

}
