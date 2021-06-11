package br.com.qm.be.cidade.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.qm.be.cidade.pojo.Cidade;
import br.com.qm.be.factory.ConnectionFactory;

public class CidadeDAO {

	private Connection conn;

	public CidadeDAO() {
		this.conn = new ConnectionFactory().getConnection();
	}
	
	public void insereCidade(Cidade cidade) throws SQLException {
		
		String sql = "INSERT INTO cidades.cidade"
				+ "(ddd, nome, nro_habitantes, renda_per_capita, capital, estado, nome_prefeito) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setInt(1, cidade.getDdd());
		stmt.setString(2, cidade.getNome());
		stmt.setInt(3, cidade.getNroHabitantes());
		stmt.setFloat(4, cidade.getRendaPerCapita());
		stmt.setBoolean(5, cidade.isCapital());
		stmt.setString(6, cidade.getEstado());
		stmt.setString(7, cidade.getNomePrefeito());
		
		stmt.execute();
		stmt.close();
	}
	
	public void removeCidade(int ddd) {
		
		
	}
	
}
