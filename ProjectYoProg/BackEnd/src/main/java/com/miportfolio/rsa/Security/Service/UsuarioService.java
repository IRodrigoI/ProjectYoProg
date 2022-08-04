/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.rsa.Security.Service;

import com.miportfolio.rsa.Security.Entity.Usuario;
import com.miportfolio.rsa.Security.Repository.intUsuarioRepository;
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
public class UsuarioService {
    @Autowired
    intUsuarioRepository intusuarioRepository;
    
   public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
       return intusuarioRepository.findByNombreUsuario(nombreUsuario);
   }
   
   public boolean existsByNombreUsuario(String nombreUsuario){
       return intusuarioRepository.existsByNombreUsuario(nombreUsuario);
   }
   
   public boolean existsByEmail(String email){
       return intusuarioRepository.existsByEmail(email);
   } 
   
   public void save(Usuario usuario){
      intusuarioRepository.save(usuario); 
   }
}
