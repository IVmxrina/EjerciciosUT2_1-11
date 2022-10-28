package Paquete_ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

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
		
		
	System.out.println("Introduzca el dia:");
		dia = scan.nextInt();
	System.out.println("Introduzca el mes:");
		mes = scan.nextInt();
	System.out.println("Introduzca el año:");
		anio = scan.nextInt();
		
	if(anio <= 9999 && anio >= 1000) {
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia > 0 && dia <= 30) {
			//abril, junio, septiembre, noviembre
			System.out.println("Fecha correcta");
			} else if (dia < 0 && dia > 30){
				System.out.println("Fecha incorrecta. El mes introducido no corresponde con el numero de dias.");
			}	
		
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia >0 && dia < 32) {
			//enero, marzo, mayo, julio, agosto, octubre, diciembre
			System.out.println("Fecha correcta.");
			} else if (dia >= 32) {
				System.out.println("Fecha incorrecta. El mes introducido no corresponde con el numero de dias.");
			}	
		
		if(mes == 2 && dia >0 && dia <=28) {
			System.out.println("Fecha correcta.");
			} else if (mes == 2 && dia > 0 && dia > 28) {
				System.out.println("Fecha incorrecta. El mes introducido no corresponde con el numero de dias.");
			}
		
		if(mes <0 && mes >12) {
			System.out.println("Fecha incorrecta. Dato mes fuera de rango.");
		}
		
		
		
	} else {
		System.out.println("Fecha incorrecta. Año fuera de rango.");
	}
		
		
		
		
		
		
		
		
	}

}
