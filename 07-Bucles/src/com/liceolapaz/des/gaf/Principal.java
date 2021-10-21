package com.liceolapaz.des.gaf;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Pedir n�meros al usuario
		pedirNumeros();
		// Crear variable para almacenar n�meros
		int[] numeros = new int[10];
		// Leer n�meros
		int contador = 0;
		do {
			numeros[contador] = leerNumero();
			contador ++;
		} while (contador < 10);
		// Calcular suma y almacenarla
		int sumaTotal = calcularSuma(numeros);
		// Escribir el resultado
		System.out.println("La suma de los n�meros es: "+sumaTotal);
	}

	private static int calcularSuma(int[] numeros) {
		int total = 0;
		
		for (int i = 0; i < numeros.length; i++) {
		total += numeros[i];	
		}
		return total;
	}

	private static int leerNumero() {
		Scanner escaner = new Scanner(System.in);
		
		return escaner.nextInt();
	}

	private static void pedirNumeros() {
		System.out.println("Escriba 10 n�meros enteros: ");
	}

}
