package br.com.zup.cep.consumer.controller;

import br.com.zup.cep.consumer.model.Endereco;
import br.com.zup.cep.consumer.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoResource {

    @Autowired
    EnderecoService enderecoService;

    public ResponseEntity<Endereco> saveEndereco(@RequestBody Endereco endereco) {
        enderecoService.save(endereco);
        return ResponseEntity.ok(endereco);
    }

    @GetMapping
    public ResponseEntity<List<Endereco>> getListaEndereco() {
        List<Endereco> listaEndereco = enderecoService.getlisEnderecoList();
        return ResponseEntity.ok(listaEndereco);
    }
}
