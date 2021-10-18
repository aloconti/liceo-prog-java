package com.liceolapaz.des.gaf;

import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
		// Escribir men�
		escribirMennu();
		//Pedir opci�n
		pedirOpcion();
		// Leer opci�n y almacenarla
		int opcion = leerOpcion();
		// Escribir mensaje por pantalla
		escribirMensaje(opcion);
	}

	private static void escribirMensaje(int opcion) {
		String mensaje = "";
		
		switch (opcion) {
		case 0: {
			System.exit(0);
			break;
		}
		case 1 :
			mensaje = "Opci�n 1 elegida";
			break;
		case 2 : 
			mensaje = "Opci�n 2 elegida";
			break;
		case 3 :
			mensaje = "Opci�n 3 elegida";
			break;
		default:
			break;
		}
		
		System.out.println(mensaje);
	}

	private static int leerOpcion() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opci�n: ");
	}

	private static void escribirMennu() {
		System.out.println("MENU PRINCIPAL\n"
				+ "1. Opci�n 1\n"
				+ "2. Opci�n 2\n"
				+ "3. Opci�n 3\n"
				+ "0. Salir");
		
	}
}
