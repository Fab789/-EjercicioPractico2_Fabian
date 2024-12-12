
package com.example.demo.Service;

import com.example.demo.Domain.Reserva;
import java.util.List;
public interface ReservaService {
    void crearReserva(Reserva reserva);
    List<Reserva> obtenerReservasPorUsuario(Long usuarioId);
    
}
