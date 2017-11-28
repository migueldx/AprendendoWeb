package br.com.aprendendoweb.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Usuario {
    @Id
    @SequenceGenerator(name = "seq_name", sequenceName = "seq_name")
    @GeneratedValue(generator = "seq_name")
    private int id;
    private String usuario;
    private String senha;

    @JoinColumn
    @ManyToOne
    private Perfil perfil;
}
