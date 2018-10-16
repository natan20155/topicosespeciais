package Fvs.edu.br.topicos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Fvs.edu.br.topicos.domain.Categoria;
import Fvs.edu.br.topicos.repositorios.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repositorio;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repositorio.findById(id);
		
		return obj.orElse(null);
		
	}
	
	
}
