package Paquete_ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Escribir un programa que solicite al usuario dos números enteros y los muestre ordenados de
mayor a menor.*/
		
	Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
	System.out.println("Introduzca el primer numero:");
		num1 = scan.nextInt();
	System.out.println("Introduzca el segundo numero:");
		num2 = scan.nextInt();
		
	if(num1 > num2) {
		System.out.println("El numero " + num1 + " es mayor que " + num2 + ".");
		
	}
	if(num2 > num1) {
		System.out.println("El numero " + num2 + " es mayor que " + num1 + ".");
	}
	if(num2 == num1) {
		System.out.println("El numero " + num1 + " es igual que " + num2 + ".");
	}
		
	
	
	
	
	
	
	
		
	}

}
