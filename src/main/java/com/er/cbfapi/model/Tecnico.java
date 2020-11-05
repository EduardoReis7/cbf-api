package com.er.cbfapi.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Tecnico implements Serializable {

    private static final long serialVersionUID = -1753887003059750962L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_tecnico")
    private Long id;
    @Column(name = "nome")
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
