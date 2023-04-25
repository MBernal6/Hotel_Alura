package Controller;

import java.sql.Connection;

import DAO.ReservaDAO;
import Factory.ConexionBase;
import Modelo.Reserva;

public class ReservasController {

	private ReservaDAO reservaD;

	public ReservasController() {
		Connection con = new ConexionBase().conectarBase();
		this.reservaD = new ReservaDAO(con); 
		
	} 
	public void guardar(Reserva reserva) {
		this.reservaD.guardar(reserva);
	}
	
	
}
