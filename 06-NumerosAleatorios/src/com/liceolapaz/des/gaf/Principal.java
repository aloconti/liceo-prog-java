package com.liceolapaz.des.gaf;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Pedimos al usuario el número a buscar
		pedirNumero();
		// Leemos el número y lo almacenamos
		int numeroBuscar = leerNumero();
		// Pedimos al usuario el número máximo de intentos
		pedirNumeroMaximo();
		// Leemos el número máximo de intentos y lo almacenamos
		int maximoIntentos = leerNumeroMaximo();
		int intentos = 0;
		while (intentos < maximoIntentos) {
			// General número aleatorio
			int numeroAleatorio = generarNumeroAleatorio(1,10);
			System.out.println("El número generado fue "+ numeroAleatorio);
			// Sumar 1 a los intentos
			intentos++;
			// Comprobar si el número generado es igual al número a buscar
			comprobarNumero(numeroBuscar,numeroAleatorio,intentos, maximoIntentos);
			// Si lo es, imprimir mensaje, si no lo es y hay más intentos, haría que repetirlo
			if (numeroAleatorio == numeroBuscar) {
				break;
			}
		}
	}

	private static void comprobarNumero(int numeroBuscar, int numeroAleatorio, int intentos, int maximoIntentos) {
		if (numeroBuscar == numeroAleatorio) {
			System.out.println("Número encontrado en " + intentos + " intento(s).");
		} else if (intentos < maximoIntentos) {
			return;
		} else {
			System.out.println("No se ha podido encontrar su número.");
		}
	}

	private static int generarNumeroAleatorio(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min)+min;
	}

	private static int leerNumeroMaximo() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirNumeroMaximo() {
		System.out.print("Por favor escriba el número máximo de intentos: ");
	}
	
	private static int leerNumero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirNumero() {
		System.out.print("Por favor escriba su número entre 1 y 10: ");
	}

}
