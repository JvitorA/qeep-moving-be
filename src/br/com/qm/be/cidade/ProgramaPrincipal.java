package br.com.qm.be.cidade;

import java.sql.SQLException;

import br.com.qm.be.cidade.dao.CidadeDAO;
import br.com.qm.be.cidade.pojo.Cidade;

public class ProgramaPrincipal {

	
	public static void main(String[] args) throws SQLException {
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		
		Cidade cidadeTeste = new Cidade(32, "Araxá", 100000, 3564.65F, false, "MGH", "João");
		
		
		cidadeDAO.insereCidade(cidadeTeste);
	}
	
}
