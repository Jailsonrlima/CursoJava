package Fundamentos.Operadores;

public class Logicos {

	public static void main(String[] args) {
		System.out.println("Tabela Verdade E AND");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		System.out.println(false && true);
		
		System.out.println("Tabela Verdade OU OR");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println(false || true);
		
		System.out.println("Tabela Verdade OU Exclusivo XOR");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println(false || true);
		
		System.out.println("Tabela Verdade NOT !");
		System.out.println(!true);
		System.out.println(!false);

	}

}
