package br.com.qm.be.piloto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.qm.be.factory.ConnectionFactory;
import br.com.qm.be.piloto.pojo.Piloto;

public class PilotoDAO {

	private Connection conn;

	public PilotoDAO() {
		this.conn = new ConnectionFactory().getConnection();
	}

	public boolean inserePiloto(Piloto piloto) throws SQLException {

		String sql = "INSERT INTO aeronaves.piloto" + "(nome, matricula, horas_voo, num_aeronave, salario) "
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

	public List<Piloto> listaPilotos() throws SQLException {

		List<Piloto> pilotos = new ArrayList<Piloto>();

		String sql = "SELECT * FROM aeronaves.piloto";

		PreparedStatement stmt = conn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {

			Piloto piloto = new Piloto();

			piloto.setMatricula(rs.getInt("matricula"));
			piloto.setNome(rs.getString("nome"));
			piloto.setHorasVoo(rs.getFloat("horas_voo"));
			piloto.setNumAeronave(rs.getInt("num_aeronave"));
			piloto.setSalario(rs.getFloat("salario"));

			pilotos.add(piloto);
		}

		return pilotos;
	}

	public List<Piloto> listaPilotosPorHoraDeVooMaior(Float horasVoo) throws SQLException {
		
		List<Piloto> pilotos = new ArrayList<Piloto>();

		String sql = "SELECT * FROM aeronaves.piloto "
				+ "WHERE horas_voo > ?";

		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setFloat(1, horasVoo);
		
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {

			Piloto piloto = new Piloto();

			piloto.setMatricula(rs.getInt("matricula"));
			piloto.setNome(rs.getString("nome"));
			piloto.setHorasVoo(rs.getFloat("horas_voo"));
			piloto.setNumAeronave(rs.getInt("num_aeronave"));
			piloto.setSalario(rs.getFloat("salario"));

			pilotos.add(piloto);
		}

		return pilotos;
	}
	
	public boolean removePiloto(int matricula) throws SQLException {
		
		String sql = "delete from aeronaves.piloto "
				+ "where matricula = ?";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, matricula);
		
		if (stmt.executeUpdate() > 0) {
			return true;
		}
		
		return false;
	}

}
