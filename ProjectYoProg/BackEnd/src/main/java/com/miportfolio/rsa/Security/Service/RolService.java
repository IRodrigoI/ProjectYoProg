/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.rsa.Security.Service;

import com.miportfolio.rsa.Security.Entity.Rol;
import com.miportfolio.rsa.Security.Enums.RolNombre;
import com.miportfolio.rsa.Security.Repository.intRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
/**
 *
 * @author Rodrigo
 */
public class RolService {
    @Autowired
    intRolRepository introlRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return introlRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
            introlRepository.save(rol);
    }
}
