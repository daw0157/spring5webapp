package dan.spring.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import dan.spring.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
