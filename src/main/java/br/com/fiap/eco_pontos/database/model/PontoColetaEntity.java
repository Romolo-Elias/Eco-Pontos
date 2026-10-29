package br.com.fiap.eco_pontos.database.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pontos_coleta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PontoColetaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pontos_coleta_seq")
    @SequenceGenerator(name = "pontos_coleta_seq", sequenceName = "PONTOS_COLETA_SEQ", allocationSize = 1)
    private Long id;

    private String nome;

    private String endereco;

    private String bairro;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_material")
    private TipoMaterial tipoMaterial;

    private boolean ativo;

}
