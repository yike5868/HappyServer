package com.zl.happys.mapper;

import com.zl.happys.entity.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper {

	List<Person> queryList();
		
}
