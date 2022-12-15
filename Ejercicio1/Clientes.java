package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;


public class Clientes {

	
	public static ArrayList<Clientes> clientesRegistrados = new ArrayList<>();
	
	private String nombre;
	private String apellido;
	private String documento;
	private String aprobado;
	
	
	
	//constructor	
	public Clientes(String nombre, String apellido, String aprobado, String documento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.aprobado = aprobado;
		this.documento = documento;
	}
	
	//getters and setters 
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String isAprobado() {
		return aprobado;
	}

	public void setAprobado(String aprobado) {
		this.aprobado = aprobado;
	}
	
	
	
	@Override
	public String toString() {
	    return "ID: " + documento +
	            " " + nombre +
	            " " + apellido +	           
	            " Resultado: " + aprobado +
	            "\n";
	}

	
	
	public static String registro (String nombre, String apellido, String aprobado, String documento) {
        
		Scanner datos = new Scanner (System.in);
		System.out.println("Ingrese nombre del cliente: ");
        nombre = datos.nextLine();
        System.out.println("Ingrese apellido del cliente: ");
        apellido = datos.nextLine();
        System.out.println("Ingrese documento del cliente: ");
        documento = datos.nextLine();
        
        
        if (clientesRegistrados.size() < 8) {
            Clientes cliente = new Clientes(nombre, apellido, aprobado, documento);
            clientesRegistrados.add(cliente);
            System.out.println ( "Se registró el cliente");
            return null;
        } else {
        	System.out.println ("Clientes maximos exedidos");
        	return null;       				             
    }
        
		
}	
	public static String consultarCurso () {
		ArrayList<Clientes> clientes = Clientes.clientesRegistrados;
	    System.out.println("Clientes Registrados en el curso: \n"+ clientes );	    
		return null;
} 
	
	public static String definirResultados (String nombre, String apellido, String aprobado, String documento) {
		
		
		Scanner datos = new Scanner (System.in);
		String documento2;
		System.out.println("Ingrese documento del cliente");
		documento2=datos.nextLine();
		Clientes a;
		
		for (int i = 0; i < clientesRegistrados.size(); i++) {
			
			 a= clientesRegistrados.get(i);
			int opcion;
			
		
			   if (documento2.equals(a.getDocumento())) {
				
				
		        System.out.println(a.nombre + " "+ a.apellido + " ¿aprobo el curso? \n"
		        		+" 1- Si \n"				
						+ "2- No");
				  opcion=datos.nextInt();
				  
				  if ( opcion == 1) {
					  
					  nombre= a.nombre;
					  apellido=a.apellido;
					  documento=a.documento;
					  aprobado= "Aprobado";
					  Clientes cliente = new Clientes(nombre, apellido, aprobado, documento);
					  clientesRegistrados.remove(i);
					  clientesRegistrados.add(cliente);
				  } else {
					  nombre= a.nombre;
					  apellido=a.apellido;
					  documento=a.documento;
					  aprobado= "Reprobado";
					  Clientes cliente = new Clientes(nombre, apellido, aprobado, documento);
					  clientesRegistrados.remove(i);
					  clientesRegistrados.add(cliente);
				  }
				   	
	}
		}return null;

	
		
	}

	
}
	

	

	
	
	
		
	

	
		
	
		
			
			
		
		
		
		
		
		
		
		



	
	


    


	



	    
	
	

