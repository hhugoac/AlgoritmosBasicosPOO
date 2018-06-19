package com.ejerciciosoop.misclases;
import java.util.Date;

public class Mascota {
	private String id;
	private String nombre;
	private String especie;
	private Date fechaIngreso;
	private Date fechaSalida;
	private String estado; 
	
	public Mascota()
	{
		
	}
	
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public String getnombre()
	{
		return nombre;
	}
	public void setnombre(String nombre)
	{
		this.nombre=nombre;
	}
	public void setespecie(String especie)
	{
		this.especie=especie;
	}
	public String getespecie(String especie)
	{
		return especie;
	}
	public void setfechaIngreso(Date fechaIngreso)
	{
		this.fechaIngreso=fechaIngreso;
	}
	public Date getfechaIngreso()
	{
		return fechaIngreso;
	}
	public void setfechaSalida(Date fechaSalida)
	{
		this.fechaSalida=fechaSalida;
	}
	public String getestado()
	{
		return estado;
	}
	public void setestado(String estado)
	{
		this.estado=estado;
	}
}
