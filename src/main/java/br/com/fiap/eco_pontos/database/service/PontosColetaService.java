package br.com.fiap.eco_pontos.database.service;

import br.com.fiap.eco_pontos.database.model.PontoColetaEntity;
import br.com.fiap.eco_pontos.database.repository.PontosColetaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PontosColetaService {

    private final PontosColetaRepository pontosColetaRepository;

    public List<PontoColetaEntity> findAll(){
        return pontosColetaRepository.findAll();
    }
}
