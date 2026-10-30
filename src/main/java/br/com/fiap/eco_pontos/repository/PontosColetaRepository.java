package br.com.fiap.eco_pontos.repository;

import br.com.fiap.eco_pontos.database.model.PontoColetaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PontosColetaRepository extends JpaRepository<PontoColetaEntity, Long> {

}
