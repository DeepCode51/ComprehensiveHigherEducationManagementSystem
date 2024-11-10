package com.nsapi.niceschoolapi.service.impl;

import com.nsapi.niceschoolapi.entity.NewsinfoDB;
import com.nsapi.niceschoolapi.mapper.NewsMapper;
import com.nsapi.niceschoolapi.service.NewsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsMapper newsMapper;
    @Override
    public List<NewsinfoDB> findAllNews(NewsinfoDB newsinfoDB) {
        return newsMapper.findAllNews(newsinfoDB);
    }

    @Override
    public int deleteNews(Integer nId) {
        return newsMapper.deleteNews(nId);
    }

    @Override
    public int addNews(NewsinfoDB newsinfoDB) {
        return newsMapper.addNews(newsinfoDB);
    }

    @Override
    public int editNews(NewsinfoDB newsinfoDB) {
        return newsMapper.editNews(newsinfoDB);
    }
}