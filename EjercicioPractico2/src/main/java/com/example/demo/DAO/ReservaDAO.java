
package com.example.demo.DAO;

import com.example.demo.Domain.Reserva;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaDAO extends JpaRepository<Reserva, Long> {
    List<Reserva> findByUsuarioId(Long usuarioId);
}

