package pacoteTeste;

import java.util.Scanner;

public class Matriz4
{
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		float [][] m1 = new float[2][2], m2 = new float[2][2];
		float [][] somar = new float[2][2], subtrair= new float[2][2];
		int consti, op = 0, l=0,c=0;
		
		for (l=0;l<2;l++) 
		{
			for (c=0;c<2;c++) 
			{
				System.out.println ("Entre com um número: ");
				m1[l][c]= ler.nextFloat();
			}
		}
				
		for (l=0;l<2;l++) 
		{
			for (c=0;c<2;c++) 
			{
				System.out.println ("Entre com um número: ");
				m2[l][c]= ler.nextFloat();
			}
		}
		
		System.out.println("\n (1) Somar as duas matrizes");
		System.out.println("\n (2) Subtrair a primeira matriz da segunda");
		System.out.println("\n (3) Adcionar uma constante as duas matrizes");
		System.out.println("\n (4) Imprimir as matrizes");
		System.out.println("\n Escolha uma opção: ");
		
		op = ler.nextInt();
		switch (op)
		{
		case 1:
			for(l=0;l<6;l++) 
			{
				for (c=0;c<2;c++)
				{
					somar[l][c] = m1[l][c]+m2[l][c];
					System.out.println("Valor: "+somar[l][c]);
				}
			}
			
			break;
		case 2:
			for (l=0;l<2;l++)
			{
				for (c=0;c<2;c++)
				{
					subtrair[l][c] = m1[l][c]+m2[l][c];
					System.out.println("\nValor: "+somar[l][c]);
				}
			}
			break;
		case 3: 
			System.out.println(" Entre com um valor constante: " );
			consti = ler.nextInt();
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++) 
				{
				 m1[l][c] = m1[l][c]+consti;
				 m2[l][c] = m2[l][c]+consti;
				 System.out.println(" \n Matriz1: " + m1[l][c]);
				 System.out.println(" \n Matriz1: " + m2[l][c]);
				}
			}
			break;
		case 4:
			for (l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					 System.out.println(" \n Matriz1: " + m1[l][c]);
				}
			}
			
			for (l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					 System.out.println(" \n Matriz2: " + m2[l][c]);
				}
			}
			break;
					default:
					System.out.println(" \n Opção inválida...");
		 }
	  }	
	}
