package com.nsapi.niceschoolapi.service;

import com.nsapi.niceschoolapi.entity.ScheduleDB;

import java.util.List;

public interface ScheduleService {
    List<ScheduleDB> findAllSchedule(ScheduleDB scheduleDB);
    /*int deleteNews(Integer nId);
    int addNews(NewsDB news);
    int editNews(NewsDB news);*/
}