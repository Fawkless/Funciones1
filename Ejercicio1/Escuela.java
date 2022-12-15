package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Escuela {

	public static void main(String[] args) {
		
		int opcion;
		
		Scanner datos = new Scanner(System.in);
		
		do {
		
		System.out.println("\nElija una opcion: \n" + "\n1- Registrar cliente \n" + "2- Consultar cursos \n" + "3- Definir resultados \n" + "4- Salir \n");
		opcion = datos.nextInt();
				
			switch (opcion) {
		
		case 1:
			 Clientes.registro(null, null, null, null);    			
			break;
			
		case 2:
			Clientes.consultarCurso();
			break;
			
		case 3:
			Clientes.definirResultados(null, null, null, null);
			break;
		
		
			
			}
			
			
			} while (opcion !=4);
	}
}

	
		


		




