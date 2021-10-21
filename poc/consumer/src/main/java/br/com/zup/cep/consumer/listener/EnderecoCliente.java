package br.com.zup.cep.consumer.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;

@Log4j2
public class EnderecoCliente {

    @KafkaListener(topics = "${topic.endereco-client}", groupId = "${spring.kafka.consumer.group-id}")
    public void obterEnderecoCliente(String enderecoString) throws JsonProcessingException {
        log.info("Mensagem Endereco {}", enderecoString );
    }

}
