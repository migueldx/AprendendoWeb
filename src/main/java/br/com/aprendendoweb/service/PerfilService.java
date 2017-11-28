package br.com.aprendendoweb.service;

import br.com.aprendendoweb.model.Perfil;
import br.com.aprendendoweb.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilService {

    @Autowired
    private PerfilRepository perfilRepository;

    public Perfil salvar (Perfil perfil){
        return perfilRepository.save(perfil);
    }

    public List<Perfil> buscarTodos() {
        return perfilRepository.findAll();
    }

    public void deletar(Perfil perfil) {
        perfilRepository.delete(perfil);
    }
}
