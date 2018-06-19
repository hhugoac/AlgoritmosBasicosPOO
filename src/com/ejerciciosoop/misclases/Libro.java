package com.ejerciciosoop.misclases;

public class Libro {
	
	//Propiedades del Libro
	public String ISBN;
	public String Titulo;
	public String autor;
	public int anio;
	public int noHojas;
	public double precio;
	public boolean isPastaDura;
	
	
	//Metodos de Libro
	public Libro()
	{
		this.ISBN=" ";
		this.Titulo=" ";
		this.autor=" ";
		this.anio=0;
		this.noHojas=0;
		this.precio=0.0;
		this.isPastaDura=false;	
	}
	public Libro(String ISBN)
	{
		this.ISBN=ISBN;
	}
	
	public Libro(String ISBN, String Titulo)
	{
		this.ISBN=ISBN;
		this.Titulo=Titulo;		
	}
	
	public Libro(String ISBN, String Titulo, String autor)
	{
		this.ISBN=ISBN;
		this.Titulo=Titulo;
		this.autor=autor;
	}
	public Libro(String ISBN, String Titulo, String autor,int anio)
	{
		this.ISBN=ISBN;
		this.Titulo=Titulo;
		this.autor=autor;
		this.anio=anio;
	}
	public Libro(String ISBN, String Titulo, String autor,int anio,int noHojas)
	{
		this.ISBN=ISBN;
		this.Titulo=Titulo;
		this.autor=autor;
		this.anio=anio;
		this.noHojas=noHojas;
	}
	public Libro(String ISBN, String Titulo, String autor,int anio,int noHojas,double precio)
	{
		this.ISBN=ISBN;
		this.Titulo=Titulo;
		this.autor=autor;
		this.anio=anio;
		this.noHojas=noHojas;
		this.precio=precio;
	}
	public Libro(String ISBN, String Titulo, String autor,int anio,int noHojas,double precio,boolean isPastaDura)
	{
		this.ISBN=ISBN;
		this.Titulo=Titulo;
		this.autor=autor;
		this.anio=anio;
		this.noHojas=noHojas;
		this.precio=precio;
		this.isPastaDura=isPastaDura;		
	}
	
	public boolean prestarLibro()
	{
		return false;
	}
	public void agregarLibro()
	{
		
	}
	public void eliminarLibro()
	{
		
	}	
	public int contarLibros()
	{
		return 0;
	}
	public double verPrecio(String ISBN) //Paso de mensajes
	{
		return precio;
	}
}
