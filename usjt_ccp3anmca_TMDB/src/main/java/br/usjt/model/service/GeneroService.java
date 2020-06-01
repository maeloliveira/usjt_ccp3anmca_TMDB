package br.usjt.model.service;

import java.io.IOException;
import java.util.List;

import br.usjt.model.DAO.GeneroDAO;
import br.usjt.model.entity.Genero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class GeneroService {
	@Autowired
	private GeneroDAO dao;

	public Genero buscarGenero(int id) throws IOException {
		return dao.buscarGenero(id);
	}

	public List<Genero> listarGeneros() throws IOException{
		return dao.listarGeneros();
	}

}
