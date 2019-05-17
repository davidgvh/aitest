package org.flvc.doit.aitest.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
	private static Logger logger = LoggerFactory.getLogger(WebController.class);

	@RequestMapping(value = { "/index.html" })
	public ModelAndView homeAction(HttpServletRequest request) {
		logger.trace("entering");

		logger.info("Home action called.");

		return new ModelAndView("index");
	}

	@RequestMapping(value = { "/warning.html" })
	public ModelAndView warningAction(HttpServletRequest request) {
		logger.trace("entering");

		logger.warn("Warning action requested.");

		return new ModelAndView("warning");
	}

	@RequestMapping(value = { "/error.html" })
	public ModelAndView errorAction(HttpServletRequest request) {
		logger.trace("entering");

		logger.error("Error action requested.");

		return new ModelAndView("error");
	}

	@RequestMapping(value = { "/critical.html" })
	public ModelAndView criticalAction(HttpServletRequest request) throws Exception {
		logger.trace("entering");

		try {
			throw new Exception("Critical failure.");
		} catch (Exception ex) {
			logger.error("caught exception", ex);

			throw ex;
		}
	}
}
