package mingeso.plataforma.repositories;
import mingeso.plataforma.entities.planEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PlanRepository extends JpaRepository<planEntity, Long>{

    planEntity findByCodigoPlan(int codigoPlan);

    planEntity findByCodigoAsignatura(int codigoAsignatura);

    ArrayList<planEntity> findListByCodigoAsignatura(int codigoAsignatura);

}
