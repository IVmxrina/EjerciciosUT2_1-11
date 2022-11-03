package Ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Ejercicio 3.19-
 * Escribir un prograama que muestres para cada numero introducido por teclado, si es par, si es positivo y su cuadrado. El proceso se repetira 
 * hasta que el numero introducido sea cero. */
	Scanner scan = new Scanner(System.in);
		int num = 0;
		
	System.out.println("Introduzca un numero:");
		num = scan.nextInt();
	
	while(num != 0) {
		if(num % 2 == 0) {
			System.out.println("El numero introducido es par.");			
		}//Fin if 1
		
		if(num >= 0) {
			System.out.println("El numero es positivo.");
		}//fin if 2
		
		num = num * num;
		
		System.out.println("La raiz cuadrada del numero introducido es " + num);
		
		System.out.println("Introduzca un numero:");
			num = scan.nextInt();
	} //Fin while
		
	System.out.println("Has introducido un 0, fin de algoritmo.");
		
		
		
		
		
		
		
		
	}

}