package br.com.aprendendoweb.controller;

import br.com.aprendendoweb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuariocontroller")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

}
