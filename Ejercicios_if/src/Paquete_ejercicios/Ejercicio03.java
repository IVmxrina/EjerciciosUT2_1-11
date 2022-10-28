package Paquete_ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Ejercicio 3.3.-
Para pagar el impuesto de Patrimonio se debe ser mayor de 16 años y tener unos ingresos
iguales o superiores a 1000 € mensuales. Escribe un programa que pregunte al usuario su
edad y sus ingresos mensuales y muestre por pantalla si el usuario tiene que tributar o no.*/
		
	Scanner scan = new Scanner(System.in);
		int edad = 0;
		int ingresos = 0;
		
	System.out.println("Introduzca su edad:");
		edad = scan.nextInt();
	System.out.println("Introduzca sus ingresos mensuales:");
		ingresos = scan.nextInt();
		
	if(edad >=16) {
		if(ingresos >999) {
			System.out.println("Usted debe tributar.");
		}else {
			System.out.println("Usted no puede tributar.");
		}
	}else {
		System.out.println("Usted no puede tributar.");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
