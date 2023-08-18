package school.demo.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import school.demo.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
}
