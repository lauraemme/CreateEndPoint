package com.revisao.banco.revisaoBanco.response;


import com.revisao.model.Aluno;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter   @Setter
@AllArgsConstructor
public class AlunoResponse {

    private UUID id;
    private String name;
    private String year;

    public AlunoResponse(Aluno aluno) {
        this.id = aluno.getId();
        this.name = aluno.getName();
        this.year = aluno.getYear();
    }

}
