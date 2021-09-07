package com.dio.controlepontoacesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

/*Utilizando o plugin lobok que nos fornece as as anotações abaixo,
getters, setters, constructors equals e hashcode serão gerados automaticamente */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder //Testes e transferência de dados
@Entity
public class Calendario {
    @Id
    private Long id;
    @ManyToOne
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;

}
