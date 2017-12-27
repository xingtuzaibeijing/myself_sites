package org.qhs.myselfSites.dome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Firstweb {
	@RequestMapping("/Firstweb1")
	public String Firstweb1(ModelMap modelMap) {
		modelMap.put("name", "springboot");
		return "index";
	}
}
