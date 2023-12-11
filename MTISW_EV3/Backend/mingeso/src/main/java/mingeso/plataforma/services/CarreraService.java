package mingeso.plataforma.services;
import mingeso.plataforma.entities.carreraEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class carreraService {
    @Autowired
    private mingeso.plataforma.repositories.carreraRepository carreraRepository;

    public ArrayList<carreraEntity> getAllCarreras(){
        return (ArrayList<carreraEntity>) carreraRepository.findAll();
    }

    public carreraEntity createCarrera(carreraEntity carrera){
        return carreraRepository.save(carrera);
    }

    public carreraEntity buscarCarreraPorId(int codigoCarrera){
        return carreraRepository.findByCodigoCarrera(codigoCarrera);
    }
}
