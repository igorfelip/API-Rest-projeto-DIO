package school.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.demo.model.Aluno;
import school.demo.service.AlunoServiceImpl;

@RestController
@RequestMapping("aluno")
public class AlunosRestController {
    @Autowired
    AlunoServiceImpl alunoServiceImpl;

    @GetMapping
    public Iterable<Aluno> buscarTodos() {
        return alunoServiceImpl.buscarTodos();
    }

    @GetMapping("/{id}")
    public Aluno buscarUm(@PathVariable Long id) {
        return alunoServiceImpl.buscarUm(id);
    }

    @PostMapping
    public Aluno adicionar(@RequestBody Aluno aluno) {
        alunoServiceImpl.adicionar(aluno);
        return aluno;
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable Long id) {
        alunoServiceImpl.atualizar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        alunoServiceImpl.deletar(id);
    }
}


