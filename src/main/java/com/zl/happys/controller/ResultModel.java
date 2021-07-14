package com.zl.happys.controller;

import com.zl.happys.entity.Classgrade;
import com.zl.happys.entity.Classlesson;
import com.zl.happys.entity.Classname;

import java.util.List;

public class ResultModel<T>  {

    private List<Classgrade> classgradeList;
    private List<Classname> classnameList;

    private List<Classlesson> classlessonList;

    public List<Classgrade> getClassgradeList() {
        return classgradeList;
    }

    public void setClassgradeList(List<Classgrade> classgradeList) {
        this.classgradeList = classgradeList;
    }

    public List<Classname> getClassnameList() {
        return classnameList;
    }

    public void setClassnameList(List<Classname> classnameList) {
        this.classnameList = classnameList;
    }

    public List<Classlesson> getClasslessonList() {
        return classlessonList;
    }

    public void setClasslessonList(List<Classlesson> classlessonList) {
        this.classlessonList = classlessonList;
    }

}
