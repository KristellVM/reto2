package retos;

import java.util.Scanner;

import util.Funciones;

public class Funciones1 {

	public static void menuLongitud(Scanner sc) {
		int opcion = 0;
		do {
			System.out.println("Selecciona la conversión de longitud");
			System.out.println("1. Millas a kilometros");
			System.out.println("2. Kilometros a millas");
			System.out.println("0. Salir");

			opcion = Funciones.dimeEntero("Elige opcion:\n1-opcion1\n2-opcion2\0-Salir", sc);
			switch (opcion) {
			case 1:
				double kilometros = millasaKilometros(Funciones.dimeDouble("dime las millas", sc));
				System.out.println("Los kilometros son " + kilometros);
				break;
			case 2:
				double millas = kilometrosaMillas(Funciones.dimeDouble("dime los kilometros", sc));
				System.out.println("Las millas son " + millas);
				break;

			}
		} while (opcion != 0);

	}

	public static void menuPeso(Scanner sc) {
		int opcion = 0;
		do {
			System.out.println("Selecciona la conversión de longitud");
			System.out.println("1. Libras a kilogramos");
			System.out.println("2. Kilogramos a libras");
			System.out.println("0. Salir");

			opcion = Funciones.dimeEntero("Elige opcion:\n1-opcion1\n2-opcion2\0-Salir", sc);
			switch (opcion) {
			case 1:
				double kilogramos = librasaKilogramos(Funciones.dimeDouble("dime las libras", sc));
				System.out.println("Los kilogramos son " + kilogramos);
				break;
			case 2:
				double libras = kilosaLibras(Funciones.dimeDouble("dime los kilogramos", sc));
				System.out.println("Las libras son " + libras);
				break;

			}
		} while (opcion != 0);

	}

	// Millas a km
	public static double millasaKilometros(double millas) { // si pulsa uno sale esto
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
