package gerenciador.de.contatos.contatos.Services;

import gerenciador.de.contatos.contatos.Model.ContatosEntity;
import gerenciador.de.contatos.contatos.Repository.ContatosRepos;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Contatosdb {

    private final ContatosRepos repository;

    public Contatosdb(ContatosRepos repository) {
        this.repository = repository;
    }

    public ContatosEntity add(ContatosEntity contatos) {
        return repository.save(contatos);
    }

    public List<ContatosEntity> findAll() {
        return repository.findAll();
    }
}
