package br.com.aprendendoweb.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Data
public class Perfil {
    @Id
    @SequenceGenerator(sequenceName = "seq_perfil", name = "seq_perfil")
    @GeneratedValue(generator = "seq_perfil")
    private Integer id;

    private String descricao;
}
