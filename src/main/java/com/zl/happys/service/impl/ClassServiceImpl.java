package com.zl.happys.service.impl;

import com.zl.happys.entity.Classgrade;
import com.zl.happys.entity.Classname;
import com.zl.happys.entity.Gradeclass;
import com.zl.happys.mapper.ClassMapper;
import com.zl.happys.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements IClassService {
    @Autowired
    ClassMapper classMapper;
    @Override
    public List<Classgrade> listClassGrade() {
        return classMapper.listClassGrade();
    }

    @Override
    public List<Classname> listClassName() {
        return classMapper.listClassName();
    }
}
