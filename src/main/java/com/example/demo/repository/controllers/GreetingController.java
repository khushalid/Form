package com.example.demo.repository.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Greeting;
import com.example.demo.repository.GreetingRepository;

@Controller
public class GreetingController {
	
	@Autowired
	GreetingRepository greetingRepository;
	
	@RequestMapping("/greeting")
    public String home(Model model) {
        model.addAttribute("greetingList", greetingRepository.findAll());
        return "greeting";
    }

    @RequestMapping(value = "/greeting", method = RequestMethod.POST)
    public String addUser(@ModelAttribute Greeting greeting) {
        greetingRepository.save(greeting);
        return "redirect:greeting";
    }

}
