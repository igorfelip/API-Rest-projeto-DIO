package school.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.demo.model.Aluno;
import school.demo.model.AlunoRepository;

import java.util.Optional;
@Service
public class AlunoServiceImpl implements  AlunoService{
    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public Iterable<Aluno> buscarTodos() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno buscarUm(Long id) {
        Optional<Aluno> aluno = alunoRepository.findById(id);
        return aluno.get();
    }

    @Override
    public void atualizar(Long id) {
        Optional <Aluno> novoAluno = alunoRepository.findById(id);
        if(novoAluno.isPresent())
            alunoRepository.save(novoAluno.get());
    }

    @Override
    public void adicionar(Aluno aluno) {
        Long ra = aluno.getId();
        alunoRepository.findById(ra).orElseGet(() -> {
            alunoRepository.save(aluno);

            return aluno;
        });
    }
    @Override
    public void deletar(Long id) {
        alunoRepository.deleteById(id);
    }
}
