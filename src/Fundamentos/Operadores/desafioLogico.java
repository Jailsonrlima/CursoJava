package Fundamentos.Operadores;

import java.util.Scanner;

public class desafioLogico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Tebalhou na terça");
		String tb1 = sc.next();
		System.out.println("Tebalhou na quinta");
		String tb2 = sc.next();
		
		if (tb1.equals(tb2)){
			System.out.println("Comprou TV 50");
		
		}else{
			System.out.println("Comprou TV 32");
		}
	
		sc.close();
	}

}
