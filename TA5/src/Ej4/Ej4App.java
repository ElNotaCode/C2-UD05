package Ej4;

import java.util.Scanner;

//Autor Eloi Martorell Martin 06/04/2022

public class Ej4App {

	public static void main(String[] args) {
		//4
		System.out.println();
				
		//abrimos scanner
		Scanner sc = new Scanner(System.in);
				
		//declarar variables
		final double PI = 3.14;
		//double radio = sc.nextDouble(); se podría hacer así
		System.out.println("Introduce un numero para calcular el area:");
		String radio = new String(sc.next());
		double radioDouble = Double.parseDouble(radio);
				
		double area = PI * Math.pow(radioDouble, 2);
				
		System.out.println("Area:" + area);
		
		sc.close();
	}

}
