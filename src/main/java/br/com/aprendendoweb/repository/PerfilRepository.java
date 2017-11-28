package br.com.aprendendoweb.repository;

import br.com.aprendendoweb.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil, Integer> {
}
