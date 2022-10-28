package Paquete_ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Ejercicio 3.4.-
Escribe un programa que declare una variable N de tipo entero y le asigne un valor. A
continuación debe mostrar una serie de mensajes indicando si el valor de N es positivo
o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor
que 36. Considera el 0 como positivo. Utiliza el operador ternario ( ? : ) dentro del
println.*/
		
	Scanner scan = new Scanner(System.in);
		int num = 0;
		
	System.out.println("Introduzca un numero:");
		num = scan.nextInt();
		
	if(num <0) {
		System.out.println("Este numero es negativo.");
	}
	
	if(num % 2 == 0) {
		System.out.println("El numero es par.");
	} else {
		System.out.println("El numero es impar.");
	}
	
	if(num % 5 == 0) {
		System.out.println("El numero es multiplo de 5.");
	} else if(num % 10 == 0) {
		System.out.println("El numero es multiplo de 10.");
	}
		
	if (num > 36) {
		System.out.println("El numero es mayor que 36");
	} else if(num >= 36) {
		System.out.println("El numero es menor que 36.");
	}
		
		
		
		
		
		
		
		
		
		
	}

}
