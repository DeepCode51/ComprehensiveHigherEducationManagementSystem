package com.nsapi.niceschoolapi.service.impl;

import com.nsapi.niceschoolapi.entity.ScheduleDB;
import com.nsapi.niceschoolapi.mapper.ScheduleMapper;
import com.nsapi.niceschoolapi.service.ScheduleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService {
    @Resource
    private ScheduleMapper scheduleMapper;

    @Override
    public List<ScheduleDB> findAllSchedule(ScheduleDB scheduleDB) {
        return scheduleMapper.findAllSchedule(scheduleDB);
    }
}