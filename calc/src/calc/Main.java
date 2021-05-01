package calc;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double n1, n2, resultado=0;
	    int op;
	    System.out.println("Digite o primeiro numero:");
	    n1 = entrada.nextDouble();
	    System.out.println("Digite o segundo numero:");
	    n2 = entrada.nextDouble();

	    System.out.println("1.......Somar");
	     System.out.println("2.......Subtrair");
	     System.out.println("3.......Dividir");
	     System.out.println("4.......Multiplicar");
	    System.out.println("5.......Sair");
	    
	     System.out.println("Escolha uma opçao:");

	    op = entrada.nextInt();

	    while (op == 5) {
	          System.out.println("Operacao finalizada");
	      break;
	    }
	      
	    
	    if(op==1)
	    {
	      resultado = somar(n1,n2);
	    }

	    if(op==2)
	    {
	      resultado = subtrair(n1,n2);
	    }

	    if(op==3)
	    {
	      resultado = dividir(n1,n2);
	    }

	    if(op==4)
	    {
	      resultado = multiplicar(n1,n2);
	    }
	    
	    System.out.println("A soma é:" + resultado);
	      
	  
	  } 

	  private static double somar (double n1, double n2)
	{
	  double soma = n1 + n2;
	  return soma;
	}  

	  private static double subtrair (double n1, double n2)
	{
	  double sub = n1 - n2;
	  return sub;
	}  

	  private static double dividir (double n1, double n2)
	{
	  double div = n1 / n2;
	  return div;
	}  

	  private static double multiplicar (double n1, double n2)
	{
	  double mult = n1 * n2;
	  return mult;

	}

}
