package com.nsapi.niceschoolapi.service.impl;

import com.nsapi.niceschoolapi.entity.SelTchExamVO;
import com.nsapi.niceschoolapi.mapper.SelTchExamMapper;
import com.nsapi.niceschoolapi.service.SelTchExamService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class selTchExamServiceImpl implements SelTchExamService {
    @Resource
    private SelTchExamMapper selTchExamMapper;

    @Override
    public List<Map> selTchExam(SelTchExamVO selTchExamVO) {
        return selTchExamMapper.selTchExam(selTchExamVO);
    }
}
