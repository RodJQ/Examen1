package com.cinelitas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;


@Entity
@Table (name="salas")
public class Sala implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long nsala;
    private long capacidadm;
    private String nombre;
}
