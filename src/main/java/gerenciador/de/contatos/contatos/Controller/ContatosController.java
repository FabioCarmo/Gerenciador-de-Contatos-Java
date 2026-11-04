package gerenciador.de.contatos.contatos.Controller;

import gerenciador.de.contatos.contatos.Model.ContatosEntity;
import gerenciador.de.contatos.contatos.Services.Contatosdb;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/contatos")
public class ContatosController {

    private Contatosdb contatoRepos;

    @GetMapping("")
    public ResponseEntity<ContatosEntity> adicionarContato(@RequestBody ContatosEntity contatos) {
        return ResponseEntity.status(HttpStatus.CREATED).body(contatoRepos.add(contatos));
    }

    @GetMapping("/exibircontatos")
    public List<ContatosEntity> exibirContatos() {
        return contatoRepos.findAll();
    }

}
