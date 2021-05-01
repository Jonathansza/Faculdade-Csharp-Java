package numeromaior;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n1,n2;

		 System.out.println("Digite o primeiro valor: ");
		 n1 = entrada.nextInt();
		 
		 System.out.println("Digite o segundo valor: ");      
		 n2 = entrada.nextInt();
		 
		 if(n1>n2)
		 {
		        System.out.println("O primeiro numero é maior com valor: " + n1);
		 }else if(n2>n1)
		 {
		        System.out.println("O segundo numero é maior com valor: " + n2);
		 }
		                                 
	}

}
