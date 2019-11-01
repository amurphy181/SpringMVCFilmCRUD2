package com.skilldistillery.film.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FilmController {
	
	@RequestMapping(path = "goHome.do")
	public String goHome() {
		return "info.jsp";
	}

}
