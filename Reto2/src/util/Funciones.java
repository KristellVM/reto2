package util;

import java.util.Scanner;

public class Funciones {
	
	public static double celsiusAFahrenheit(double num) {
		return (num*9/5)+32;
	}
	
	public static boolean par(int num) {
		if(num%2==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void divisores(int num) {
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					System.out.print(i+" ");
				}
			}
		}
		System.out.println();
	} 
	
	public static int contarDivisores(int num) {
		int cont=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				cont++;
			}
		}
		return cont;
	}
	
	public static boolean divisible(int num1, int num2) {
		if(num1%num2==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean esPrimo(int num1) {
		int cont=0;
		for(int i=2;i<num1;i++) {
			if(num1%i==0) {
				cont++;
			} 
		}
		if(cont==0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static boolean esInt(String texto) {
		try {
			int n1 = Integer.parseInt(texto);
			return true;
		}
		catch (Exception ex){
			return false;
		}
}

	public static boolean esDouble(String texto) {
		try {
			int n2 = Integer.parseInt(texto);
			return true;
		}
		catch (Exception ex){
			return false;
		}
	}

	public static int dimeEntero(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String texto1 = sc.nextLine();
				int n3 = Integer.parseInt(texto1);
				return n3;
			}
			catch(Exception ex){
				System.out.println("Número no válido");
			}
		}while(true);
	}

	public static double dimeDouble(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String texto2 = sc.nextLine();
				double n4 = Double.parseDouble(texto2);
				return n4;
			}
			catch(Exception ex){
				System.out.println("Número no válido");
			}
		}while(true);
	
	}
	
	public static int multiplicar(int num1, int num2) {
		return num1*num2;
	}
	
	public static double dividir(int num1, int num2) {
		if(num1==0||num2==0) {
			return 0;
		}
		else return num1/num2;
	}
	
	
	public static boolean esPositivo(int num) {
		if(num>=0) {
		return true;
		} else {
			return false;
		}
	}
	
	public static boolean esNegativo(int num) {
		if(num<0) {
		return true;
		} else {
			return false;
		}
	}
}
