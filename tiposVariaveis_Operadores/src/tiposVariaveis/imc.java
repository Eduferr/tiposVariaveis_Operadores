package tiposVariaveis;


import java.util.Scanner;

public class imc {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe sua alttura: ");
		Double altura = sc.nextDouble();
		
		System.out.print("Informe sua peso: ");
		Double peso = sc.nextDouble();
		
		Double imc = peso / (altura * altura);
		
		System.out.println("O IMC é de: " + imc);

	}

}
