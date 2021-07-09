package com.zl.happys.service.impl;

import com.zl.happys.entity.Person;
import com.zl.happys.mapper.PersonMapper;
import com.zl.happys.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {
	
	@Autowired
	private PersonMapper personMapper;
	
	public List<Person> queryList() {
		return personMapper.queryList();
	}

}
