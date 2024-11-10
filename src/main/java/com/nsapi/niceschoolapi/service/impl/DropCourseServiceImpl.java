package com.nsapi.niceschoolapi.service.impl;

import com.nsapi.niceschoolapi.entity.coursel;
import com.nsapi.niceschoolapi.mapper.DropCourseMapper;
import com.nsapi.niceschoolapi.service.DropCourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DropCourseServiceImpl implements DropCourseService {
    @Resource
    private DropCourseMapper dropCourseMapper;
    @Override
    public List<coursel> seledCourse(String cname, Integer sid) {
        return dropCourseMapper.seledCourse(cname,sid);
    }

    @Override
    public int dropcou(Integer sid, Integer cid) {
        return dropCourseMapper.dropcou(sid,cid);
    }

    @Override
    public int updatecou(Integer cid) {
        return dropCourseMapper.updatecou(cid);
    }
}
