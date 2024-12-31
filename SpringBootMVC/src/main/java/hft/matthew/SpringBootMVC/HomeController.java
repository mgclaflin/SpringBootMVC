package hft.matthew.SpringBootMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView add(@RequestParam("num1")int i,@RequestParam("num2") int j) {
		
		ModelAndView mv = new ModelAndView("result");
		
		int num3 = i+j;
		
		mv.addObject("num3", num3);

		
		return mv;
	}
	

}
