package com.restaurante.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "empleados")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Empleado extends Persona{

    private String cargo;
    private Double salario;

}
