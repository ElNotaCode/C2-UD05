package Ej11;

import java.util.Scanner;

//Autor Eloi Martorell Martin 06/04/2022

public class Ej11App {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que día es hoy?");
		String dia = new String(sc.next());
		
		switch (dia.toUpperCase()) {
			case "LUNES" :
				System.out.println("Hoy es día laborable.");
				break;
			case "MARTES" :
				System.out.println("Hoy es día laborable.");
				break;
			case "MIERCOLES" :
				System.out.println("Hoy es día laborable.");
				break;
			case "JUEVES" :
				System.out.println("Hoy es día laborable.");
				break;
			case "VIERNES" :
				System.out.println("Hoy es día laborable.");
				break;
			case "SABADO" :
				System.out.println("Hoy es día no laborable.");
				break;
			case "DOMINGO" :
				System.out.println("Hoy es día no laborable.");
				break;
			default:
				System.out.println("No has introducido un día correcto.");
		
		}
		
		sc.close();
		
	}

}
