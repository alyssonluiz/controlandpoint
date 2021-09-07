package com.dio.controlepontoacesso.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
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
public class Movimentacao {

    //Resolvendo o problema de uma chave dupla
    // (o id de movimentação é formado por uma chave estrangeira e uma chave primária)
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable

    public class MovimentacaoId implements Serializable{
        private long idMovimento;
        private long idUsuario;
    }

    @Id
    @EmbeddedId
    private MovimentacaoId movimentacaoId;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;
}
