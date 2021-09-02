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

public class Medico {
    @Id
    private  long CRM;

    private String nome;
    private String endereço;
    private Integer telefone;


}
