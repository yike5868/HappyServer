package com.zl.happys.controller;

import com.zl.happys.entity.Person;
import com.zl.happys.service.IPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
//日志相关
@Slf4j
@Controller
@RequestMapping(value = "person")
public class PersonController {
	
	@Autowired
	private IPersonService personService;
	
	@RequestMapping(value = "list")
	public String queryList(Model model) {
		List<Person> persons = personService.queryList();
		model.addAttribute("persons", persons);
		log.info(persons.toString());
		return "index";
	}
}
