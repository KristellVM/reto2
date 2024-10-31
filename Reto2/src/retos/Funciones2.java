package retos;

import java.util.Scanner;

import util.Funciones;

public class Funciones2 {
	
	public static void menuTemperatura(Scanner sc) {
		int opcion=0;
		do{
			System.out.println("Selecciona la conversión de Temperatura:");
			System.out.println("1. Celsius a Fahrenheit");
			System.out.println("2. Fahrenheit a Celsius");
			System.out.println("0. Salir");
			opcion = Funciones.dimeEntero("Elige opción: 1, 2, 0",sc);
			switch(opcion) {
			case 1:
				double Farenheit = celsiusAFahrenheit(Funciones.dimeDouble("Dime la temperatura en Celsius",sc));
				System.out.println("La temperatura que ingresaste en Fahrenheit es: "+Farenheit);
				break;
			case 2:
				double Celsius = fahrenheitACelsius(Funciones.dimeDouble("Dime la temperatura en Farenheit",sc));
				System.out.println("La temperatura que ingresaste en Celsius es: "+Celsius);
				break;
			}
		} while(opcion!=0);
	}
	
	public static void menuVolumen(Scanner sc) {
		int opcion=0;
		do{
			System.out.println("Selecciona la conversión de Volumen:");
			System.out.println("1. Litros a Galones");
			System.out.println("2. Galones a Litros");
			System.out.println("0. Salir");
			opcion = Funciones.dimeEntero("Elige opción: 1, 2, 0",sc);
			switch(opcion) {
			case 1:
				double Galones = litrosAGalones(Funciones.dimeDouble("Dime el volumne en Litros",sc));
				System.out.println("El volumen que ingresaste en Galones es: "+Galones);
				break;
			case 2:
				double Litros = galonesALitros(Funciones.dimeDouble("Dime el volumen en Galones",sc));
				System.out.println("El volumen que ingresaste en Litros es: "+Litros);
				break;
			}
		} while(opcion!=0);
	}
	
	
	
	public static double celsiusAFahrenheit(double num) {
		return (num*9/5)+32;
	}
	
	public static double fahrenheitACelsius(double num) {
		return (num-32)*5/9;
	}
	
	public static double litrosAGalones(double num) {
		return num*0.264172;
	}
	
	public static double galonesALitros(double num) {
		return num/3.785;
	}
}
	