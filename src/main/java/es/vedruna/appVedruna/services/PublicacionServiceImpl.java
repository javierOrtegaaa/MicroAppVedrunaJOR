package es.vedruna.appVedruna.services;

import es.vedruna.appVedruna.model.Publicacion;
import es.vedruna.appVedruna.repository.PuplicacionesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PublicacionServiceImpl implements PublicacionService{

    private final PuplicacionesRepository puplicacionesRepository;
    // Obtener todas las publicaciones
    public List<Publicacion> getAllPublicaciones() {
        return puplicacionesRepository.findAllByOrderByCreatedAtDesc();
    }

    @Override
    public Publicacion createPublicacion(Publicacion publicacion) {
        return puplicacionesRepository.save(publicacion);
    }

    @Override
    public Publicacion updatePublicacion(String id, int like) {
        Optional<Publicacion> publicacionOptional = puplicacionesRepository.findById(id);
        
        if(publicacionOptional.isPresent()){
            Publicacion publicacion = publicacionOptional.get();
            publicacion.setLikes(like);
            return puplicacionesRepository.save(publicacion);
        }else {
            throw new RuntimeException("Publicacion no encontrada");
        }
    }
}
