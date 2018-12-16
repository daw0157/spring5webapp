package dan.spring.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dan.spring.spring5webapp.model.Author;
import dan.spring.spring5webapp.model.Book;
import dan.spring.spring5webapp.model.Publisher;
import dan.spring.spring5webapp.repositories.AuthorRepository;
import dan.spring.spring5webapp.repositories.BookRespository;
import dan.spring.spring5webapp.repositories.PublisherRepository;

@Component
public class DevBootstrap implements CommandLineRunner {

	private AuthorRepository authorRepository;
	private BookRespository bookRepository;
	private PublisherRepository publisherRepository;
	
	public DevBootstrap(AuthorRepository authorRepository, BookRespository bookRepository, PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		initData();
	}

	private void initData() {
		
		Publisher harperCollins = new Publisher("Harper Collins", "123 Smith Ave");
		publisherRepository.save(harperCollins);
		Publisher worx = new Publisher("Worx", "555 Worx Road");
		publisherRepository.save(worx);
		
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driven Design", "1234", harperCollins);
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		
		authorRepository.save(eric);
		bookRepository.save(ddd);
		
		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Deveelopment without EJB", "23444", worx);
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);
		
		authorRepository.save(rod);
		bookRepository.save(noEJB);
	}

}
