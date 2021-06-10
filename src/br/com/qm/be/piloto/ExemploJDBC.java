package br.com.qm.be.piloto;

import java.sql.SQLException;

import br.com.qm.be.piloto.dao.PilotoDAO;
import br.com.qm.be.piloto.pojo.Piloto;

public class ExemploJDBC {

	public static void main(String[] args) throws SQLException {
		
		System.out.println("Inserção de piloto!");
		PilotoDAO pilotoDao = new PilotoDAO();
		
		Piloto pilotoExemplo = new Piloto("João", 0, 345.6F, 2, 10000F);
		pilotoDao.inserePiloto(pilotoExemplo);
		
	}
	
}
