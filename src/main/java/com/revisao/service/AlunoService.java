package com.revisao.service;

import com.revisao.banco.revisaoBanco.request.AlunoRequest;
import com.revisao.banco.revisaoBanco.response.AlunoResponse;
import com.revisao.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AlunoService {

    public AlunoResponse createAluno(AlunoRequest alunoRequest){
        Aluno aluno = new Aluno(
                UUID.randomUUID(),
                alunoRequest.getNome(),
                alunoRequest.getAge(),
                alunoRequest.getYear()
        );

        return new AlunoResponse(aluno);
    }
}
