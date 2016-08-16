package com.joeu.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.joeu.tutorial.model.BoozeModel;
import com.joeu.tutorial.repository.BoozeStorage;

@Controller
@RequestMapping("/booze")
public class BoozeController {

	@Autowired
	private BoozeStorage boozeStorage;

	@RequestMapping
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView("BoozeList");
		mv.addObject("boozeStorage", boozeStorage.listAll());
		mv.addObject(new BoozeModel());
		return mv;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String addBooze(BoozeModel booze) {
		this.boozeStorage.addBooze(booze);
		return "redirect:/booze";
	}

}
