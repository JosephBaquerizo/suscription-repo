package ec.com.zurich.suscription.resources.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "RECLAMO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reclamo implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "FECHAAPERTURA")
    private LocalDateTime fechaApertura;

    @Column(name = "NUMERORECLAMO")
    private String numeroReclamo;

    @Column(name = "RECLAMOCASHLOSS")
    private Boolean reclamoCashLoss;

    @Column(name = "NUMEROSUBRECLAMO")
    private int numeroSubreclamo;

    @Column(name = "DESCRIPCIONSINIESTRO")
    private String descripcionSiniestro;

    @Column(name = "FECHAOCURRENCIA")
    private LocalDateTime fechaOcurrencia;

    @Column(name = "TIPOPERDIDA")
    private String tipoPerdida;

    @Column(name = "EDAD")
    private Integer edad;

    @Column(name = "ENDOSOITEMID", nullable = false)
    private String endosoItemId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ENDOSOITEMID", insertable= false, updatable = false)
    private EndosoItem endosoItem;
}
