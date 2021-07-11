package com.zl.happys.mapper;

import com.zl.happys.entity.Classgrade;
import com.zl.happys.entity.Classname;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassMapper {
    List<Classgrade> listClassGrade();
    List<Classname> listClassName();
}
