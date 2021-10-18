package com.liceolapaz.des.gaf;

import java.util.Scanner;

public class Principal {

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
		
		if (ano > 2021) {
			mensaje = "A�o no v�lido.";
		} else if (2021 - ano >= 18 && 2021 - ano < 150) {
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
