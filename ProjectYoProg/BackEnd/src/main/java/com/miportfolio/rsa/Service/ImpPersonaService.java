/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.rsa.Service;

import com.miportfolio.rsa.Entity.Persona;
import com.miportfolio.rsa.Interface.IntPersonaService;
import com.miportfolio.rsa.Repository.IntPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author Rodrigo
 */
public class ImpPersonaService implements IntPersonaService{
    @Autowired IntPersonaRepository intPersonaRepository;
            
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = intPersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        intPersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        intPersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = intPersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
