package operadores;

public class operadoresAritmeticos {

	public static void main(String[] args) {
		
		Integer adicao = 1 + 1 ;
		System.out.println("adição: " + adicao);
		
		Integer subtracao = 1 - 1 ;
		System.out.println("subtracao: " + subtracao);
		
		Integer multiplicacao = 2 * 2 ;
		System.out.println("multiplicacao: " + multiplicacao);
		
		Integer divisao = 4 / 2 ;
		System.out.println("divisao: " + divisao);
		
		Integer modulo = 7 % 4; //Resto
		System.out.println("modulo: " + modulo);
		
		//PRECEDÊNCIA DE OPERADORES
		Integer precedencia1 = 1 + 1 * 5;
		System.out.println("Precedencia 01: " + precedencia1);
		
		Integer precedencia2 = (1 + 1) * 5;
		System.out.println("Precedencia 02: " + precedencia2);
		
		Integer precedencia3 = 5 * (1 + 1);
		System.out.println("Precedencia 02: " + precedencia3);
		
		Integer precedencia4 = 5 * (1+ 1) + 2;
		System.out.println("Precedencia 03: " + precedencia4);
		
		Integer precedencia5 = 5 * ((1+ 1) + 2);
		System.out.println("Precedencia 03: " + precedencia5);
		
		Integer cinco = 5;
		Integer um = 1;		
		Integer precedenciasComVariaveis = cinco * (um + um);
		System.out.println("Precedencia Com variáveis: " + precedenciasComVariaveis);

	}

}
