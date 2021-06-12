package br.com.qm.be.piloto;

import java.sql.SQLException;
import java.util.List;

import br.com.qm.be.piloto.dao.PilotoDAO;
import br.com.qm.be.piloto.pojo.Piloto;

public class ExemploJDBC {

	public static void main(String[] args) throws SQLException {
		
		System.out.println("Inserção de piloto!");
		PilotoDAO pilotoDao = new PilotoDAO();
		
		Piloto pilotoExemplo = new Piloto("Caio", 1, 856.4F, 3, 10000F);
		//pilotoDao.inserePiloto(pilotoExemplo);
		
		
		List<Piloto> pilotos = pilotoDao.listaPilotos();
		
		for (Piloto piloto : pilotos) {
			
			System.out.println(piloto);
			
		}
		
		pilotoDao.removePiloto(1);
		
		pilotos = pilotoDao.listaPilotos();
		
		for (Piloto piloto : pilotos) {
			
			System.out.println(piloto);
		
		}
		
	}
	
}
