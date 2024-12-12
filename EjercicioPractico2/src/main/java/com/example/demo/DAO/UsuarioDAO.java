
package com.example.demo.DAO;

import com.example.demo.Domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDAO extends JpaRepository<Usuario, Long> {

    public Usuario findByUsername(String usuario);
    
}
