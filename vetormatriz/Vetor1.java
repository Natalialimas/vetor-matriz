package pacoteTeste;

public class Vetor1
{
	public static void main (String args[])
	{	
		int [] a = {1, 0, 5, -2, -5, 7};
		int soma=0, x=0;
		
		System.out.println("\nValor Inicial de A[] são: 1, 0, 5, -2, -5, 7");

		for  (x = 0; x <= a.length; x++)
		{
			if(a[4]==-5)
			{
				a[4]=100;
			}
		}	
		soma = a[0]+a[1]+a[5];
		System.out.println("\nA soma das posições A[0], A[1] e A[5] é: "+soma);
		
		System.out.println("\nValor de A[0] é: "+a[0]);
		System.out.println("Valor de A[1] é: "+a[1]);
		System.out.println("Valor de A[2] é: "+a[2]);
		System.out.println("Valor de A[3] é: "+a[3]);
		System.out.println("Valor de A[4] é: "+a[4]);
		System.out.println("Valor de A[5] é: "+a[5]);
	}

}
