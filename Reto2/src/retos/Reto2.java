package retos;

import java.util.Scanner;

import util.Funciones;

public class Reto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		do{
			System.out.println("Selecciona el tipo de conversión:");
			System.out.println("1. Longitud");
			System.out.println("2. Peso");
			System.out.println("3. Temperatura");
			System.out.println("4. Volumen");
			System.out.println("0. Salir");
			opcion = Funciones.dimeEntero("Elige la opción: 1,2,3,4,0",sc);
			switch(opcion) {
			 case 1:
				Funciones1.menuLongitud(sc);
				break;
			case 2:
				Funciones1.menuPeso(sc);
				break;
			case 3:
				Funciones2.menuTemperatura(sc);
				break;
			case 4:
				Funciones2.menuVolumen(sc);
				break;
			}
		}while(opcion!=0);

	}

}
