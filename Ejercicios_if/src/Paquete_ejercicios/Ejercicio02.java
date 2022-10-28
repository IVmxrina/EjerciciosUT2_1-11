package Paquete_ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Ejercicio 3.2.-
a) Escribe un programa que pida dos números enteros y que calcule su división,
escribiendo si la división es exacta o no.
b) Mejorar el programa haciendo que tenga en cuenta que no se lleva a cabo una
división por cero.*/
		
	Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
	System.out.println("Introduzca el primer numero:");
		num1 = scan.nextInt();
	System.out.println("Introduzca el segundo numero:");
		num2 = scan.nextInt();
		
	if(num1 == 0 || num2 == 0) {
		System.err.println("No se puede. dividir los numeros porque uno de ellos es 0.");
		
	} else if(num1 % num2 == 0 || num2 % num1 ==0 ){
		System.out.println("La división entre los dos numeros es exacta.");
	} else {
		System.out.println("La división de los numeros no es exacta.");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
