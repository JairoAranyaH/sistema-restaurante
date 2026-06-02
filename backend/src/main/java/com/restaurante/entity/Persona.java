package com.restaurante.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Persona {

    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String correo;

}
