package com.nsapi.niceschoolapi.service.impl;

import com.nsapi.niceschoolapi.entity.TchSelStuExamVO;
import com.nsapi.niceschoolapi.mapper.TchSelStuExamMapper;
import com.nsapi.niceschoolapi.service.TchSelStuExamService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class TchSelStuExamServiceImpl implements TchSelStuExamService {

    @Resource
    private TchSelStuExamMapper tchSelStuExamMapper;

    @Override
    public List<Map> selTchClass(String tid) {
        return tchSelStuExamMapper.selTchClass(tid);
    }

    @Override
    public List<Map> tchSelStuExam(TchSelStuExamVO tchSelStuExamVO) {
        return tchSelStuExamMapper.tchSelStuExam(tchSelStuExamVO);
    }

    @Override
    public List<Map> selTchGrade(String tid) {
        return tchSelStuExamMapper.selTchGrade(tid);
    }

}
