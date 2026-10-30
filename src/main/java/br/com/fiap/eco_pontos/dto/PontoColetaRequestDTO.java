package br.com.fiap.eco_pontos.dto;

import br.com.fiap.eco_pontos.database.model.TipoMaterial;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PontoColetaRequestDTO(

        @NotBlank(message = "O nome do ponto de coleta é obrigatório!")
        String nome,

        @NotBlank(message = "O endereço do ponto de coleta é obrigatório!")
        String endereco,

        @NotNull(message = "O bairro do ponto de coleta é obrigatório!")
        String bairro,

        @NotBlank(message = "O tipo de material do ponto de coleta é obrigatório!")
        TipoMaterial tipoMaterial
) {

}
