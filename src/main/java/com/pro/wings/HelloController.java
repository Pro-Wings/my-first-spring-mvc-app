package com.pro.wings;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello.htm")
	public ModelAndView hello(@RequestParam("name") String name) throws Exception {

		ModelAndView mv = new ModelAndView();

		// name of JSP page
		mv.setViewName("welcome");

		// data that you want to show on JSP in form of key and value
		mv.addObject("name", name);

		return mv;
	}
}
