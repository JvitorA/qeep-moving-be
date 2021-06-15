package br.com.qm.be.cidade;

import java.sql.SQLException;
import java.util.List;

import br.com.qm.be.cidade.dao.CidadeDAO;
import br.com.qm.be.cidade.pojo.Cidade;

public class ProgramaPrincipal {

	
	public static void main(String[] args) throws SQLException {
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		
//		Cidade cidadeTeste = new Cidade(79, "Aracajú", 7000000, 6541.24F, true, "SE", "Gilson Coelho");
//		cidadeDAO.insereCidade(cidadeTeste);
		
		List<Cidade> cidades = cidadeDAO.listaCidades();
		
		System.out.println("Cidades no BD");
		for (Cidade cidade : cidades) {
			System.out.println(cidade);
		}

		Cidade cidadeConsultada = cidadeDAO.consultaCidade(34);
		System.out.println("Cidade consultado -> " + cidadeConsultada);
		
		int qtdCidadesMG = cidadeDAO.quantidadeCidadesPorEstado("MG");
		int qtdCidadesSP = cidadeDAO.quantidadeCidadesPorEstado("SP");
		
		System.out.println("Cidades no estado de MG -> " + qtdCidadesMG);
		System.out.println("Cidades no estado de SP -> " + qtdCidadesSP);
		
		
		System.out.println("Cidades que começam com A");
		List<Cidade> cidadesPorComeco = cidadeDAO.listaCidadesPorTexto("A");
		for (Cidade cidade : cidadesPorComeco) {
			System.out.println(cidade);
		}
		
		
		System.out.println("Cidades do estado de SP");
		List<Cidade> cidadesSP = cidadeDAO.listaCidadesPorSigla("SP");
		for (Cidade cidade : cidadesSP) {
			System.out.println(cidade);
		}
		
		System.out.println("Capitas presentes do BD");
		List<Cidade> capitais = cidadeDAO.listaFiltroCapital(true);
		for (Cidade cidade: capitais) {
			System.out.println(cidade);
		}
		
		
	}
	
}
