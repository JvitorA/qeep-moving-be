package br.com.qm.be.piloto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.qm.be.piloto.factory.ConnectionFactory;
import br.com.qm.be.piloto.pojo.Piloto;

public class PilotoDAO {

	private Connection conn;

	public PilotoDAO() {
		this.conn = new ConnectionFactory().getConnection();
	}
	
	public boolean inserePiloto(Piloto piloto) throws SQLException {
		
		String sql = "INSERT INTO aeronaves.piloto"
				+ "(nome, matricula, horas_voo, num_aeronave, salario) "
				+ "VALUES (?, ?, ?, ?, ?)";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setString(1, piloto.getNome());
		stmt.setInt(2, piloto.getMatricula());
		stmt.setFloat(3, piloto.getHorasVoo());
		stmt.setInt(4, piloto.getNumAeronave());
		stmt.setFloat(5, piloto.getSalario());
		
		stmt.execute();
		stmt.close();

		return true;
	}
	
}
