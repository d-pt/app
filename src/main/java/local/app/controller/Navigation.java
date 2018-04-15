package local.app.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import local.app.entity.AppUser;
import local.app.entity.UserRepository;

@Controller
public class Navigation {
	
	private static Logger LOGGER = LogManager.getLogger(Navigation.class);
	
    @GetMapping("/")
    public String addUser(Model model) {
    
        return "redirect:home";
    }
    
    @GetMapping("/home")
    public String goHome(Model model) {
    	
    	return "home";
    }
    
    @GetMapping("/comment")
    public String goComment(Model model) {
    	return "comment";
    }

}