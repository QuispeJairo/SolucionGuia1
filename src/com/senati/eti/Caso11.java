package com.senati.eti;

import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		String nombre = sc.nextLine(); // Creo un objeto de tipo String
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("N�mero de caracteres.....: " + nombre.length());

	}

}
