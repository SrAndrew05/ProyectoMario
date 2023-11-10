package Prueba.ProyectoA.src;

import java.util.Scanner;

public class HolaPersonas {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner src=new Scanner(System.in);
		String nombre;
		
		System.out.println(" Dame tu nombre: ");
		
		nombre=src.next();
		
		System.out.println("Bienvenido "+ nombre);
		
	}

}
