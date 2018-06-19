package com.algoritmos.main;
import com.ejerciciosoop.misclases.Libro;
import java.util.Scanner;

public class AppEjerciciosPOO {

	public static void main(String[] args) {
		
		char cPastaDura=' ';
		System.out.println("Hola mundo OOP");
		Libro objLibro1;
		Libro objLibro2;
		Libro objLibro3;
		objLibro1=new Libro();
		objLibro2=new Libro();
		objLibro3=new Libro();
		
		Scanner entrada=new Scanner(System.in);
		
		
		System.out.println(objLibro1.getClass());
		
		objLibro1.ISBN="101B";
		objLibro1.autor="El macho";
		objLibro1.noHojas=250;
		objLibro1.anio=1995;
		objLibro1.Titulo="La guerra de dis mundos";
		objLibro1.precio=200.0;
		objLibro1.isPastaDura=true;
		
		System.out.println("El libro "+objLibro3.Titulo+" con ISBN "+objLibro3.ISBN+" del autor "+objLibro3.autor+" con no. de hojas de "+objLibro3.noHojas+" del año "+objLibro3.anio+" tiene un precio de "+objLibro3.precio+ " tiene pasta dura "+objLibro3.isPastaDura);
		
		System.out.println("Introduce el titulo del libro");
		objLibro2.Titulo=entrada.nextLine();
		System.out.println("Introduce el ISBN");
		objLibro2.ISBN=entrada.nextLine();
		System.out.println("Introduce el año");
		objLibro2.anio=entrada.nextInt();
		System.out.println("Introduce el numero de hojas");
		objLibro2.noHojas=entrada.nextInt();
		System.out.println("Ingresar el precio");
		objLibro2.precio=entrada.nextDouble();
		System.out.println("Es pasta dura (s/n)");
		cPastaDura=entrada.next().charAt(0);
		if (cPastaDura=='S' || cPastaDura=='s')
			objLibro2.isPastaDura=true;
		else
			objLibro2.isPastaDura=false;
		
	}

		
		
}
