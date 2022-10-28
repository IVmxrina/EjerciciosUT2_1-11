package Paquete_ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Ejercicio 3.8.-
Escribir un programa que solicite al usuario un número comprendido entre 1 y 7,
correspondiente al día de la semana. El programa mostrará en pantalla el nombre del día
correspondiente: 1 -> Lunes, 2 -> Martes, etc. @Marina Cue */
		
	Scanner scan = new Scanner(System.in);
		int dia = 0;
		
	System.out.println("Introduzca un numero correspondiente al dia de la semana (de 1 a 7):");
		dia = scan.nextInt();
		
	switch(dia) {
	case 1:
		System.out.println("El dia es lunes.");
		break;
	case 2:
		System.out.println("El dia es martes.");
		break;
	case 3:
		System.out.println("El dia es miercoles.");
		break;
	case 4: 
		System.out.println("El dia es jueves.");
		break;
	case 5:
		System.out.println("El dia es viernes.");
		break;
	case 6:
		System.out.println("El dia es sabado.");
		break;
	case 7:
		System.out.println("El dia es domingo.");
		break;
		
	
	
	
	
	}
		
		
		
		
		
	}

}
