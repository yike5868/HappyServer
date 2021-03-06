package com.zl.happys.controller;

import com.zl.happys.entity.Classgrade;
import com.zl.happys.entity.Classlesson;
import com.zl.happys.entity.Classname;
import com.zl.happys.service.IClassService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@Slf4j

@Controller
@RestController
@RequestMapping("/classes")
public class ClassController {
    @Autowired
    private IClassService iClassService;

    @RequestMapping(value = "/listClassGrade")
    public ResultJson listClassGrade(String classGradeId) {
        log.info(classGradeId);

        List<Classgrade> classgradeList = iClassService.listClassGrade();
        List<Classname> classnameList = iClassService.listClassName();
        List<Classlesson> classlessonList = iClassService.listClassLesson();
        ResultJson resultJson = new ResultJson();
        ResultModel resultModel = new ResultModel();
        resultModel.setClassgradeList(classgradeList);
        resultModel.setClassnameList(classnameList);
        resultModel.setClasslessonList(classlessonList);

        resultJson.setData(resultModel);
        return resultJson;
    }

    @RequestMapping(value = "listClassName")
    public List<Classname> listClassName() {
        return iClassService.listClassName();
    }

}
