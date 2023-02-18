package Fundamentos;
/*Metodos da tipo string*/
public class TipoString {

	public static void main(String[] args) {

		System.out.println("Olá pessoal".charAt(2));
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().startsWith("Tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;

		System.out.println(
				"Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Salario " + salario + "\n\n");

		System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);

		String frase = String.format("\nO Senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);

		System.out.println("frase qualquer".contains("qual")); //contem a palavra qual na frese
		System.out.println("frase qualquer".indexOf("qual"));
		System.out.println("frase qualquer".substring(6,10));//Pega um parte da fresa, iniciando e terminando em um ponto determinado

	}

}
