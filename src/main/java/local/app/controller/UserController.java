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
public class UserController {
	
	private static Logger LOGGER = LogManager.getLogger(UserController.class);

	@Autowired
	UserRepository repository;
	
    @GetMapping("/add")
    public String addUser(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    	LOGGER.info("adding user in db");
    	repository.save(new AppUser(1, name));
    	
        model.addAttribute("name", name);
        return "added";
    }

}