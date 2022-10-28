package Paquete_ejercicios;

import java.util.Scanner;


public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Ejercicio 3.5.-
Escribe un programa que solicite un número entre 0 y 9.999 y devuelva el número de cifras.
Por ejemplo “765 tiene 3 cifras”, “36 tiene 2 cifras”. */		
		
	Scanner scan = new Scanner(System.in);
		int num = 0;
		
	System.out.println("Introduzca el numero deseado:");
		num = scan.nextInt();
		
	if(num >= 0 && num < 10) {
		System.out.println("Su numero tiene 1 cifra.");
	}
	
	if(num >=10 && num <= 99) {
		System.out.println("Su numero tiene 2 cifras.");
	}
	
	if(num >=100 && num <= 999) {
		System.out.println("Su numero tiene 3 cifras.");
	}
	
	if(num >=1000 && num <=9999) {
		System.out.println("Su numero tiene 4 cifras.");
	}
		
		
		
	}

}
