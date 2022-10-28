package Paquete_ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Ejercicio 3.10.-
Modificar el codigo del Ejercicio 3.9 para que, cuando la fecha sea correcta, el programa
devuelva ademas la fecha del dia siguiente*/
		
		Scanner scan = new Scanner(System.in);
		int dia = 0;
		int mes = 0;
		int anio = 0;
		
	System.out.println("Introduzca el a�o:");
		anio = scan.nextInt();	
		
	if(anio >= 1000 && anio < 10000) {
			System.out.println("A�o correcto.");
		
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
		if(dia >0 && dia <= 31) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto");
		}
	break;
		
		
	} //fin switch
				
	} else if(anio < 1000 || anio >9999) {
			System.out.println("Año incorrecto. Fin algoritmo.");
		} //fin if año
		
	
	//Comprobador de fecha	+ sumar a la fecha
	if(mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia > 0 && dia <= 30 && anio >= 1000 && anio < 10000) {
		dia++;
		if(dia > 30) {
			dia = 1;
			mes++;
		}
		if(mes > 12) {
			mes = 1;
			anio++;
		} //fin if suma
		
		System.out.println("Fecha comprobada correcta. La fecha el dia siguiente será: " + dia + "/" + mes + "/" + anio + "." );
	} //fin if 30
		
	if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia >0 && dia < 32 && anio >= 1000 && anio < 10000) {
		dia++;
		if(dia > 31) {
			dia = 1;
			mes++;
		}
		if(mes > 12) {
			mes = 1;
			anio++;
		} //fin if suma
		
		System.out.println("Fecha comprobada correcta. La fecha el dia siguiente será: " + dia + "/" + mes + "/" + anio + "." );
	}	
			
	if(mes == 2 && dia >0 && dia <=28 && anio >= 1000 && anio < 10000) {
		dia++;
		if(dia > 28) {
			dia = 1;
			mes++;
		}
		if(mes > 12) {
			mes = 1;
			anio++;
		} //fin if suma
		
		System.out.println("Fecha comprobada correcta. La fecha el dia siguiente será: " + dia + "/" + mes + "/" + anio + "." );
	}	
		
		
		
		
	
	
	
	//Final [no tocar]	
	}

}
