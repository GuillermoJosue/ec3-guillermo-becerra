package ec3guillermobecerra.demo;

import org.springframework.data.repository.CrudRepository;
//Nuevos import
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;



@RepositoryRestResource(collectionResourceRel = "instrumentos", path = "instrumentos")
public interface InstrumentoRepository extends PagingAndSortingRepository<Instrumento, Integer>, CrudRepository<Instrumento, Integer> {

    //agregar una Lista de Cursos
    List<Instrumento> findByNombre(@Param("nombre") String nombre);

}