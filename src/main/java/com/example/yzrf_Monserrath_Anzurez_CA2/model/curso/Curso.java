package com.example.yzrf_Monserrath_Anzurez_CA2.model.curso;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Curso {
    @Id
    @NotNull
    @Column
    private Long id;
    @NotBlank
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @NotNull
    @Column
    @JsonFormat(pattern = "yyyy-mm-dd")
    private LocalDate fechaInicio;
    @NotNull
    @Column
    @JsonFormat(pattern = "yyyy-mm-dd")
    private LocalDate fechaFinal;
    @NotNull
    @Column
    private Estado estado;
}