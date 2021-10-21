package com.liceolapaz.des.gaf;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		do {
			escribirMenu();
			
			int opcion = leerOpcion();
			if (opcion == 0) {
				System.exit(0);
			}else if (opcion != 1 && opcion != 2) {
				System.out.println("Opción no válida.");
				continue;
			}
			int MaximoNumero = opcion == 1?10:50;
			int MaximoIntentos = opcion == 1?3:5;
			int Intentos = 0;
			
			int NumeroAleatorio = generarNumeroAleatorio(MaximoNumero);
			
			do {
				Intentos++;
				pedirNumero();
				int numero = leerNumero();
				if (numero == NumeroAleatorio) {
					System.out.println("Ha adivinado el número generado en "+Intentos+" inteto(s).");
					break;
				}else {
					if (Intentos+1 > MaximoIntentos) {
						System.out.println("No ha acertado en el número máximo de intentos. El número correcto era "+NumeroAleatorio);
					}else {
						if (numero > NumeroAleatorio) {
							System.out.println("El número a adivinar es menor al que ha introducido.");
						} else {
							System.out.println("El número a adivinar es mayor al que ha introducido.");
						}
					};
				}
			}while (Intentos < MaximoIntentos);
		} while (true);
	}

	private static void pedirNumero() {
		System.out.print("Escriba el número que cree que se ha generado: ");
	}

	private static int leerNumero() {
		Scanner escaner = new Scanner(System.in);
		
		return escaner.nextInt();
	}

	private static int generarNumeroAleatorio(int maximoNumero) {
		Random numero = new Random();
		return numero.nextInt(maximoNumero - 1) + 1;
	}

	private static int leerOpcion() {
		Scanner escaner = new Scanner(System.in);
		
		return escaner.nextInt();
	}

	private static void escribirMenu() {
		System.out.println("MENU PRINCIPAL\n"
				+ "1. Del 1 al 10 (3 intentos)\n"
				+ "2. Del 1 al 50 (5 intentos)\n"
				+ "0. Salir");
		System.out.print("Escriba una opción: ");
	}

}
