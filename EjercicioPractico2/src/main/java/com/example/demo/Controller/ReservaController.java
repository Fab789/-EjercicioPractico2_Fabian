
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
    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @GetMapping("/reservas")
    public String listReservas(Model model) {
        model.addAttribute("reservas", reservaService.findAll());
        return "reservas";
    }
}