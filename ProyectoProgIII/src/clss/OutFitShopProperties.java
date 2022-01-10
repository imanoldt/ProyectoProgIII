package clss;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class OutFitShopProperties {

	private static String dDriver;
	private static String URI;

	public static void main(String[] args) {
		Properties p = new Properties();

		dDriver = "sqlite-jdbc-3.32.3.2.jar";
		p.setProperty("DriverBBDD", dDriver);
		URI = "/ProyectoProgIII/Clientes.db";
		p.setProperty("PathBBDD", URI);
		p.setProperty("NombreProyecto", "OutFitShop");
		p.setProperty("UsuarioAdmin", "admin");
		p.setProperty("ContraseñaAdmin", "admin");

		try {
			p.store(new FileWriter("OutFitShopProperties.properties"), "OutFitShopProperties");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
