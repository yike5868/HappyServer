package com.zl.happys.mapper;

import com.zl.happys.entity.Persion;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper {

	List<Persion> queryList();
		
}
