import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//aca voy a poner mis ejercicios para subir a git
		
		Scanner sc = new Scanner (System.in);
		int numeroA;
		int numeroB;
		int resultado;

		try
		{
		System.out.println("ingrese numero entero");
		numeroA = sc.nextInt();

		System.out.println("ingrese numero entero");
		numeroB = sc.nextInt();

		resultado= numeroA + numeroB;

		System.out.println("la suma es " + resultado);


		}
		catch (Exception ex)
		{
			System.out.println("ingreso un numero inesperado ");
		}
			}
		
		
		
		
		
		
		
	}


