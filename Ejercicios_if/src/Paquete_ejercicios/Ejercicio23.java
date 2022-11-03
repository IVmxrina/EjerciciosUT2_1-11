package Ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Ejercicio 3.23.-
Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El jugador tendrá
que introducir la solución de la suma de dos números aleatorios comprendidos entre 1 y 100.
Mientras la solución introducida sea correcta, el juego continuará. En caso contrario, el
programa terminará y mostrará el número de operaciones realizadas correctamente */
		
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
		int num1 = rand.nextInt(100);
		int num2 = rand.nextInt(100);
		int suma = 0;
		int solucion = 0;
		int contador = 0;
		
			suma = num1 + num2;
	System.out.println("Los numeros a sumar son:" + num1 + " y " + num2 + ". Realiza la operacion.");	
		solucion = scan.nextInt();
		
	do {
		System.out.println("Correcto! Siguiente pregunta:");
		num1 = rand.nextInt(100);
		num2 = rand.nextInt(100);
			suma = num1 + num2;
		System.out.println("Los numeros a sumar son:" + num1 + " y " + num2 + ". Realiza la operacion.");	
			solucion = scan.nextInt();
			contador++;
	}while(solucion == suma);
		
	if(solucion != suma) {
		System.out.println("Lo siento, has fallado. Vuelve a intentarlo. Has acertado " + contador + " veces.");
	}
		
		
		
		
		
		
		
	}

}
