package com.example.yzrf_Monserrath_Anzurez_CA2.controller.curso;

import com.example.yzrf_Monserrath_Anzurez_CA2.repository.CursoReopository;
import com.example.yzrf_Monserrath_Anzurez_CA2.repository.InscripcionRespository;
import com.example.yzrf_Monserrath_Anzurez_CA2.service.CursoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursoController")
@CrossOrigin
public class CursoController {

    private final CursoReopository cursoReopository;
    private final InscripcionRespository inscripcionRespository;

    public CursoController(CursoReopository cursoRepository,
                           InscripcionRespository inscripcionRepository,
                           CursoReopository cursoReopository,
                           InscripcionRespository inscripcionRespository) {
    CursoService cursoService;
        this.cursoReopository = cursoReopository;
        this.inscripcionRespository = inscripcionRespository;
    }
}