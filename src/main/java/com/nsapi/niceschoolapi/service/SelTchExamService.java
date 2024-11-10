package com.nsapi.niceschoolapi.service;

import com.nsapi.niceschoolapi.entity.SelTchExamVO;

import java.util.List;
import java.util.Map;

public interface SelTchExamService {
    List<Map> selTchExam(SelTchExamVO selTchExamVO);
}
