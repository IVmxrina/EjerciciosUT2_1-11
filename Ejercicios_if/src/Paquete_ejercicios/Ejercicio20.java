package Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Ejercicio 3.20-
 * Implementar una aplicacion para calcular datos estadistivcos de las edades de los alimnos de un centro educativo. se introduciran datos hasta
 * que uno de ellos sea negativo, y se mostrara la suma de todas las edades untroducidas, la media, el numero de alumnos y cuandos son mayores de 
 * edad.  */
	
	Scanner scan = new Scanner(System.in);
		String alumno = "0";
		int numAlumnos = 0;
		int edad = 0;
		int sumaedad = 0;
		int numEdades = 0;
		int mayorEdad = 0;
		
	System.out.println("Introduzca el nombre del alumno:");	
		alumno = scan.next();
		numAlumnos++;
	System.out.println("Introduzca la edad de dicho alumno:");
		edad = scan.nextInt();
		sumaedad = sumaedad + edad;
		numEdades++;
		if(edad >= 18)	{
		mayorEdad++;
		}//Fin if 1
		
		
	/* INICIO WHILE */	
	while(edad >= 0) {
		System.out.println("Introduzca el numero de alumno:");	
		alumno = scan.next();
		numAlumnos++;
		
	System.out.println("Introduzca la edad de dicho alumno:");
		edad = scan.nextInt();
		sumaedad = sumaedad + edad;
		numEdades++;
		if(edad >= 18)	{
		mayorEdad++;
		
		
		
		}//Fin if 2
			
		
	}//fin while

	if(edad < 0) {
		System.out.println("El numero de alumnos es " + numAlumnos + ".");
		System.out.println("La suma de todas las edades es " + sumaedad + ".");	
			edad = sumaedad / numEdades;
		System.out.println("La media entre todas las edades es " + edad + ".");
		System.out.println("El numero de alumnos mayores de edad es " + mayorEdad + ".");	
		
	}//fin if 3	
		
		
		
	}

}