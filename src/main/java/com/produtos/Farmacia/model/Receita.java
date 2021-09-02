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

public class Receita {
    @Id
    private  long codigo;

    private TipoData data;
    private String tipo;
    private TipoData validade;
    private String controle;


}

