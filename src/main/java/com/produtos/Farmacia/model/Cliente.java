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

public class Cliente {
    @Id
    private  long codigo;

    private String nome;
    private String endereço;
    private Integer telefone;

}
