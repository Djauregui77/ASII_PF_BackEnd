package proyectofinal.backend.clinica.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import proyectofinal.backend.clinica.models.CitaPaciente;

public interface ICitasDao extends JpaRepository<CitaPaciente,Integer> {
}
