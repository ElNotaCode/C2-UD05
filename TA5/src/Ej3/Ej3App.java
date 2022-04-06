package Ej3;

import javax.swing.JOptionPane;

//Autor Eloi Martorell Martin 06/04/2022

public class Ej3App {

	public static void main(String[] args) {

		//3
		String nombre = new String();
				
		nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
		System.out.println("Bienvenido " + nombre + "!");

	}

}
