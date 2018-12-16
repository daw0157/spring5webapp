package dan.spring.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dan.spring.spring5webapp.repositories.AuthorRepository;

@Controller
public class AuthorController {
	
	private AuthorRepository authorRepostiroy;

	public AuthorController(AuthorRepository authorRepostiroy) {
		super();
		this.authorRepostiroy = authorRepostiroy;
	}
	
	@RequestMapping("/authors")
	public String getAuthors(Model model) {
		model.addAttribute("authors", authorRepostiroy.findAll());
		
		return "authors";
	}
	
}
