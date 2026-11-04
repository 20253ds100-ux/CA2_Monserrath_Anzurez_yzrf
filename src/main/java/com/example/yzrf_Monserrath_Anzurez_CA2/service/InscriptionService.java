package com.example.yzrf_Monserrath_Anzurez_CA2.service;

import com.example.yzrf_Monserrath_Anzurez_CA2.model.inscripcion.Estado;
import com.example.yzrf_Monserrath_Anzurez_CA2.model.inscripcion.Inscripcion;
import com.example.yzrf_Monserrath_Anzurez_CA2.repository.CursoReopository;
import com.example.yzrf_Monserrath_Anzurez_CA2.repository.InscripcionRespository;
import org.springframework.stereotype.Service;

@Service
public class InscriptionService {
    private final CursoReopository cursoReopository;
    private final InscripcionRespository inscripcionRespository;

    public InscriptionService(CursoReopository cursoRepository, InscripcionRespository inscripcionRespository){
        this.cursoReopository = cursoRepository;
        this.inscripcionRespository = inscripcionRespository;
    }

    public Inscripcion inscripcion (Long id){
        if (inscripcion(id).getEstado() == Estado.ACTIVA){

        }
    }

    public Inscripcion cancelarInscripcion (Long id){
        if(inscripcion(id).getEstado() == Estado.ACTIVA){

        } else if (inscripcion(id).getEstado() != Estado.ACTIVA && inscripcion(id).getEstado() != Estado.CANCELADA){
            System.out.println("El registro no existe, no se puede cancelar");
        }

        return ;
    }

    public Inscripcion consultarDisponibles (Estado estado, Long id){
        if (inscripcion(id).getEstado() == Estado.ACTIVA){
            return id;
        }
        return id;
    }


}
