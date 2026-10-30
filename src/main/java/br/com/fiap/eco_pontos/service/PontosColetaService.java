package br.com.fiap.eco_pontos.service;

import br.com.fiap.eco_pontos.database.model.PontoColetaEntity;
import br.com.fiap.eco_pontos.dto.PontoColetaRequestDTO;
import br.com.fiap.eco_pontos.dto.PontoColetaResponseDTO;
import br.com.fiap.eco_pontos.repository.PontosColetaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
@RequiredArgsConstructor
public class PontosColetaService {

    @Autowired
    private final PontosColetaRepository pontosColetaRepository;

    //Listar todos os pontos de coleta
    public List<PontoColetaResponseDTO> findAll(){
        List <PontoColetaEntity> pontosColeta = pontosColetaRepository.findAll();

       return pontosColeta.stream()
               .map(pontoColeta -> new PontoColetaResponseDTO(pontoColeta.getId(),
                       pontoColeta.getNome(),
                       pontoColeta.getEndereco(),
                       pontoColeta.getBairro(),
                       pontoColeta.getTipoMaterial()))
               .toList();
    }

    //public PontoColetaResponseDTO findById(Long id) {
        //PontoColetaEntity pontoColeta = pontosColetaRepository.findById(id)
                //.orElseThrow(()-> new RuntimeException("Ponto Coleta não encontrado pelo id" + id));

    //}

    //Salvar ponto de coleta
    public void create(PontoColetaRequestDTO pontoColetaRequestDTO){
        PontoColetaEntity pontoColeta = PontoColetaEntity.builder()
                .nome(pontoColetaRequestDTO.nome())
                .endereco(pontoColetaRequestDTO.endereco())
                .bairro(pontoColetaRequestDTO.bairro())
                .tipoMaterial(pontoColetaRequestDTO.tipoMaterial())
                .ativo(true).build();

        pontosColetaRepository.save(pontoColeta);
    }



}
