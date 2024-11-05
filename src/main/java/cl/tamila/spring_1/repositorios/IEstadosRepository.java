package cl.tamila.spring_1.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.tamila.spring_1.modelos.EstadosModel;
public interface IEstadosRepository extends JpaRepository<EstadosModel, Long> {
	List<EstadosModel> findByIdIn(List<Long> id);
}
