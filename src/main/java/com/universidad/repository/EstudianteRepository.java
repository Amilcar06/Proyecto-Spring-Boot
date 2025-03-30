package com.universidad.repository; // Define el paquete al que pertenece esta clase

import com.universidad.model.Estudiante; // Importa la clase Estudiante del paquete model
import org.springframework.stereotype.Repository; // Importa la anotación Repository de Spring

import java.time.LocalDate; // Importa la clase LocalDate para manejar fechas
import java.util.ArrayList; // Importa la clase ArrayList para manejar listas
import java.util.List; // Importa la interfaz List para manejar listas
import java.util.Map; // Importa la interfaz Map para manejar mapas
import java.util.concurrent.ConcurrentHashMap; // Importa la clase ConcurrentHashMap para manejar mapas concurrentes
import java.util.concurrent.atomic.AtomicLong; // Importa la clase AtomicLong para manejar contadores atómicos

@Repository
public class EstudianteRepository {

    private final Map<Long, Estudiante> estudiantes = new ConcurrentHashMap<>();
    private final AtomicLong idContador = new AtomicLong(1);

    public Estudiante save(Estudiante estudiante) {
        if (estudiante.getId() == null) {
            estudiante.setId(idContador.getAndIncrement());
        }
        estudiantes.put(estudiante.getId(), estudiante);
        return estudiante;
    }

    public List<Estudiante> findAll() {
        return new ArrayList<>(estudiantes.values());
    }

    public Estudiante findById(Long id) {
        return estudiantes.get(id);
    }

    public void deleteById(Long id) {
        estudiantes.remove(id);
    }

    public void init() {
        Estudiante estudiante1 = Estudiante.builder()
                .nombre("Juan")
                .apellido("Pérez")
                .email("juan.perez@example.com")
                .fechaNacimiento(LocalDate.of(2000, 5, 15))
                .numeroInscripcion("S001")
                .build();

        Estudiante estudiante2 = Estudiante.builder()
                .nombre("María")
                .apellido("González")
                .email("maria.gonzalez@example.com")
                .fechaNacimiento(LocalDate.of(2001, 8, 22))
                .numeroInscripcion("S002")
                .build();

        Estudiante estudiante3 = Estudiante.builder()
                .nombre("Manuel")
                .apellido("Lopez")
                .email("manuel.lopez@example.com")
                .fechaNacimiento(LocalDate.of(2004, 8, 6))
                .numeroInscripcion("S003")
                .build();

        save(estudiante1);
        save(estudiante2);
        save(estudiante3);
    }
}

