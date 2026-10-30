package br.com.fiap.eco_pontos.dto;

import br.com.fiap.eco_pontos.database.model.TipoMaterial;

public record PontoColetaResponseDTO(
        Long id,
        String nome,
        String endereco,
        String bairro,
        TipoMaterial tipoMaterial
) {

}
