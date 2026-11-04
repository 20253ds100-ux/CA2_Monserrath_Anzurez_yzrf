package com.example.yzrf_Monserrath_Anzurez_CA2.service;
import com.example.yzrf_Monserrath_Anzurez_CA2.repository.CursoReopository;
import com.example.yzrf_Monserrath_Anzurez_CA2.repository.InscripcionRespository;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
    private final CursoReopository cursoReopository;
    private final InscripcionRespository inscripcionRespository;

    public CursoService(CursoReopository cursoRepository,
                        InscripcionRespository inscripcionRepository,
                        CursoReopository cursoReopository,
                        InscripcionRespository inscripcionRespository) {
        this.cursoReopository = cursoReopository;
        this.inscripcionRespository = inscripcionRespository;
        CursoService cursoService;
    }
}

