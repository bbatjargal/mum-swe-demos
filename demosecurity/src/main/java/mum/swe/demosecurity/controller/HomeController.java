package mum.swe.demosecurity.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.swe.demosecurity.model.User;
import mum.swe.demosecurity.service.UserService;


@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Principal currentUser, Model model){
		
    	User user = userService.findByUsername(currentUser.getName());		
		model.addAttribute("userName", user.getUsername());	
    	
		return "home/index";
	}
}
