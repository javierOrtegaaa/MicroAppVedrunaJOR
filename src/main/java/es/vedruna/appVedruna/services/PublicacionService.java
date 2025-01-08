package es.vedruna.appVedruna.services;

import es.vedruna.appVedruna.model.Publicacion;

import java.util.List;

public interface PublicacionService {
    List<Publicacion> getAllPublicaciones();
    Publicacion createPublicacion(Publicacion publicacion);
    Publicacion updateLike(String id_publicacion, String id_user);
}
