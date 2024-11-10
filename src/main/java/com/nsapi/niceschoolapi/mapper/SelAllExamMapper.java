package com.nsapi.niceschoolapi.mapper;

import com.nsapi.niceschoolapi.entity.SelAllExamVO;

import java.util.List;
import java.util.Map;

public interface SelAllExamMapper {
    List<Map> selAllExam(SelAllExamVO selAllExamVO);
}
