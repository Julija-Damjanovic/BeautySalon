package beautysalon.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import beautysalon.app.model.Person;
import beautysalon.app.service.PersonService;


@Controller
public class PersonController {
	@Autowired
	private PersonService personService;

   //display list of appointments
	@GetMapping("/")
	public String view(Model model) {
		model.addAttribute("listAppointments", personService.getAllPersons());
		return "appointments";
	}
	@GetMapping("/showNewPersonForm")
	public String showNewPersonForm(Model model){
		//create model attribute to bind form data 
		Person person = new Person();
		model.addAttribute("person", person);
		
		
		return "new_person";
	}
	
	@PostMapping("/savePerson")
	public String savePerson(@ModelAttribute("person") Person person) {
	personService.savePerson(person);
	return "redirect:/";
}
	
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value="id") long id,Model model) {
		//get employee from the service 
		Person person = personService.getPersonById(id);
		// set employee as a model attribute  to pre-populate the form 
		model.addAttribute("person",person);
		return "update_person";
	}
	
	
	
	
	
	
	@GetMapping("/deletePerson/{id}")
	public String deletePerson(@PathVariable(value="id") long id) {
		//call delete employee method
		this.personService.deletePersonById(id);
		return "redirect:/";
	}
	
	
}
