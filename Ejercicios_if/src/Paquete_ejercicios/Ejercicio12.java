package Paquete_ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Ejercicio 3.12-
 * Escribir un programa que pida una hora en el formato horas minutos y segundos y 
 * muestre a continuacion que hora sera un segundo mas tarde. */
		
	Scanner scan = new Scanner(System.in);
		int hora = 0;
		int min = 0;
		int seg = 0;
		
	System.out.println("Introduzca la hora en formato horas, minutos y segundos:");
		hora = scan.nextInt();
		min = scan.nextInt();
		seg = scan.nextInt();
		
	seg++;
	
	if(seg > 59) {
		seg = seg % 60;
		min++;
	}
	if(min > 59) {
		min = min % 60;
		hora++;
	}
	
	System.out.println("La hora con un segundo añadido sera: " + seg + " segundos, " + min + " minutos, y "+ hora + " horas.");
		
		
		
		
		
		
		
		
		
		
	}

}
