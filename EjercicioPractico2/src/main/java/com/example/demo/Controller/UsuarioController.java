
package com.example.demo.Controller;
import com.example.demo.Domain.Usuario;
import com.example.demo.Service.UsuarioService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
      private final UsuarioService usuarioService;
      
      public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
         @GetMapping("/registro")
    public String registroForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }

    @PostMapping("/registro")
    public String registrarUsuario(@ModelAttribute Usuario usuario) {
        usuario.setPassword(new BCryptPasswordEncoder().encode(usuario.getPassword()));
        usuarioService.save(usuario);
        return "redirect:/login";
    }

    
}
