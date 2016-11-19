package granja;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public  class TrabajoConFechas {

	public TrabajoConFechas()
	{
		
	}
	public  String obtenerFecha(Date fecha)
	{
		
		SimpleDateFormat formateador = new SimpleDateFormat(
				   "dd 'de' MMMM 'de' yyyy", new Locale("ES"));
		
		return  formateador.format(fecha);
			   
	}
}
