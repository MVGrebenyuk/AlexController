package com.burminsky.AlexController.Services;

import com.burminsky.AlexController.entities.News;
import com.burminsky.AlexController.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    public NewsRepository newsRepository;

    @Autowired
    public void setNewsRepository(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    public News addNews(News news){
        return newsRepository.saveAndFlush(news);
    }

    public List<News> findAll(){
        return newsRepository.findAll();
    }
}
