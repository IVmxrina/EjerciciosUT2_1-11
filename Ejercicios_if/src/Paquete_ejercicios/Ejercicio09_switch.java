package Paquete_ejercicios;

import java.util.Scanner;

public class Ejercicio09_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* Ejercicio 3.9.-
	Escribir un programa que pida al usuario el día, mes y año de una fecha, e indicar si la fecha
	es correcta. Hay que tener en cuenta que los meses tienen 28, 30 y 31 días. No se
	considerarán los años bisiestos. */
				
	Scanner scan = new Scanner(System.in);
		int dia = 0;
		int mes = 0;
		int anio = 0;
		
	System.out.println("Introduzca el año:");
		anio = scan.nextInt();	
		
	if(anio >= 1000 && anio < 10000) {
			System.out.println("Año correcto.");
		
	System.out.println("Introduzca el mes:");
		mes = scan.nextInt();
	System.out.println("Introduzca el dia:");
		dia = scan.nextInt();
		
	switch(mes) {
	case 1:
		if(dia >0 && dia <= 31) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto");
		}
	break; 
	
	case 2:
		if(dia >0 && dia <= 28) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto.");
		}
	break;
	
	case 3:
		if(dia >0 && dia <= 31) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto.");
		}
	break;	
	
	case 4:
		if(dia >0 && dia <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto.");
		}
	break;
		
	case 5:
		if(dia >0 && dia <= 31) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto.");
		}
	break;
		
	case 6:
		if(dia >0 && dia <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto");
		}
	break;
		
	case 7:
		if(dia >0 && dia <= 31) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto");
		}
	break;
		
	case 8:
		if(dia >0 && dia <= 31) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto");
		}
	break;	
		
	case 9:
		if(dia >0 && dia <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto");
		}
	break;
		
	case 10:
		if(dia >0 && dia <= 31) {
		System.out.println("Dia correcto. La fecha es correcta.");
		} else {
		System.out.println("Dia incorrecto");
	}
	break;
		
	case 11:
		if(dia >0 && dia <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto");
		}
		break;
		
	case 12:
		if(dia >0 && dia <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto");
		}
	break;
		
		
	} //fin switch
				
	} else if(anio < 1000 || anio >9999) {
			System.out.println("Año incorrecto. Fin algoritmo.");
		}
							
	//final			
	}

}
