package operadores;

import java.util.Scanner;

public class exercicio_Op_Logicos {
	
	static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
	static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;

	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Calculo para Aposentadoria");
		System.out.println("--------------------------");
		System.out.print("Informe sua idade: ");
		Integer idadeatual = sc.nextInt();
		System.out.print("Informe o tempo de contribuição: ");
		Integer totalContribuicao = sc.nextInt();
		
		Boolean podeAposantar = (idadeatual >= IDADE_MINIMA_PARA_APOSENTAR) 
				             && (totalContribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO);
		
		if (podeAposantar) {
			System.out.println("Você pode aposentar");
		} else {
			System.out.println("Você não pode aposentar");
		}
		sc.close();

	}

}
