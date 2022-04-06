package Ej13;

import java.util.Scanner;

//Autor Eloi Martorell Martin 06/04/2022

public class Ej13App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero int: ");
		int x = sc.nextInt();
		System.out.println("Seleccione una operación: ");
		char c = sc.next().charAt(0);
		System.out.println("Introduce otro numero int: ");
		int y = sc.nextInt();
		System.out.println();
		
		switch(c) {
			case '+':
				System.out.println(x+y);
				break;
			case '-':
				System.out.println(x-y);
				break;
			case '*':
				System.out.println(x*y);
				break;
			case '/':
				System.out.println(x/y);
				break;
			case '^':
				System.out.println(Math.pow(x,y));
				break;
			case '%':
				System.out.println(x%y);
				break;
			default:
				System.out.println("Operación no disponible.");
		}
		
		sc.close();
	}

}
