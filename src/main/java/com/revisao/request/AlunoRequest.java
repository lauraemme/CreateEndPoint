package com.revisao.banco.revisaoBanco.request;

import lombok.Getter;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Getter
public class AlunoRequest {
    @NotEmpty @NotNull
    private String nome;
    @NotEmpty @NotNull
    private Integer age;
    @NotEmpty @NotNull
    private String year;
}
