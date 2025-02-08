package com.peluqueria.pelu.controller;

import org.springframework.web.bind.annotation.RestController;

import com.peluqueria.pelu.model.Turno;
import com.peluqueria.pelu.service.TurnoService;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/turnos")
@CrossOrigin(origins = "http://localhost:4200")

public class TurnoController {

    private TurnoService turnoService;

    public TurnoController(TurnoService turnoService){
        this.turnoService = turnoService;
    }

    @GetMapping()
    public List<Turno> obtenerTurnos(){
        return turnoService.obtenerTurnos();
    }
    
    @PostMapping()
    public Turno guardarTurno(@RequestBody Turno turno){
        return turnoService.guardarTurno(turno);
    }
}
