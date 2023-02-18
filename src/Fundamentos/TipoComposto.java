package Fundamentos;
/*
 * Em java tudo é objeto, menos os tipo primitivos.
 * Paraca tipo primitivo temos um wapper, o nome de cada reper é igual ao nome do tipo primitivo que 
 * representa começãndo com letra Maiuscula.
 * exceção:int que passa a ter o nome de Integer, e char passa a ser Caracter
 * */

public class TipoComposto {

	public static void main(String[] args) {
		
		//objetos que representam os tipo inteiros
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 100000L;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l+"\n");
		
		//objetos que representam os tipos de ponto flutuante
		Float f = 10.0F;
		Double d = 100.0;
		System.out.println(f);
		System.out.println(d+"\n");
		
		
		//tipo literais 
		Boolean bo = Boolean.parseBoolean("True");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c+"...");
		
		
		
	}

}
