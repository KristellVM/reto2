package retos;

import java.util.Scanner;

import util.Funciones;

public class Funciones1 {

	public static void menu2(int numero, Scanner sc) {
	do {
		System.out.println("Selecciona la conversión de longitud");
		System.out.println("1. Millas a kilometros");
		System.out.println("2. Kilometros a millas");
		System.out.println("0. Salir");
		
		Funciones.dimeEntero("Elige opcion:\n1-opcion1\n2-opcion2\0-Salir", sc)
		switch (numero) {
		  case 1:
			  millasaKilometros(numero);
			  break;
		  case 2:
			  kilosaLibras(numero);
		    break;
		  case 0:
			  System.out.println("Has salido");
		    break;
		
		}
	}while(numero!=0);
	
	
	}

	
	public static void menu1(int numero, Scanner sc) {
		do {
			System.out.println("Selecciona la conversión de longitud");
			System.out.println("1. Millas a kilometros");
			System.out.println("2. Kilometros a millas");
			System.out.println("0. Salir");
			
			//Funciones.dimeEntero("Elige opcion:\n1-opcion1\n2-opcion2\0-Salir", sc)
			switch (numero) {
			  case 1:
				  librasaKilogramos(numero);
				  break;
			  case 2:
				  kilometrosaMillas(numero);
			    break;
			  case 0:
				  System.out.println("Has salido");
			    break;
			
			}
		}while(numero!=0);
		
		
		}}


	
	
	
	// Millas a km
	public static double millasaKilometros(double millas) { //si pulsa uno sale esto
		return millas * 1.69;

	}

	// Km a millas
	public static double kilometrosaMillas(double kilometros) {
		return kilometros / 1.69;

	}

	// libras a kilos
	public static double librasaKilogramos(double libras) {
		return libras / 2.205;

	}

	// kilos a libras
	public static double kilosaLibras(double kilogramos) {
		return kilogramos * 2.205;
	}
}




