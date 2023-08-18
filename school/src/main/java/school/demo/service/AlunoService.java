package school.demo.service;



import school.demo.model.Aluno;

import java.util.Optional;

public interface AlunoService {
    Iterable<Aluno> buscarTodos();

    Aluno buscarUm(Long id);

    void atualizar(Long id);

    void adicionar(Aluno aluno);

    void deletar(Long id);
}