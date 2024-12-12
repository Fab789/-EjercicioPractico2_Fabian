
package com.example.demo.Service;

import com.example.demo.Domain.Usuario;


public interface UsuarioService {
     Usuario findByUsername(String username);
    Usuario save(Usuario usuario);
}
