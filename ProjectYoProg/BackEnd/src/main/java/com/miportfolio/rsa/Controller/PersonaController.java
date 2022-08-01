/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.rsa.Controller;

import com.miportfolio.rsa.Entity.Persona;
import com.miportfolio.rsa.Interface.IntPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
/**
 *
 * @author Rodrigo
 */
public class PersonaController {
    @Autowired IntPersonaService intPersonaService;

    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return intPersonaService.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        intPersonaService.savePersona(persona);
        return "Se creó una persona correctamente.";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        intPersonaService.deletePersona(id);
        return "Se eliminó una persona correctamente.";
    }
    
   @PutMapping("/personas/editar/(id)") 
   public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam("foto") String nuevaFoto) {
        Persona persona = intPersonaService.findPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setFoto(nuevaFoto);
        
        intPersonaService.savePersona(persona);
        return persona;
}
   @GetMapping("/personas/traer/perfil")
   public Persona findPersona(){
       return intPersonaService.findPersona((long)1);
   }
}
