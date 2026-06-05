package com.restaurante.entity;

import jakarta.persistence.*;
import lombok.*;

import javax.print.attribute.standard.MediaSize;
import java.time.LocalDateTime;

@Entity
@Table(name = "ventas")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "pedido_id",unique = true)
    private Pedido pedido;

    @OneToOne
    @JoinColumn(name = "pago_id",unique = true)
    private Pago pago;

    private Double total;
    private LocalDateTime fecha;

}
