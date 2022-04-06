package Ej5;

import java.util.Scanner;

//Autor Eloi Martorell Martin 06/04/2022

public class Ej5App {

	public static void main(String[] args) {
		//5
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Introduce un numero:");
		double numero = sc.nextDouble();
				
				
		if( numero%2 == 0) {
			System.out.println("El numero es divisible entre 2");
		}else {
			System.out.println("El numero no es divisible entre 2");
		}
				
		sc.close();

	}

}
