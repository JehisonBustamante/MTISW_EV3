package mingeso.plataforma.repositories;
import mingeso.plataforma.entities.carreraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepository extends JpaRepository<carreraEntity, Long>{

    carreraEntity findByCodigoCarrera(int codigoCarrera);
}
