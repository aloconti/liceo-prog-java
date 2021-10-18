package com.liceolapaz.des.gaf;

import java.util.Scanner;

public class Principal {

	private static final int ANO_ACTUAL = 2021;
	
	public static void main(String[] args) {
		// Pedir a�o de nacimiento
		pedirAno();
		// Leer a�o y almacenarlo
		int Ano = leerAno();
		// Escribir mensaje
		escribirMensaje(Ano);
	}

	private static void escribirMensaje(int ano) {
		String mensaje = "";
		
		if (ano > ANO_ACTUAL) {
			mensaje = "A�o no v�lido.";
		} else if (ANO_ACTUAL - ano >= 18 && ANO_ACTUAL - ano < 150) {
			mensaje = "Puedes pasar.";
		}else {
			mensaje = "No puede pasar.";
		}
		
		System.out.println(mensaje);
	}

	private static int leerAno() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirAno() {
		System.out.print("Introduzca su a�o de nacimiento: ");
	}

}
