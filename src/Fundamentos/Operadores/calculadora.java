package Fundamentos.Operadores;

import java.util.Scanner;

public class calculadora {
	
	static double nm1;
	static double nm2;
	static Double result;
	static String oper;
	
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Digite o número = ");
	 nm1 = sc.nextDouble();
	 System.out.println("Digite a operação: "); 
	 oper = sc.next();
	 System.out.println("Digite o número = ");
	 nm2 = sc.nextDouble();
	 
	 result = "+".equals(oper)? nm1 + nm2 :0;
	 result = "-".equals(oper)? nm1 - nm2 :result;
	 result = "*".equals(oper)? nm1 * nm2 :result;
	 result = "/".equals(oper)? nm1 / nm2 :result;
	 result = "%".equals(oper)? nm1 % nm2 :result;
	 
	 System.out.printf("%.2f %s %.2f = %.2f",nm1,oper,nm2,result);
	 
	 
	 sc.close();		
			
	}

}
