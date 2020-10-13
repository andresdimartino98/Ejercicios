

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* converti cada ejercicio en una funcion diferente
		 * desde el main solo invoco a la funcion que quiero
		 * el try catch podria ir una sola vez en el main
		 * o en cada funcion en particular
		 */
		ejerciciouno();
		ejerciciodos();
		ejercicioseis();
	}
	
	//ejercicio 1
	private static void ejerciciouno()
	{
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
		
//ejercicio dos

	private static void ejerciciodos() {

		Scanner sc = new Scanner (System.in);
		
		int numero1;
		int numero2;
		int resultado;
		
		
		System.out.println("ingrese numero entero");
		numero1 = sc.nextInt();
		
		System.out.println("ingrese otro numero entero");
		numero2 = sc.nextInt();
		
		if ( numero1 < numero2 ) {
	  System.out.println("el nuemero mayor es:" + numero2);
		}
		else{//revisar esta parte, si es igual muestra que el numero 1 es mayor
		
			System.out.println("el nuemero mayor es:" + numero1);
		
			}
	
		if (numero2 == numero1){
			System.out.println("los numeros son iguales:" + numero2);
		}
	}


			
		
		//ejercicio seis

	private static void  ejercicioseis() {


		Scanner sc = new Scanner (System.in);
		short mes;
		
		
		System.out.println("ingrese un mes ");
		mes = (short) sc.nextInt();
		
		
		switch(mes) {
		  case 1:
		  case 3:
		  case 5:
		  case 7:
		  case 8:
		  case 10:
		  case 12:
			  
			  System.out.println("el mes tiene 31 días ");
		    break;
		  
		  case 2:
			  System.out.println("el mes tiene 28 días ");
			 
		    break;
		 
		  case 4:
		  case 6:
		  case 9:
		  case 11:
			  
			  System.out.println("el mes tiene 30 días ");
		 
			  
			  
			    break; 
		    
		    
		  default:
			  
			  System.out.println("el número ingresado no corresponde a un mes, ingrese numeros del 1 al 12");
		}

	}

}

		
		




