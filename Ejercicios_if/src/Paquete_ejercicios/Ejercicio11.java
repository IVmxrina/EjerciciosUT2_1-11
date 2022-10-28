package Paquete_ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Pedir dos fechas y mostrar el numero de dias  mostrar el numero de dias de diferencia entre ellos.*/
		
		Scanner scan = new Scanner(System.in);
		int dia = 0;
		int mes = 0;
		int anio = 0;
		int dia1 = 0;
		int mes1 = 0;
		int anio1 = 0;
		int restodias = 0;
		
	System.out.println("Introduzca el primer año:");
		anio = scan.nextInt();	
		
	if(anio >= 1000 && anio < 10000) {
			System.out.println("Año correcto.");
		
	System.out.println("Introduzca el primer mes:");
		mes = scan.nextInt();
	System.out.println("Introduzca el primer dia:");
		dia = scan.nextInt();
		
	switch(mes) {
	case 1:
		if(dia >0 && dia <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto");
		}
	break; 
	
	case 2:
		if(dia >0 && dia <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto.");
		}
	break;
	
	case 3:
		if(dia >0 && dia <= 30) {
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
		if(dia >0 && dia <= 30) {
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
		if(dia >0 && dia <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto");
		}
	break;
		
	case 8:
		if(dia >0 && dia <= 30) {
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
		if(dia >0 && dia <= 30) {
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
	
	System.out.println("La fecha es: " + dia + "/" + mes + "/" + anio + ".");
	
	
//SIGUIENTE FECHA
	
	
		
	System.out.println("Introduzca el segundo año:");
	anio1 = scan.nextInt();	
	
	if(anio1 >= 1000 && anio < 10000) {
			System.out.println("Año correcto.");
		
	System.out.println("Introduzca el segundo mes:");
		mes1 = scan.nextInt();
	System.out.println("Introduzca el segundo dia:");
		dia1 = scan.nextInt();
		
	switch(mes1) {
	case 1:
		if(dia1 >0 && dia1 <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto");
		}
	break; 
	
	case 2:
		if(dia1 >0 && dia1 <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto.");
		}
	break;
	
	case 3:
		if(dia1 >0 && dia1 <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto.");
		}
	break;	
	
	case 4:
		if(dia1 >0 && dia1 <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto.");
		}
	break;
		
	case 5:
		if(dia1 >0 && dia1 <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto.");
		}
	break;
		
	case 6:
		if(dia1 >0 && dia1 <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto");
		}
	break;
		
	case 7:
		if(dia1 >0 && dia1 <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto");
		}
	break;
		
	case 8:
		if(dia1 >0 && dia1 <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto");
		}
	break;	
		
	case 9:
		if(dia1 >0 && dia1 <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto");
		}
	break;
		
	case 10:
		if(dia1 >0 && dia1 <= 30) {
		System.out.println("Dia correcto. La fecha es correcta.");
		} else {
		System.out.println("Dia incorrecto");
	}
	break;
		
	case 11:
		if(dia1 >0 && dia1 <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto");
		}
		break;
		
	case 12:
		if(dia1 >0 && dia1 <= 30) {
			System.out.println("Dia correcto. La fecha es correcta.");
		} else {
			System.out.println("Dia incorrecto");
		}
	break;
	
	
	
		
	} //fin switch
	
	} else if(anio1 < 1000 || anio1 >9999) {
		System.out.println("Año incorrecto. Fin algoritmo.");
	}	
			
	System.out.println("La fecha es: " + dia1 + "/" + mes1 + "/" + anio1 + ".");	
			

	mes1 = mes1 * 30;
	dia1 = dia1 + mes1;
	anio1 = anio1 * 12 * 30;
	dia1 = dia1 + anio1;
		
	mes = mes * 30;
	dia = dia + mes;
	anio = (anio * 12) * 30;
	dia = dia + anio;
	
	if(dia1 > dia) {
		restodias = dia1 - dia;
	} else if(dia > dia1) {
		restodias = dia - dia1;
	}
	
	System.out.println("La diferencia de dias entre las fechas es: " + restodias + ".");
	

	} //final [no borrar]
}
