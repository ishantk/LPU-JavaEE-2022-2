package com.auribises.session19;

import java.util.Date;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.auribises.model.User;

@Controller
@RequestMapping(path = "/app")
public class AppController {
	
	static HashMap<String, User> users = new HashMap<String, User>();
	
	// The method welcomePage will be executed automatically whenever we will
	// hit welcome as url pattern :)
	@GetMapping("/welcome")
	public String welcomePage() {
		// welcomePage returns a String welcome, which basically is the name of HTML Web Page :)
		// which can be found in the templates directory :)
		return "welcome";
	}
	
	@GetMapping("/home-page")
	public String homePage(Model model) {
		
		// We can add any data in Model Object :)
		model.addAttribute("appName", "eStore - Web App");
		
		return "home"; // look for home.html in templates and return the same :)
	}
	
	@PostMapping("/register")
	public String registerUser(@RequestParam String name, @RequestParam String email, @RequestParam String password, Model model) {
		
		User user = new User(name, email, password);
		users.put(email, user);
		
		model.addAttribute("title", "Thank You "+name);
		model.addAttribute("message", name+" Registered Successfully at "+new Date()+" with email "+email);
		
		return "success";
		
	}
	
	@PostMapping("/login")
	public String loginUser(@RequestParam String email, @RequestParam String password, Model model) {
		
		String page = "";
		
		if(users.containsKey(email)) {
			
			User user = users.get(email);
			if(user.getPassword().equalsIgnoreCase(password)) {
				model.addAttribute("title", "Thank You "+user.getName());
				model.addAttribute("message", user.getName()+" Logged in Successfully at "+new Date()+" with email "+email);
				page = "success";
			}else {
				model.addAttribute("title", "Invalid Credentials");
				model.addAttribute("message", "Please Try Again !!");
				page = "error";
			}
		}else {
				model.addAttribute("title", "Invalid Registration");
				model.addAttribute("message", "Please Register First !!");
				page = "error";
		}
		
		return page;
		
	}

}
