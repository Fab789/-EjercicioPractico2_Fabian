
package com.example.demo.ServiceImpl;
import com.example.demo.DAO.UsuarioDAO;
import com.example.demo.Domain.Usuario;
import com.example.demo.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

public class UsuarioServiceImpl implements UsuarioService {
     private final UsuarioDAO usuarioDAO;

    public UsuarioServiceImpl(UsuarioDAO usuarioRepository) {
        this.usuarioDAO = usuarioRepository;
    }

    @Override
    public Usuario findByUsername(String usuario) {
        return usuarioDAO.findByUsername(usuario);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioDAO.save(usuario);
    }
    
}
