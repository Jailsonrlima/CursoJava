package Fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia!";
		
		s = s.replace("x", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia x"
				.replace("x","Gui")
				.toUpperCase()
				.concat("!");
		System.out.println(y);
		
		// Tipos primitivos não tem operador"."
		int a = 3;
		System.out.println(a);
		
	}

}
