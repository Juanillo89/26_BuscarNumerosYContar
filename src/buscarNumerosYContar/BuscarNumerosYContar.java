package buscarNumerosYContar;

import java.util.Scanner;

public class BuscarNumerosYContar
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[9];
		String respuesta;
		boolean encontrado;
		int buscar;
		int contRepetidos = 0;
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.print("Número: ");
			numeros[i] = Integer.parseInt(sc.nextLine());
		}
		do
		{
			System.out.print("Número a buscar:");
			buscar = Integer.parseInt(sc.nextLine());
			encontrado = false;
			contRepetidos = 0;
			for(int i = 0; i < numeros.length; i++)
			{
				if(buscar == numeros[i])
				{
					encontrado = true;
					contRepetidos++;
				}
			}
			if(encontrado)
			{
				System.out.println("Encontrado " + contRepetidos + " veces.");
			}
			else
			{
				System.out.println("No encontrado");
			}
			System.out.print("¿Seguir buscando (s/n)?");
			respuesta = sc.nextLine();
		}
		while(respuesta.equals("s"));
		sc.close();
	}
}

