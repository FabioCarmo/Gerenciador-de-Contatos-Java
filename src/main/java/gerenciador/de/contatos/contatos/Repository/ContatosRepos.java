package gerenciador.de.contatos.contatos.Repository;

import gerenciador.de.contatos.contatos.Model.ContatosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatosRepos extends JpaRepository<ContatosEntity, Integer> {

}
