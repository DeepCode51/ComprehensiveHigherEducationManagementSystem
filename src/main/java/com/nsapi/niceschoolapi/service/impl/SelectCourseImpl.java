package com.nsapi.niceschoolapi.service.impl;

import com.nsapi.niceschoolapi.entity.CourseTypeDB;
import com.nsapi.niceschoolapi.entity.SelectCourseVo;
import com.nsapi.niceschoolapi.entity.StuCourseDB;
import com.nsapi.niceschoolapi.entity.StudentDB;
import com.nsapi.niceschoolapi.mapper.SelectCourseMapper;
import com.nsapi.niceschoolapi.service.SelectCourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SelectCourseImpl implements SelectCourseService {
@Resource
private SelectCourseMapper selectCourseMapper;

    //查询开设课程
    @Override
    public List<SelectCourseVo> sel(SelectCourseVo selectCourseVo) {
        return selectCourseMapper.sel(selectCourseVo);
    }
//查询课程类型
    @Override
    public List<CourseTypeDB> selType() {
        return selectCourseMapper.selType();
    }
    //查询学生id
    @Override
    public StudentDB selStudentid(String stuid) {
        return selectCourseMapper.selStudentid(stuid);
    }

    //查询是否有该课程
    @Override
    public int selCourse(StuCourseDB stuCourseDB) {
        return selectCourseMapper.selCourse(stuCourseDB);
    }
//添加课程
    @Override
    public int addCourse(StuCourseDB stuCourseDB) {
        return selectCourseMapper.addCourse(stuCourseDB);
    }
//修改可选人数
    @Override
    public int updateCount(StuCourseDB stuCourseDB) {
        return selectCourseMapper.updateCount(stuCourseDB);
    }



}
