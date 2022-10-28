package Paquete_ejercicios;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Ejercicio 3.6- 
  a/ escribe un programa que solicite un numero entre 0 y 9999 y a continuacion muestre el numero escrito al reves.
  b/ Modifica el programa para que indique si el numero es capicua o no.*/
		
	Scanner scan = new Scanner(System.in);
		int num = 0;
		int mil = 0;
		int cen = 0;
		int dec = 0;
		int un = 0;
		
	System.out.println("Introduzca un numero entre 0 y 9.999:");
		num = scan.nextInt();
		
	while(num <0 || num >9999){
		System.out.println("Introduzca un numero entre 0 y 9.999:");
			num = scan.nextInt();
	}
	
		mil = num / 1000;
		
		cen = num - (mil * 1000);
		cen	= cen / 100;
		
		dec = (mil * 1000) + (cen * 100);
		dec = (num - dec) / 10;
		
		un = (mil * 1000) + (cen * 100) + (dec * 10);
		un = num - un;
	
	if(num >= 0 && num < 10) {
		System.out.println("Su numero del reves es: " + un);
	}
	
	if(num >=10 && num <= 99) {
		System.out.println("Su numero del reves es: " + un + dec);
			if(un == dec) {
				System.out.println("Su numero es capicua");
			}
	
	}
	
	if(num >=100 && num <= 999) {
		System.out.println("Su numero del reves es: " + un + dec + cen);
			if(un == dec && un == cen) {
				System.out.println("Su numero es capicua.");
			}
	}
	
	if(num >=1000 && num <=9999) {
		System.out.println("Su numero del reves es:" + un + dec + cen + mil);
			if(un == dec && dec == cen && mil == cen) {
				System.out.println("Su numero es capicua.");
			}
	}
		
	
	
	
	
	
	
	
	
	
		
		
		
	}

}
