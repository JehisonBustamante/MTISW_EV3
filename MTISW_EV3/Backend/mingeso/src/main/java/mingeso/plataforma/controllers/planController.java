package mingeso.plataforma.controllers;

import mingeso.plataforma.entities.planEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/plan")
@CrossOrigin(origins = "http://localhost:3000")
public class planController {

    @Autowired
    private mingeso.plataforma.services.PlanService planService;

    @PostMapping()
    public ResponseEntity<planEntity> crearPlanEstudiante(@RequestBody planEntity plan){
        planEntity newPlan = planService.crearPlanEstudiante(plan);
        return ResponseEntity.ok(newPlan);
    }

    @GetMapping()
    public ResponseEntity<ArrayList<planEntity>> getAllPlans(){
        ArrayList<planEntity> PlanList = planService.getAllPlans();
        if(PlanList == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(PlanList);
    }

    @GetMapping("/byPlan/{codigoPlan}")
    public ResponseEntity<planEntity> getPlanById(@PathVariable("codigoPlan") int codigoPlan){
        planEntity plan = planService.buscarPlanPorId(codigoPlan);
        if(plan == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(plan);
    }

    @GetMapping("/byAsignatura/{codigoAsignatura}")
    public ResponseEntity<planEntity> getPlanByCodigoAsignatura(@PathVariable("codigoAsignatura") int codigoAsignatura){
        planEntity plan = planService.buscarCodigoAsignatura(codigoAsignatura);
        if(plan == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(plan);
    }
}
