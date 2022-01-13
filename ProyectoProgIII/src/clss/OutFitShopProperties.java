package clss;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class OutFitShopProperties {

	private static String dDriver,URI,lib,lib1;


	public static void main(String[] args) {
		Properties p = new Properties();

		dDriver = "sqlite-jdbc-3.32.3.2.jar";
		p.setProperty("DriverBBDD:", dDriver);
		
		URI = "/ProyectoProgIII/Clientes.db";
		p.setProperty("PathBBDD", URI);
		
		lib= "jcalendar-1.4.jar";
		lib1= "miglayout15-swing.jar";

		
		p.setProperty("LibreriaJCalendar", lib);
		p.setProperty("LibreriaMigLayout", lib1);

		
		p.setProperty("NombreProyecto", "OutFitShop");

		p.setProperty("UsuarioAdmin", "admin");
		
		p.setProperty("ContraseñaAdmin", "admin");
		
		p.setProperty("PathImg", "/ProyectoProgIII/src/img");
		
		p.setProperty("PathAvt", "/ProyectoProgIII/src/img/avt");
		
		p.setProperty("PathAvt", "/ProyectoProgIII/src/img/avt");
		
		p.setProperty("PathCamiseta", "/ProyectoProgIII/src/img/camisetas");
		
		p.setProperty("PathPantalones", "/ProyectoProgIII/src/img/camisetas");
		
		p.setProperty("PathSudaderas", "/ProyectoProgIII/src/img/sudaderas");

		try {
			p.store(new FileWriter("OutFitShopProperties.properties"), "OutFitShopProperties");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
