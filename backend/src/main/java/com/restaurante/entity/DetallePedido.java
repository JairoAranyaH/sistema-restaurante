package com.restaurante.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.java.Log;

@Entity
@Table(name = "detalle_pedidos")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Log id;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;
    private Integer cantidad;
    private Double precioUnitario;

    //Total de esa linea: cantidad x precioUnitario
    public Double getSubtotal(){
        return cantidad * precioUnitario;
    }

}
