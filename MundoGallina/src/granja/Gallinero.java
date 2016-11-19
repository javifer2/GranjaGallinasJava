package granja;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Collections;
import java.util.Iterator;

public class Gallinero {
	ArrayList<Gallina> gallinero; 
	
	public Gallinero ()
	{
		gallinero = new ArrayList<Gallina>();
	}
	
	public void darVidaGallina()
	{
		entradasConsola en = new entradasConsola();
		System.out.println("¿Como llamamos a la nueva Gallina?");
		String nom = en.entradaString();

		Date fecha = recogerFecha();
		Gallina g = new Gallina(nom,fecha);
		gallinero.add(g);
	}
	
	public void ponerHuevos(int id)
	{
		if (id>gallinero.size()) return;
		
		entradasConsola en = new entradasConsola();
		System.out.println("¿Cuantos huevos ha puesto?");
		double racion = en.entradaDouble();
		
		Gallina g = gallinero.get(id-1);
		g.setHuevos(racion);
		gallinero.set(id-1,g);
	}
	
	public void alimentarGallina(int id)
	{
		if (id>gallinero.size()) return;
		
		entradasConsola en = new entradasConsola();
		System.out.println("¿Que ración de pienso le das?");
		double racion = en.entradaDouble();
		
		Gallina g = gallinero.get(id-1);
		g.setAgua(racion);
		gallinero.set(id-1,g);
			
		
	}
	
	public void darAgua(int id)
	{
		if (id>gallinero.size()) return;
		
		entradasConsola en = new entradasConsola();
		System.out.println("¿Que ración de agua le das ahora?");
		double racion = en.entradaDouble();
		Gallina g = gallinero.get(id-1);
		g.setAgua(racion);
		gallinero.set(id-1,g);
	}
	
	public void verGallinas()
	{
		for (Gallina g : gallinero)  
		      g.imprimirGallina();  
	}
	
	private void imprimirRanking() {
		Iterator<Gallina> iterador = gallinero.iterator();
		int posicion = 1;
		while (iterador.hasNext()) {
			System.out.println("Posicion(" + posicion + ") = " + iterador.next().toString());
			posicion++;
		}
	}
	
	public void ordenarPorConsumoAlimento()
	{
		Collections.sort(gallinero, new Comparator<Gallina>() 
		{
			@Override
			public int compare(Gallina g1, Gallina g2) {
				return new Double(g1.getPienso()).compareTo(new Double(g2.getPienso()));
			}
		});	
	}
	public void ordenarPorConsumoAgua()
	{
		Collections.sort(gallinero, new Comparator<Gallina>() 
		{
			@Override
			public int compare(Gallina g1, Gallina g2) {
				return new Double(g1.getAgua()).compareTo(new Double(g2.getAgua()));
			}
		});	
	}
	
	public void ordenarPorPuestaHuevos()
	{
		Collections.sort(gallinero, new Comparator<Gallina>() 
		{
			@Override
			public int compare(Gallina g1, Gallina g2) {
				return new Double(g1.getNumHuevos()).compareTo(new Double(g2.getNumHuevos()));
			}
		});	
	}
	
	
	
	public void verGallina(int id)
	{
		if (id>gallinero.size()) return;
		
		Gallina g = gallinero.get(id);
		g.imprimirGallina();
	}
	
		
	private Date recogerFecha()
	{
		java.util.Date fecha = new java.util.Date();
		return fecha;
	
	}



	
	
}
