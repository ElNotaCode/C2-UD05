package Ej6;

import java.util.Scanner;

//Autor Eloi Martorell Martin 06/04/2022

public class Ej6App {

	public static void main(String[] args) {
		
		//scaner
		Scanner sc = new Scanner(System.in);
		//constante
		final double IVA = 0.21 ;
		
		System.out.println("Introduce el precio del producto:");
		double precioProducto = sc.nextDouble();
		
		//importante los parentesis, si no concatena como si fuera una frase
		System.out.println("Precio con IVA: " + (precioProducto + (precioProducto*IVA)));
		
		sc.close();

	}

}
