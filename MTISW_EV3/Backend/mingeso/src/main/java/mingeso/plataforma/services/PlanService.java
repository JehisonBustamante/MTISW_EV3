package mingeso.plataforma.services;
import mingeso.plataforma.entities.planEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
public class planService {

    @Autowired
    private mingeso.plataforma.repositories.planRepository planRepository;

    public planEntity crearPlanEstudiante(planEntity plan){
        return planRepository.save(plan);
    }

    public ArrayList<planEntity> getAllPlans(){
      return (ArrayList<planEntity>) planRepository.findAll();
    }

    public planEntity buscarPlanPorId(int codigoPlan){
        return planRepository.findByCodigoPlan(codigoPlan);
    }

    public planEntity buscarCodigoAsignatura(int codigoAsignatura){
        return planRepository.findByCodigoAsignatura(codigoAsignatura);
    }

}
