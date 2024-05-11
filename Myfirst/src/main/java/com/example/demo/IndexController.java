package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class IndexController {

	@RequestMapping("/")
	
	public ModelAndView index(UserDetails ud) {
//		HttpSession session=request.getSession();
//		String s=request.getParameter("name");
//		session.setAttribute("uname", login);
		ModelAndView mav=new ModelAndView();
		mav.addObject("uname",ud);
		mav.setViewName("index");
		return mav;
	}
}
