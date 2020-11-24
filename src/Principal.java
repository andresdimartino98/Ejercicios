

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* converti cada ejercicio en una funcion diferente
		 * desde el main solo invoco a la funcion que quiero
		 * el try catch podria ir una sola vez en el main 
		 * o en cada funcion en particular
		 */

		//ejerciciouno();
		//ejerciciodos();
		//ejercicioseis();
		//ejerciciosiete();
    	//	ejercicioocho();
		//ejercicionueve();
	
		//ejerciciodiez();
		
		ejerciciocuatro();
		//ejerciciocuatro1();


		
	
		
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
	



		
		

//ejercicio 7
	private static void ejerciciosiete()
{
		int i ;

		
for(i=0; i<200; i=i+2)
		
	{
		System.out.println(i);
	}
}
		
	
	//ejercicio 8
	
	private static void ejercicioocho()
{
		int i ;
		int p ;

		
for(i=0; i<200; i=i+2)
		
	{
		System.out.println(i);
		if (( i % 4)== 0){
			System.out.println("numeros multiplos de 4 :" + i);
			}
		}
	}



	
	
//ejercicio 9
	private static void ejercicionueve(){
	
	Scanner sc = new Scanner (System.in);
	System.out.println("ingrese varions numeros enteros y un numero negativo para finalizar");
	
	long acumulador = 0;
	int numA ;
	int maximo = 0 ; 
	numA = sc.nextInt();
	maximo =numA;
	
	while (numA >= 0)
	{
		acumulador =  acumulador + numA;
		
		if (numA > maximo){
			maximo =numA ;
		}
		
		numA = sc.nextInt();
	}
	{
	System.out.println("la suma es :" +  acumulador );
	System.out.println("el maximo es :" + maximo );
	
	}
}
	

//ejercicio diez

private static void ejerciciodiez(){

Scanner sc = new Scanner (System.in);
System.out.println("ingrese varions numeros enteros y un numero negativo para finalizar");

long acumulador = 0;
int numA ;
int minimo = 0 ; 
numA = sc.nextInt();
minimo =numA;

while (numA >= 0)
{
	acumulador =  acumulador + numA;
	
	if (numA < minimo){
		minimo =numA ;
	}
	
	numA = sc.nextInt();
}
{
System.out.println("la suma es :" +  acumulador );
System.out.println("el minimo es :" + minimo );
}
}




//ejercicio cuatro

private static void ejerciciocuatro(){
	int nota1;	
	int nota2;
	int nota3;
	float promedio;
	
	boolean continuar = false;
	
	Scanner sc = new Scanner (System.in);
	try{
		
		do
		{
    continuar =false;
	System.out.println("ingrese 3 notas");
	
	//nota1=sc.nextInt();
	//nota2=sc.nextInt();
	//nota3=sc.nextInt();
	
	if( (nota1<= 10)&&(nota2<= 10) &&(nota3<= 10)&&(nota1>= 0)&&(nota2>= 0)&&(nota3>= 0)){
		
	float promedio =  calcularPromedio (int nota1,int  nota2 ,int nota3);
			
		

    if ((promedio >=4)&&(nota1>=4)&&(nota2>=4)&&(nota3>=4)){
		
		System.out.println("el alumno esta aprobado");
	}
	
		else
			
		{
			System.out.println ("el alumno no aprobo");
			 continuar =true;
		}
		
	
	}
		}
	
		while (continuar);
	
			
	
	}
	catch (Exception ex)
	
	
	{
		System.out.println("ingreso un valor inesperado");
		
	}
}	


	private static float 	 calcularPromedio (int nota1,int nota2 ,int nota3){
	
		
		float promedio = nota1 +nota2 + nota3;
		promedio = promedio /3;

		System.out.println ("el promedio es :" + promedio);
		
		return promedio ;
	}
	
}
	

//private static float calcularPromedio(int nota1, int nota2, int nota3) {
	// TODO Auto-generated method stub
//	return 0;
//}
//}	
	
	





