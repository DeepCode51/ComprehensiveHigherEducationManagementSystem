package com.nsapi.niceschoolapi.service.impl;

import com.nsapi.niceschoolapi.entity.*;
import com.nsapi.niceschoolapi.mapper.StuExamMapper;
import com.nsapi.niceschoolapi.service.StudentExamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentExamImpl implements StudentExamService {
@Resource
private StuExamMapper stuExamMapper;

    @Override
    public List<DepartmentDB> selDes() {
        return stuExamMapper.selDes();
    }

    @Override
    public List<MajorDB> selMas(Integer did) {
        return stuExamMapper.selMas(did);
    }

    @Override
    public List<GradeDB> selGrs(Integer mid) {
        return stuExamMapper.selGrs(mid);
    }

    @Override
    public List<ClassinfoDB> selClasss(Integer gid) {
        return stuExamMapper.selClasss(gid);
    }

    @Override
    public List<StuExamVO> selScs(StuExamVO stuExamVO) {
        return stuExamMapper.selScs(stuExamVO);
    }

    @Override
    public int add(StuExamVO stuExamVO) {
        return stuExamMapper.add(stuExamVO);
    }

    @Override
    public int selExam(StuExamVO stuExamVO) {
        return stuExamMapper.selExam(stuExamVO);
    }


    @Override
    public int updateExam(StuExamDB stuExamDB) {
        return stuExamMapper.updateExam(stuExamDB);
    }
}
