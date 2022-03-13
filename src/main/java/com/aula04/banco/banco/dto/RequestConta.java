package com.aula04.banco.banco.dto;

import com.aula04.banco.banco.model.TipoConta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter @Setter
@AllArgsConstructor
public class RequestConta {
    private UUID id;
    private Integer conta;
    private Integer agencia;
    private TipoConta tipoConta;
    private Double saldo;
}
