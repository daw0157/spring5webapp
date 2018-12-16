package dan.spring.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dan.spring.spring5webapp.repositories.BookRespository;

@Controller
public class BookController {
	
	private BookRespository bookRespository;
	
	public BookController(dan.spring.spring5webapp.repositories.BookRespository bookRespository) {
		super();
		this.bookRespository = bookRespository;
	}

	@RequestMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", bookRespository.findAll());
		
		return "books";
	}

}
