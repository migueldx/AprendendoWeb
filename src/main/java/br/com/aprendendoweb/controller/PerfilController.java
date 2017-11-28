package br.com.aprendendoweb.controller;

import br.com.aprendendoweb.model.Perfil;
import br.com.aprendendoweb.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perfilcontroller")
@CrossOrigin(origins = "*")
public class PerfilController {

    @Autowired
    private PerfilService perfilService;

    @PostMapping
    public Perfil inserir(@RequestBody Perfil perfil){
        return perfilService.salvar(perfil);
    }

    @GetMapping
    public List<Perfil> buscarTodos(){
        return perfilService.buscarTodos();
    }

    @PutMapping
    public Perfil alterar(@RequestBody Perfil perfil){
        return perfilService.salvar(perfil);
    }

    @DeleteMapping("/id")
    public void deletar(@RequestBody Perfil perfil){
         perfilService.deletar(perfil);
    }



}
