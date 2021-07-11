package com.zl.happys.controller;

import com.zl.happys.entity.Classgrade;
import com.zl.happys.entity.Classname;

import java.util.List;

public class ResultModel<T>  {

    private List<Classgrade> classgradeList;
    private List<Classname> classnameList;

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


}
