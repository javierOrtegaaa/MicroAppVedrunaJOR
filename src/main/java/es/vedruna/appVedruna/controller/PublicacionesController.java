package es.vedruna.appVedruna.controller;


import es.vedruna.appVedruna.model.Publicacion;
import es.vedruna.appVedruna.services.PublicacionServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyecto01/publicaciones")
@AllArgsConstructor
public class PublicacionesController {
    
    private PublicacionServiceImpl publicacionServiceImpl;

    // Crear un nuevo usuario
    @PostMapping()
    public Publicacion createPublicacion(@RequestBody Publicacion publicacion) {
        return publicacionServiceImpl.createPublicacion(publicacion);
    }
    
    @PutMapping("/put/{id}/{like}")
    public Publicacion updatePublicacion(@PathVariable String id, @PathVariable int like){
        return publicacionServiceImpl.updatePublicacion(id, like);
    }
    // Obtener todos los usuarios
    @GetMapping()
    public List<Publicacion> getAllPublicaciones() {
        return publicacionServiceImpl.getAllPublicaciones();
    }
}
