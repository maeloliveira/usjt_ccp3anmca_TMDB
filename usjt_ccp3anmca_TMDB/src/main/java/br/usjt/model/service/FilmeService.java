package br.usjt.model.service;

import java.io.IOException;
import java.util.List;
import javax.transaction.Transactional;
import br.usjt.model.DAO.FilmeDAO;
import br.usjt.model.entity.Filme;
import br.usjt.model.entity.Genero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service

public class FilmeService {
	@Autowired
	private FilmeDAO dao;
	
	public Filme buscarFilme(int id) throws IOException{
		return dao.buscarFilme(id);
	}
	
	@Transactional
	public Filme inserirFilme(Filme filme) throws IOException {
		int id = dao.inserirFilme(filme);
		filme.setId(id);
		return filme;
	}
	
	@Transactional
	public void atualizarFilme(Filme filme) throws IOException {
		dao.atualizarFilme(filme);
	}
	
	@Transactional
	public void excluirFilme(int id) throws IOException {
		dao.excluirFilme(id);
	}

	public List<Filme> listarFilmes(String chave) throws IOException{
		return dao.listarFilmes(chave);
	}

	public List<Filme> listarFilmes() throws IOException{
		return dao.listarFilmes();
	}	
	public void baixarFilmesMaisPopulares() IOException{
		RestTemplate rest = new RestTemplate();
		String url = BASE_URL+POPULAR+"?"+APIlKEY+POPULAR_PAR;
		System.our.println()
	}

}
