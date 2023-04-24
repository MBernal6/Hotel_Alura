package Factory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConexion {

	public static void main(String[] args) throws SQLException { 
		Connection con = new ConexionBase().conectarBase();
		
		System.out.println("Conexion Exitosa");
		
		con.close();
		
		System.out.println("Cierre Exitoso");
	}
}
