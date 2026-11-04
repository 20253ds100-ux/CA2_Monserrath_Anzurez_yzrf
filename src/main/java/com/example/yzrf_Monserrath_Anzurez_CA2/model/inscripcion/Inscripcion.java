package com.example.yzrf_Monserrath_Anzurez_CA2.model.inscripcion;

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

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table
public class Inscripcion {
    @Column
    @Id
    @NotNull
    private Long id;
    @Column
    @NotBlank
    private String nombre;
    @Column
    private String descripcion;
    @Column
    @NotNull
    @JsonFormat(pattern = "yyyy-mm-dd")
    private LocalDate fechaInicio;
    @Column
    @NotNull
    @JsonFormat(pattern = "yyyy-mm-dd")
    private LocalDate fechaFinal;
    @NotBlank
    @Column
    private Estado estado;
}