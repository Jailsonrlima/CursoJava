package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	    System.out.println("Digite o valor do primeiro salário ");
		String v1 = sc.nextLine().replace(",", ".");
		System.out.println("Digite o valor do segundo salário ");
	    String v2 = sc.nextLine().replace(",",".");
	    System.out.println("Digite o valor do terceiro salário ");
	    String v3 = sc.nextLine().replace(",", ".");
	   
	    Double s1 = Double.parseDouble(v1);
	    Double s2 = Double.parseDouble(v2);
	    Double s3 = Double.parseDouble(v3);
	    
	    Double media = (s1+s2+s3)/3;
	    System.out.println("Media salarial: "+media);
	    
		sc.close();

	}

}
