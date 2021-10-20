package com.liceolapaz.des.gaf;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Pedimos al usuario el n�mero a buscar
		pedirNumero();
		// Leemos el n�mero y lo almacenamos
		int numeroBuscar = leerNumero();
		// Pedimos al usuario el n�mero m�ximo de intentos
		pedirNumeroMaximo();
		// Leemos el n�mero m�ximo de intentos y lo almacenamos
		int maximoIntentos = leerNumeroMaximo();
		int intentos = 0;
		while (intentos < maximoIntentos) {
			// General n�mero aleatorio
			int numeroAleatorio = generarNumeroAleatorio(1,10);
			System.out.println("El n�mero generado fue "+ numeroAleatorio);
			// Sumar 1 a los intentos
			intentos++;
			// Comprobar si el n�mero generado es igual al n�mero a buscar
			comprobarNumero(numeroBuscar,numeroAleatorio,intentos, maximoIntentos);
			// Si lo es, imprimir mensaje, si no lo es y hay m�s intentos, har�a que repetirlo
			if (numeroAleatorio == numeroBuscar) {
				break;
			}
		}
	}

	private static void comprobarNumero(int numeroBuscar, int numeroAleatorio, int intentos, int maximoIntentos) {
		if (numeroBuscar == numeroAleatorio) {
			System.out.println("N�mero encontrado en " + intentos + " intento(s).");
		} else if (intentos < maximoIntentos) {
			return;
		} else {
			System.out.println("No se ha podido encontrar su n�mero.");
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
		System.out.print("Por favor escriba el n�mero m�ximo de intentos: ");
	}
	
	private static int leerNumero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirNumero() {
		System.out.print("Por favor escriba su n�mero entre 1 y 10: ");
	}

}
