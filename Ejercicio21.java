package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Ejercicio 3.21-
 * Codificar el juego el numero secreto, que consiste en acertar un numero entre 1 y 100 (generado aleatoriamente). Para ello se introduce por 
 * teclado una serie de numeros, para los que se indica "mayor" o  "menor", segun sea mayor o menos con respecto al numero  secerto. El proceso 
 * terminara cuando elusuario acierta o cuando ya no quiere continuar introduciendo -1. */
		
	Scanner scan = new Scanner(System.in);
	Random random = new Random();	
		int num = 0;
		int numX = (int)(Math.random() * 101);
		int decision = 1;
		
	System.out.println("Bienvenido al juego del numero secreto, para continuar, introduzca un numero entre 0 y 100.");
		num = scan.nextInt();
	while(num < 0 || num > 100) {
		System.out.println("Introduzca un numero entre 0 y 100.");
			num = scan.nextInt();
	}
	
	
	//INICIO ALGORITMO
	while(numX != num && num >= 0 && num <= 100) {
		
		if(num > numX) {
			System.out.println(num + " es mayor que ?.");
		} else if(num < numX) {
			System.out.println(num + " es menor que ?.");
		}//fin if 1	
		
	System.out.println("Desea continuar? 1 para si, 0 para no.");
		decision = scan.nextInt();
	
	if(decision == 0) {
		System.out.println("Fin de algoritmo. ");
		num = 666;
	}	
	if(decision == 1) {
		num = 666;
	System.out.println("Introduzca un numero ");
		num = scan.nextInt();
	}
	
	}//fin while 1
	
	if(num == numX) {
		System.out.println("Correcto! Numero acertado. El numero secreto es " + numX + ".");
	}
		
		
		
		
	}//[NO BORRAR]

}
