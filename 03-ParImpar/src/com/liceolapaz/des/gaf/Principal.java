package com.liceolapaz.des.gaf;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Pedir el número al usuario
		pedirNumero();
		// Leer y guardar el número
		int numero = leerNumero();
		// Escribir si el número es par o impar
		recibirNumero(numero);
	}

	private static void recibirNumero(int numero) {
		String par = numero % 2 == 0 ? "par." : "impar.";
		System.out.println("Este número es "+ par);
	}

	private static int leerNumero() {
		Scanner escanner = new Scanner(System.in);
		return escanner.nextInt();
	}

	private static void pedirNumero() {
		System.out.print("Escriba aquí un número entero: ");
	}

}
