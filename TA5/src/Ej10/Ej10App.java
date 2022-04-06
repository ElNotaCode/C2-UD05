package Ej10;

import java.util.Scanner;

//Autor Eloi Martorell Martin 06/04/2022

public class Ej10App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//variables
		int numeroVentas;
		int valorTotal = 0;
		
		System.out.println("Numero de ventas: ");
		numeroVentas = sc.nextInt();
		
		for (int i = 0; i < numeroVentas; i++) {
			
			//voy a provar la var a nivel de blaque de código
			int valor;
			
			System.out.println("Introduce el precio el producto numero " + (i+1));
			valor = sc.nextInt();
			valorTotal += valor;
			System.out.println(); //espacio
		}
		
		//System.out.println(valor); en efecto, la variable solo existe dentro del for
		System.out.println("El valor total de los productos es: " + valorTotal);
		
		sc.close();
	}

}
