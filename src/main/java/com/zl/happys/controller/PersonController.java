package com.zl.happys.controller;

import com.zl.happys.entity.Persion;
import com.zl.happys.service.IPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
//rizhi
@Slf4j
@Controller
@RequestMapping(value = "persion")
public class PersonController {
	
	@Autowired
	private IPersonService personService;
	
	@RequestMapping(value = "list")
	public String queryList(Model model) {
		List<Persion> persons = personService.queryList();
		model.addAttribute("persons", persons);
		log.info(persons.toString());
		return "public/404";
	}
}
