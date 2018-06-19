package com.algoritmos.main;
import com.ejerciciosoop.misclases.Mascota;
import com.ejerciciosoop.misclases.Felino;
import com.ejerciciosoop.misclases.GatoSalvaje;
import com.ejerciciosoop.misclases.GatoDomestico;

public class AppHerenciaMacotas {

	public static void main(String[] args) {
		Mascota objtMascota1=new Mascota();
		
		
		GatoSalvaje objGato1=new GatoSalvaje();
		GatoDomestico objGato2=new GatoDomestico();
		GatoDomestico objGato3=new GatoDomestico();
		GatoDomestico objGato4=new GatoDomestico();

		
		objGato1.setnombre("Gato Tom");
		objGato2.setnombre("Silvester");
		objGato3.setnombre("Miau");
		objGato4.setnombre("Luna");
		
		System.out.println("El nombre del gato es"+objGato1.getnombre());
		System.out.println("La edad maxima "+objGato2.EdadMaxima);
	}

}
