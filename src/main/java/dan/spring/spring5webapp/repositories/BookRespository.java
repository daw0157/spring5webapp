package dan.spring.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import dan.spring.spring5webapp.model.Book;

public interface BookRespository extends CrudRepository<Book, Long> {

}
