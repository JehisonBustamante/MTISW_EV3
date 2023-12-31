package mingeso.plataforma.services;
import mingeso.plataforma.entities.estudiantesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
public class EstudiantesService {

    @Autowired
    mingeso.plataforma.repositories.EstudiantesRepository estudiantesRepository;
    
    public ArrayList<estudiantesEntity> obtenerEstudiantes(){
        return (ArrayList<estudiantesEntity>) estudiantesRepository.findAll();
    }

    public estudiantesEntity guardarEstudiante(estudiantesEntity usuario){
        return estudiantesRepository.save(usuario);
    }

    public estudiantesEntity findEstudentByCarrer(Long codigoCarrera){
        return estudiantesRepository.findEstudentByCodigoCarrera(codigoCarrera);
    }
    public estudiantesEntity deleteEstudentByCarrer(Long codigoCarrera){
        return estudiantesRepository.deleteByCodigoCarrera(codigoCarrera);
    }
}