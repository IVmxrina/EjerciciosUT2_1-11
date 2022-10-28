package Paquete_ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Ejercicio 3.7.-
Pedir una nota entera de 0 a 10 y mostrarla de forma literal de la siguiente forma: (de 0 a 4) -
> Insuficiente. (5) -> Suficiente. (6) -> Bien. (7 y 8) -> Notable. (9 y 10) -> Sobresaliente.
a) Utilizando una estructura if – else.
b) Utilizando una estructura switch. */
		
		Scanner scan = new Scanner(System.in);
			int nota = 0;
			
			
	System.out.println("Introduzca una nota entera:");
		nota = scan.nextInt();
	
	//Uso de case	
	switch(nota) {
	case 1: 
		System.out.println("Insuficiente.");
	break;
	
	case 2: 
		System.out.println("Insuficiente.");
	break;
	
	case 3:
		System.out.println("Insuficiente.");
	break;	
	
	case 4: 
		System.out.println("Insuficiente.");
	break;
	
	case 5:
		System.out.println("Suficiente.");
	break;
	
	case 6:
		System.out.println("Bien.");
	break;
	
	case 7:
		System.out.println("Notable.");
	break;
	
	case 8:
		System.out.println("Notable.");
	break;
	
	case 9:
		System.out.println("Sobresaliente.");
	break;
	
	case 10:
		System.out.println("Sobresaliente.");
	}
		
	//Uso de if
	if(nota > 0 && nota <=4) {
		System.out.println("Insuficiente.");
	} 
	
	if(nota == 5) {
		System.out.println("Suficiente.");
	}
	
	if(nota == 6) {
		System.out.println("Bien.");
	}
		
	if(nota > 6 && nota <= 8) {
		System.out.println("Notable.");
	}
	
	if(nota >= 9 && nota <= 10) {
		System.out.println("Sobresaliente.");
	}
		
		
		
		
		
		
		
		
	}

}
