package co.ucentral.diana.apibackendrondApp.persistencia.entidad.repositorio;

import co.ucentral.diana.apibackendrondApp.persistencia.entidad.Grupo;
import co.ucentral.diana.apibackendrondApp.persistencia.entidad.Tendero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GrupoRepositorio extends JpaRepository<Grupo, Long> {
    Optional<Grupo> findByCodigo(String codigo);
}