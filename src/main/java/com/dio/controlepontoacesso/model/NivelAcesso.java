package com.dio.controlepontoacesso.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

/*Utilizando o plugin lobok que nos fornece as as anotações abaixo,
getters, setters, constructors equals e hashcode serão gerados automaticamente */
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Builder //Testes e transferência de dados
    @Entity
    @Audited
    public class NivelAcesso {
        @Id
        private long id;
        private String descricao;

}
