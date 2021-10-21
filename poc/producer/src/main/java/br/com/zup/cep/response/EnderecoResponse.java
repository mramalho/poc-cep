package br.com.zup.cep.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class EnderecoResponse {
    private String cep;
    private String logradouro;
    private Long numero;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
}
