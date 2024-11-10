package com.nsapi.niceschoolapi.service;

import com.nsapi.niceschoolapi.entity.SelAllExamVO;

import java.util.List;
import java.util.Map;

public interface SelAllExamService {
    List<Map> selAllExam(SelAllExamVO selAllExamVO);
}
