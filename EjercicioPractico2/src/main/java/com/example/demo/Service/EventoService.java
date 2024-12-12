
package com.example.demo.Service;
import com.example.demo.Domain.Evento;
import java.util.List;


public interface EventoService {
    void reservarEvento(Evento evento);
     List<Evento> realizarReservasEventos(Long usuarioId);

    public Object findAll();

    public void save(Evento evento);
}
