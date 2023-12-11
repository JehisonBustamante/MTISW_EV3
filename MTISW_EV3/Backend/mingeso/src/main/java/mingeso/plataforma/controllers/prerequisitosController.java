package mingeso.plataforma.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import mingeso.plataforma.services.prerequisitosService;
import mingeso.plataforma.entities.prerequisitosEntity;

import java.util.ArrayList;

@RestController
@RequestMapping("/prerequisitos")
@CrossOrigin(origins = "http://localhost:3000")
public class prerequisitosController{

    @Autowired

    private prerequisitosService prerequisitosService;

    @GetMapping()
    public ResponseEntity<ArrayList<prerequisitosEntity>> getAllPrerequisites(){
        ArrayList<prerequisitosEntity> listaPrerequisitos = prerequisitosService.getAllPrerequisities();
        if(listaPrerequisitos== null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listaPrerequisitos);
    }
    @PostMapping()
    public ResponseEntity<prerequisitosEntity> crearPrerequisito(@RequestBody prerequisitosEntity prerequisitos){
        prerequisitosEntity newPrerequisito = prerequisitosService.createPrerequisito(prerequisitos);
        return ResponseEntity.ok(newPrerequisito);
    }

    @GetMapping("/byPrerequisitos/{codigoPrerequisitos}")
    public ResponseEntity<prerequisitosEntity> buscarPrerequisito(@PathVariable("codigoPrerequisitos") int codigoPrerequisitos){
        prerequisitosEntity newPrerequisito = prerequisitosService.findRequisiteById(codigoPrerequisitos);
        if(newPrerequisito == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(newPrerequisito);
    }
}
