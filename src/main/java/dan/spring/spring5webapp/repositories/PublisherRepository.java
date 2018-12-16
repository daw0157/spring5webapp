package dan.spring.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import dan.spring.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
