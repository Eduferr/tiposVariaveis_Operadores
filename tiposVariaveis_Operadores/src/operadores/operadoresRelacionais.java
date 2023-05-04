package operadores;

public class operadoresRelacionais {

	public static void main(String[] args) {
		Boolean maior = 3 > 2;
		System.out.println("3 > 2? " + maior);

		Boolean menor = 3 < 2;
		System.out.println("3 < 2? " + menor);

		Boolean maiorIgual = 3 >= 3;
		System.out.println("3 >= 3? " + maiorIgual);

		Boolean menorIgual = 3 >= 3;
		System.out.println("3 <= 3? " + menorIgual);
		
		Boolean igual = 3 == 3;
		System.out.println("3 = 3? " + igual);
		
		Boolean diferente = 3 != 3;
		System.out.println("3 != 3? " + diferente);
		
		Integer tres = 3;
		Boolean diferente2 = tres != tres;
		System.out.println("3 != 3? " + diferente2);
		
		Boolean igualdade = tres.equals(3);
		System.out.println("tres.equals(3)?" + igualdade);
		
		// Em igualdade usar o .equals(), pois o == é limitado até o numero 127 em variáveis do tipo normal
		Integer centoVinteOito = 128;
		Integer centoVinteOito2 = 128;
		Boolean Igual128 = centoVinteOito.equals(centoVinteOito2);
		System.out.println("centoVinteOito.equals(centoVinteOito2)? " + Igual128);
		
		Boolean Igual128Igual = centoVinteOito == centoVinteOito2;
		System.out.println("centoVinteOito.equals(centoVinteOito2)? " + Igual128Igual);
		
		int centoVinteNove = 129; //usando o tipo primitivo do java
		int centoVinteNove2 = 129;
		Boolean Igual129 = centoVinteNove == centoVinteNove2;
		System.out.println("centoVinteNove == centoVinteNove2? " + Igual129);
		
	}

}
