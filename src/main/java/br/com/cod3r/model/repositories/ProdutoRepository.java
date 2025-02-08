package br.com.cod3r.model.repositories;
import org.springframework.data.repository.CrudRepository;
import br.com.cod3r.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {


}
