package mingeso.plataforma.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mingeso.plataforma.entities.prerequisitosEntity;

import java.util.ArrayList;

@Service
public class prerequisitosService {

    @Autowired
    private mingeso.plataforma.repositories.prerequisitosRepository prerequisitosRepository;

    public ArrayList<prerequisitosEntity> getAllPrerequisities(){
        return (ArrayList<prerequisitosEntity>) prerequisitosRepository.findAll();
    }

    public prerequisitosEntity findRequisiteById(int codigoPrerequisitos){
        return prerequisitosRepository.findByCodigoPrerequisitos(codigoPrerequisitos);
    }

    public prerequisitosEntity createPrerequisito(prerequisitosEntity prerequisitos){
        return prerequisitosRepository.save(prerequisitos);
    }

}
