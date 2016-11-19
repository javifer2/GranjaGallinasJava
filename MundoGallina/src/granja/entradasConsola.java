package granja;
import java.util.Scanner;
import java.util.Date;
public class entradasConsola {
	Scanner sc ;
	public entradasConsola()
	{
		sc = new Scanner(System.in);
	}
	
	public int entradaEntero()
	{
		return this.sc.nextInt();
		
	}
	
	public String entradaString()
	{
		
		return this.sc.next();
		
	}
	
	
	
	public double entradaDouble()
	{
		return this.sc.nextDouble();
	}
	

}
