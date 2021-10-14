package com.liceolapaz.des.gaf;

import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
		// Pedirle el nombre al usuario
		pedirNombre();
		// Recibir el nombre
		String nombreUsuario = leerNombre();
		// Almacenarlo en memoria
		escribirSaludo(nombreUsuario);
		// Escribir el mensaje
		
	}

	private static void escribirSaludo(String nombreUsuario) {
		System.out.println("Hola " + nombreUsuario + "!");
	}

	private static String leerNombre() {
		Scanner escaner = new Scanner (System.in);
		return escaner.nextLine();
	}

	private static void pedirNombre() {
		System.out.print("Escriba su nombre: ");
		
	}
}
