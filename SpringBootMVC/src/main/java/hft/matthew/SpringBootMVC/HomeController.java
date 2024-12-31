package hft.matthew.SpringBootMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import hft.matthew.SpringBootMVC.model.Programmer;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	@Autowired
	ProgrammerRepo repo;
	
	@RequestMapping("/")
	public String home() {
		//use the application.properties folder within resources to set the suffix/prefix for accessing the jsp files for views
		return "index";
	}
	
	/*
	@RequestMapping("add")
	public String add(@RequestParam("num1")int i,@RequestParam("num2") int j, Model m) {
	
		//can use model or ModelAndView or ModelMap
		//ModelMap allows you to have the information within a map format
		
		int num3 = i+j;
		m.addAttribute("num3", num3);

		
		return "result";
	}
	*/
	
	@PostMapping("addProgrammer")
	public String addProgrammer(@ModelAttribute Programmer p, Model m) {
		//updated to use ModelAttribute that helps minimize code
		//this initializes the object instance and automatically adds it to the model as well

		repo.save(p);
		m.addAttribute("p1",p);
		//m.addAttribute("name","Programmers");
		return "result";
	}
	
	
	@GetMapping("getProgrammers")
	public String getProgrammers(Model m) {
		
		m.addAttribute("result",repo.findAll());
		
		return "showProgrammers";
	}
	
	@GetMapping("getProgrammer")
	public String getProgrammer(@RequestParam int id,Model m) {
		Programmer programmer = repo.findById(id).orElse(null); // Use findById
	    m.addAttribute("result", programmer);
	    return "showProgrammer";
	}

}
