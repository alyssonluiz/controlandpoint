package com.dio.controlepontoacesso.model;

import lombok.*;

import javax.persistence.*;

/*Utilizando o plugin lobok que nos fornece as as anotações abaixo,
getters, setters, constructors equals e hashcode serão gerados automaticamente */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder //Testes e transferência de dados
@Entity
public class Localidade{
    @Id
    private long id;
    @ManyToOne
    private NivelAcesso NivelAcess;
    private String descricao;

}
