package hft.matthew.SpringBootMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import hft.matthew.SpringBootMVC.model.Programmer;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		//use the application.properties folder within resources to set the suffix/prefix for accessing the jsp files for views
		return "index";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1")int i,@RequestParam("num2") int j, Model m) {
	
		//can use model or ModelAndView or ModelMap
		//ModelMap allows you to have the information within a map format
		
		int num3 = i+j;
		m.addAttribute("num3", num3);

		
		return "result";
	}
	
	@RequestMapping("addProgrammer")
	public String addProgrammer(@RequestParam("id")int id,@RequestParam("name") String name, Model m) {
	
		Programmer p = new Programmer();
		p.setId(id);
		p.setName(name);
		
		m.addAttribute("programmer",p);
		
		return "result";
	}
	

}
