package org.flvc.doit.aitest.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
	@RequestMapping(value = { "/index.html" })
	public ModelAndView homeAction(HttpServletRequest request) {
		return new ModelAndView("index");
	}

	@RequestMapping(value = { "/warning.html" })
	public ModelAndView warningAction(HttpServletRequest request) {
		return new ModelAndView("warning");
	}

	@RequestMapping(value = { "/error.html" })
	public ModelAndView errorAction(HttpServletRequest request) {
		return new ModelAndView("error");
	}

	@RequestMapping(value = { "/critical.html" })
	public ModelAndView criticalAction(HttpServletRequest request) throws Exception {
		throw new Exception("Critical failure.");
	}
}
