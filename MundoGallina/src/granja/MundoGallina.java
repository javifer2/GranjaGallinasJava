package granja;
public class MundoGallina {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//creacion de la primera gallina
		Gallinero g = new Gallinero();
		
		int num = 0;
		int i=0;
		do{
			num=recogeSolicitud();
			switch (num)
			{
			case 0:
				break;
			case 1:
				g.darVidaGallina();
				break;
			case 2:
				i = recogeSolicitudParaGallina();
				g.alimentarGallina(i);
				break;
			case 3:
				i = recogeSolicitudParaGallina();
				g.darAgua(i);
				break;
			case 4:
				i = recogeSolicitudParaGallina();
				g.ponerHuevos(i);
				break;
			case 5:
				g.ordenarPorConsumoAlimento();
				break;
			case 6:
				g.ordenarPorConsumoAgua();
				break;
			case 7:
				g.ordenarPorPuestaHuevos();
				break;
			case 8:
				i = recogeSolicitudParaGallina();
				g.verGallina(i);
				break;
			case 9:
				
				g.verGallinas();
				break;
			}
			System.out.println("");
		}while (num>0);
	}
	
	private static int recogeSolicitud()
	{
		System.out.println("0.- Salir ");
		System.out.println("1.- Dar vida ");
		System.out.println("2.- Alimentar ");
		System.out.println("3.- Dar de beber ");
		System.out.println("4.- Poner huevos");
		System.out.println("5.- Ranking por alimentos");
		System.out.println("6.- Ranking por agua");
		System.out.println("7.- Ranking por huevos");
		System.out.println("8.- Ver gallina");
		System.out.println("9.- Ver gallinero");
		
		entradasConsola en = new entradasConsola();
		return en.entradaEntero();
	}
	
	private static int recogeSolicitudParaGallina()
	{
		entradasConsola en = new entradasConsola();
		System.out.println("Dime sobre cual operamos?");
		return en.entradaEntero();
	}
	

	
	 

}
