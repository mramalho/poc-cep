package br.com.zup.cep.consumer.repository;

import br.com.zup.cep.consumer.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
