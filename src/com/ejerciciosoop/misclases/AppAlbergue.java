package com.ejerciciosoop.misclases;
import com.ejerciciosoop.misclases.Mascota;
import java.util.Scanner;
//subida a git
public class AppAlbergue {

	public static void main(String[] args) {
		 Mascota firulais=new Mascota();
		 Mascota objPerro2=new Mascota("2P2","Celeste","Pug","Obesa"); //Asignacion por constructor
		 Mascota objPerro3=new Mascota();
		 
		 Scanner entrada=new Scanner(System.in);
		 
		 //Asignacion por teclado
		 objPerro3.setId(entrada.next()); 
		 objPerro3.setnombre(entrada.next()); 
		 objPerro3.setraza(entrada.next()); 
		 objPerro3.setdescripcion(entrada.next()); 
		 		 
		 //Asignacion por set
		 firulais.setId("1P1");
		 firulais.setnombre("Firulais");
		 firulais.setraza("Labrador");
		 firulais.setdescripcion("Orejona");
		 
		 System.out.println("ID: "+firulais.getId());
		 System.out.println("Nombre: "+firulais.getnombre());
		 System.out.println("Raza: "+firulais.getraza());
		 System.out.println("Descripcion: "+firulais.getdescripcion());
		 
		 System.out.println("ID: "+objPerro2.getId());
		 System.out.println("Nombre: "+objPerro2.getnombre());
		 System.out.println("Raza: "+objPerro2.getraza());
		 System.out.println("Descripcion: "+objPerro2.getdescripcion());
		 
		 System.out.println("ID: "+objPerro3.getId());
		 System.out.println("Nombre: "+objPerro3.getnombre());
		 System.out.println("Raza: "+objPerro3.getraza());
		 System.out.println("Descripcion: "+objPerro3.getdescripcion());
	}

}
