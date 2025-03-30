package com.universidad.controller;

import com.universidad.dto.EstudianteDTO;
import com.universidad.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EstudianteController {

    private final IEstudianteService estudianteService;

    @Autowired
    public EstudianteController(IEstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    // Obtener todos los estudiantes
    @GetMapping("/estudiantes")
    public ResponseEntity<List<EstudianteDTO>> obtenerTodosLosEstudiantes() {
        List<EstudianteDTO> estudiantes = estudianteService.obtenerTodosLosEstudiantes();
        return ResponseEntity.ok(estudiantes);
    }

    // Obtener un estudiante por ID
    @GetMapping("/estudiantes/{id}")
    public ResponseEntity<EstudianteDTO> obtenerEstudiantePorId(@PathVariable Long id) {
        EstudianteDTO estudiante = estudianteService.obtenerEstudiantePorId(id);
        if (estudiante == null) {
            return ResponseEntity.notFound().build(); // Retorna 404 si no se encuentra el estudiante
        }
        return ResponseEntity.ok(estudiante);
    }

    // Crear un nuevo estudiante
    @PostMapping("/estudiantes")
    public ResponseEntity<EstudianteDTO> crearEstudiante(@RequestBody EstudianteDTO estudianteDTO) {
        EstudianteDTO estudianteCreado = estudianteService.crearEstudiante(estudianteDTO);
        return ResponseEntity.status(201).body(estudianteCreado); // HTTP 201 Created
    }

    // Actualizar un estudiante existente
    @PutMapping("/estudiantes/{id}")
    public ResponseEntity<EstudianteDTO> actualizarEstudiante(@PathVariable Long id, @RequestBody EstudianteDTO estudianteDTO) {
        EstudianteDTO estudianteActualizado = estudianteService.actualizarEstudiante(id, estudianteDTO);
        if (estudianteActualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(estudianteActualizado); // HTTP 200 OK
    }

    // Eliminar un estudiante por ID
    @DeleteMapping("/estudiantes/{id}")
    public ResponseEntity<Void> eliminarEstudiante(@PathVariable Long id) {
        boolean eliminado = estudianteService.eliminarEstudiante(id);
        if (!eliminado) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build(); // HTTP 204 No Content
    }
}
