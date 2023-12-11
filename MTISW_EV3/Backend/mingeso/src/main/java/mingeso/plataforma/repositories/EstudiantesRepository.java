package mingeso.plataforma.repositories;
import mingeso.plataforma.entities.estudiantesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface estudiantesRepository extends JpaRepository<estudiantesEntity, Long> {


    estudiantesEntity findEstudentByCodigoCarrera(Long codigoCarrera);


    estudiantesEntity deleteByCodigoCarrera(Long codigoCarrera);
}