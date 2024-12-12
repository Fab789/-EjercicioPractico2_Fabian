
package com.example.demo.Service;

import com.example.demo.Domain.Reserva;
import java.util.List;
public interface ReservaService {
     List<Reserva> findAll();
    Reserva save(Reserva reserva);
    
}
