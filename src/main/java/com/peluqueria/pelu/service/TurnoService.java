package com.peluqueria.pelu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.peluqueria.pelu.model.Turno;
import com.peluqueria.pelu.repository.TurnoRepository;

@Service
public class TurnoService {
    private final TurnoRepository turnoRepository;

    public TurnoService(TurnoRepository turnoRepository){
        this.turnoRepository = turnoRepository;
    }

    public List<Turno> obtenerTurnos(){
        return turnoRepository.findAll();
    }

    public Turno guardarTurno(Turno turno){
        return turnoRepository.save(turno);
    }
}
