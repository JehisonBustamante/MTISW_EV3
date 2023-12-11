package mingeso.plataforma.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import mingeso.plataforma.entities.carreraEntity;
import mingeso.plataforma.services.carreraService;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/carreras")
public class carreraController{

    @Autowired
    private carreraService carreraService;

    @GetMapping()
    public ResponseEntity<ArrayList<carreraEntity>> getAllCarrers(){
        ArrayList<carreraEntity> listaCarreras = carreraService.getAllCarreras();
        if(listaCarreras == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listaCarreras);
    }

    @PostMapping()
    public ResponseEntity<carreraEntity> createCarrera(@RequestBody carreraEntity carrera){
        carreraEntity newCarrera = carreraService.createCarrera(carrera);
        return ResponseEntity.ok(newCarrera);
    }

    @GetMapping("/byCarrera/{codigoCarrera}")
    public ResponseEntity<carreraEntity> getCarreraByCodigo(@PathVariable("codigoCarrera") int codigoCarrera){
        carreraEntity newCarrera = carreraService.buscarCarreraPorId(codigoCarrera);
        if(newCarrera == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(newCarrera);
    }
}
