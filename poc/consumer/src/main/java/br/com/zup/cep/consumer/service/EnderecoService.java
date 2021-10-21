package br.com.zup.cep.consumer.service;

import br.com.zup.cep.consumer.model.Endereco;
import br.com.zup.cep.consumer.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco save(Endereco endereco){
        return enderecoRepository.save(endereco);
    }

    public List<Endereco> getlisEnderecoList(){
        return enderecoRepository.findAll();

    }
}
