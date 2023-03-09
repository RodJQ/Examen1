package com.cinelitas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table (name ="peliculas")

public class Pelicula implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private long id;
    private String nombre;
    private long costo;
    private String fecha;
    
    @ManyToOne
    @JoinColumn(name = "salas_nsala")
    private Sala sala;
}
