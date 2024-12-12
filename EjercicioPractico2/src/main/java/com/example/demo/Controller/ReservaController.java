
package com.example.demo.Controller;
import com.example.demo.Service.EventoService;
import com.example.demo.Service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReservaController {
     @Autowired
    private ReservaService reservaService;

    @Autowired
    private EventoService eventoService;
    
     @GetMapping("/reservas")
    public String mostrarReservas(Model model) {
         Long usuarioId = null;
       model.addAttribute("reservas", reservaService.obtenerReservasPorUsuario(usuarioId));
        return "reservas/lista";  
    
}
}