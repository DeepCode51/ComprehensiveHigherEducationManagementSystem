package com.nsapi.niceschoolapi.service;

import com.nsapi.niceschoolapi.entity.coursel;

import java.util.List;

public interface DropCourseService {
    List<coursel> seledCourse(String cname, Integer sid);
    int dropcou(Integer sid, Integer cid);
    int updatecou(Integer cid);
}
