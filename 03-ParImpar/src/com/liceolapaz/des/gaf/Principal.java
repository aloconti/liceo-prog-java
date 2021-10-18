package com.liceolapaz.des.gaf;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Pedir el n�mero al usuario
		pedirNumero();
		// Leer y guardar el n�mero
		int numero = leerNumero();
		// Escribir si el n�mero es par o impar
		recibirNumero(numero);
	}

	private static void recibirNumero(int numero) {
		String par = numero % 2 == 0 ? "par." : "impar.";
		System.out.println("Este n�mero es "+ par);
	}

	private static int leerNumero() {
		Scanner escanner = new Scanner(System.in);
		return escanner.nextInt();
	}

	private static void pedirNumero() {
		System.out.print("Escriba aqu� un n�mero entero: ");
	}

}
