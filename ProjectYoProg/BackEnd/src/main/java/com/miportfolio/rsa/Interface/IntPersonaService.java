/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.miportfolio.rsa.Interface;

import com.miportfolio.rsa.Entity.Persona;
import java.util.List;


/**
 *
 * @author Rodrigo
 */
public interface IntPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto de tipo Persona buscado por ID
    public void deletePersona(Long id);
    
    //Buscar Persona por ID
    public Persona findPersona(Long id);
}
