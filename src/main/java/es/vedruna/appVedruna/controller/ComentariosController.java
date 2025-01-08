package es.vedruna.appVedruna.controller;

import es.vedruna.appVedruna.model.Comentario;
import es.vedruna.appVedruna.services.ComentarioServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyecto01/comentarios")
@AllArgsConstructor
public class ComentariosController {
    private ComentarioServiceImpl comentarioServiceImpl;

    @PostMapping()
    public Comentario createComentario(@RequestBody Comentario comentario) {
        return comentarioServiceImpl.crearComentario(comentario);
    }
}
