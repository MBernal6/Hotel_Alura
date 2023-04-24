package Factory;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConexionBase {

	private DataSource datasour;
	
	public ConexionBase() {
		var poolDataSource = new ComboPooledDataSource();
	
		poolDataSource.setJdbcUrl("jdbc:mysql://localhost/hotel_alura?useTimeZone=true&serverTimeZone=UTC");
		poolDataSource.setUser("root");
		poolDataSource.setPassword("root123456$");
		poolDataSource.setMaxPoolSize(20);
		
		this.datasour = poolDataSource;

	}
	
	public Connection conectarBase() {
		try {
			return this.datasour.getConnection();
		}catch (SQLException e) {
			System.out.println("Se detecto un Error");
			throw new RuntimeException(e);
		}
	}
}
