package operadores;

public class operadoresIncrementoDecremento {

	public static void main(String[] args) {
		Integer numero = 10;
		System.out.println("número antes do incremento:" + numero);
		++numero;// Incrementando
		System.out.println("número depois do incremento:" + numero);
		System.out.println("-----------------------");

		Integer numero1 = 10;
		// Integer numero2 = ++numero1;
		Integer numero2 = numero1++; // primeiro a variável é utilizada, depois incrementada
		System.out.println("Número1: " + numero1 + " número2: " + numero2);
		System.out.println("-----------------------");

		Integer numero3 = 10;
		--numero3;
		System.out.println("Número3: " + numero3);
	}

}
