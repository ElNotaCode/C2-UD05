package Ej12;

import java.util.Scanner;

//Autor Eloi Martorell Martin 06/04/2022

public class Ej12App {

	public static void main(String[] args) {

		//declaramos variables
		int intentos = 3;
		String password = new String("1");
		Scanner sc = new Scanner(System.in);
		
		while(intentos > 0) {
			
			System.out.println("Escribe la contraseña, tienes " + intentos + " intentos:");
			
			String passwordIntroducida = new String(sc.next());
			if (passwordIntroducida.equals(password)) {
				System.out.println();//espacio
				System.out.println("¡Enhorabuena!");
				break;
			}else if(intentos == 1) {
				System.out.println("Intentos agotados.");
			}
			
			intentos--;
			
		}

		sc.close();
		
	}

}
