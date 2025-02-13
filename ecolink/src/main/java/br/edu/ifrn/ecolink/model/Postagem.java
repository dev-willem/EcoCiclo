package br.edu.ifrn.ecolink.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Postagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String descricao;
    private String localizacao;

    @ManyToOne
    private Usuario usuario;
}
