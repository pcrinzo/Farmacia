package com.produtos.Farmacia.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class Remedio {
    @Id
    private  long codigo;

    private String preco;
    private String observacoes;
    private Integer nome;
    private Integer fabricante;
}
