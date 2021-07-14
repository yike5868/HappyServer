package com.zl.happys.service;

import com.zl.happys.entity.Classgrade;
import com.zl.happys.entity.Classlesson;
import com.zl.happys.entity.Classname;
import com.zl.happys.entity.Gradeclass;

import java.util.List;

public interface IClassService {
    List<Classgrade> listClassGrade();
    List<Classname> listClassName();
    List<Classlesson> listClassLesson();
}
