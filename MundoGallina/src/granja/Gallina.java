package granja;
import java.util.Date;
//import java.util.ArrayList;

public class Gallina 
{
	String nombre;
	Date fechaNac;
	double numHuevos;
	double agua;
	double pienso;
	
	
	
	public Gallina(String nom, Date fecha)
	{
		//nace la gallina, por tanto tiene nombre y fecha. El resto de atributos no tienen valor puesto que no ha comido ni bebido.
		this.nombre = nom;
		this.fechaNac = fecha;
		this.numHuevos = 0;
		this.agua = 0;
		this.pienso=0;
	
		
		
		
	}

	public void setHuevos(double num)
	{
		this.numHuevos+= num;
	}
	
	public void setNombre (String nom)
	{
		this.nombre = nom;
	}
	public void setFechaNac (Date fecha)
	{
		this.fechaNac = fecha;
	}
	public void setAgua (double unidades)
	{
		this.agua += unidades;
	}
	public void setPienso (double unidades)
	{
		
		this.pienso += unidades;
		
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	public Date getFechaNac()
	{
		return this.fechaNac;
	}
	public double getNumHuevos()
	{
		return this.numHuevos;
	}
	public double getAgua()
	{
		return this.agua;
	}
	public double getPienso()
	{
		return this.pienso;
	}
	
	
	public void imprimirGallina()
	{
		TrabajoConFechas t = new TrabajoConFechas();
		
		System.out.println("Yo soy la gallina "+this.nombre);
		System.out.println("Naci en la fecha: "+ t.obtenerFecha(this.fechaNac));
		System.out.println("He puesto "+ this.numHuevos + " huevos" );
		System.out.println("He bebido "+ this.agua + " litros de agua");
		System.out.println("He comido "+ this.pienso+ " kilos de comida");
	}


	
	 
	
}
