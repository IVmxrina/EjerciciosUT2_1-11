package Paquete_ejercicios;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Ejercicio 3.22.-
Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el
árbol más alto. Para ello se introducirá por teclado la altura (en centímetros) de cada árbol
(terminando la introducción de datos cuando se utilice -1 como altura). Los árboles se
identifican mediante etiquetas con números únicos correlativos, comenzando en 0. Diseñar
una aplicación que resuelva el problema planteado. */
	
	Scanner scan = new Scanner(System.in);
		double altura = 0.0;
		double alturaX = 0.0;
		int etiqueta = 0;
		double suma = 0.0;
		
	do {
		System.out.println("Introduzca la altura del arbol: (la introduccion de datos acabara cuando se introduzca -1).");
		altura = scan.nextDouble();
		
		while(etiqueta == 0) {
			alturaX = altura;
			etiqueta++;
		}
			if(altura > alturaX) {
				alturaX = altura;
			}
				if(altura != -1) {
					etiqueta++;
			}
	}while(altura != -1);
	
	System.out.println("La altura del mayor arbol es " + alturaX + " cm, y su etiqueta es " + etiqueta + ".");
	
		
//como puedo crear un algoritmo que guarde alturas y las compare para saber cual es la mayor.		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
