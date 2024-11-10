package com.nsapi.niceschoolapi.mapper;

import com.nsapi.niceschoolapi.entity.StudentDB;
import com.nsapi.niceschoolapi.entity.pageCount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DropoutMapper {
    //  查询所有退学信息
    List<Map> selDropout(Map<String,Object> map);
    //  查询所有信息数量
    int selDropoutCount(StudentDB studentDB);
}
