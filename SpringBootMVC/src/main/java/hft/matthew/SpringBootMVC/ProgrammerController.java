package hft.matthew.SpringBootMVC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import hft.matthew.SpringBootMVC.model.Programmer;

@Controller
public class ProgrammerController {
	
	@Autowired
	ProgrammerRepo repo;
	

	//fetching all records
	//setting the path and what the user/client will receive/what format they are allowed to receive
	@GetMapping(path="programmers", produces= {"application/json"})
	@ResponseBody
	public List<Programmer> getProgrammers() {
		
		List<Programmer> programmers = repo.findAll();
		
		return programmers;
	}
	
	//fetching one particular record
	@GetMapping("programmer/{id}")
	@ResponseBody
	public Programmer getProgrammer(@PathVariable("id") int id) {
		
		Programmer p = repo.findById(id).orElse(null);
		return p;
		
	}
	
	
	@PostMapping("programmer")
	public Programmer addProgrammer(@RequestBody Programmer p) {
		repo.save(p);
		return p;
		
	}
	
}
