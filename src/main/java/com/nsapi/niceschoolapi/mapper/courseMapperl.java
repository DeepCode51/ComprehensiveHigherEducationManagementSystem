package com.nsapi.niceschoolapi.mapper;

import com.nsapi.niceschoolapi.entity.CourseTypeDB;
import com.nsapi.niceschoolapi.entity.MajorDB;
import com.nsapi.niceschoolapi.entity.coursel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface courseMapperl {
    List<coursel> selCourse(coursel coursel);
    List<MajorDB> selJson();
    List<CourseTypeDB> selCoutu();
    int update(coursel coursel);
    int addcou(coursel coursel);
    int delcou(Integer cid);
    int hfcou(Integer cid);
    int delercou(Integer cid);
}
