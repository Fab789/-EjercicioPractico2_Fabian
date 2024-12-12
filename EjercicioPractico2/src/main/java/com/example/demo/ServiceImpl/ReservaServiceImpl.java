
package com.example.demo.ServiceImpl;
import com.example.demo.DAO.ReservaDAO;
import com.example.demo.Domain.Reserva;
import com.example.demo.Service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {
     
    @Autowired
    private ReservaDAO reservaDAO;
    
      @Override
    public void crearReserva(Reserva reserva) {
        reservaDAO.save(reserva);
        
        
    }
    @Override
    public List<Reserva> obtenerReservasPorUsuario(Long usuarioId) {
        return reservaDAO.findByUsuarioId(usuarioId);
    }
}
