/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.miportfolio.rsa.Security.Repository;

import com.miportfolio.rsa.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/**
 *
 * @author Rodrigo
 */
public interface intUsuarioRepository extends JpaRepository<Usuario, Integer>{
   Optional<Usuario> findByNombreUsuario(String nombreUsuario);
   
   boolean existsByNombreUsuario(String nombreUsuario);
   boolean existsByEmail(String email);
}
