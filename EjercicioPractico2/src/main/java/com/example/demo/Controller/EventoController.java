
package com.example.demo.Controller;

import com.example.demo.Domain.Evento;
import com.example.demo.Service.EventoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/eventos")
public class EventoController {
    private final EventoService eventoService;
    
     public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }
      @GetMapping
    public String listEventos(Model model) {
        model.addAttribute("eventos", eventoService.findAll());
        return "eventos";
    }

    @PostMapping("/crear")
    public String crearEvento(@ModelAttribute Evento evento) {
        eventoService.save(evento);
        return "redirect:/eventos";
    }

}
