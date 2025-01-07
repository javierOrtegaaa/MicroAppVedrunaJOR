package es.vedruna.appVedruna.services;

import es.vedruna.appVedruna.model.Publicacion;

import java.util.List;

public interface PublicacionService {
    public List<Publicacion> getAllPublicaciones();
    public Publicacion createPublicacion(Publicacion publicacion);
    public Publicacion updatePublicacion(String id, int like);
}
