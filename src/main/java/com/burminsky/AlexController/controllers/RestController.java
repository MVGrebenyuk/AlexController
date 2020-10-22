package com.burminsky.AlexController.controllers;

import com.burminsky.AlexController.Services.NewsService;
import com.burminsky.AlexController.entities.News;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/addNews/v1")
@AllArgsConstructor
public class RestController {

    @Autowired
    public NewsService newsService;

    @GetMapping
    public List<News> getAllProducts() {
        List<News> content = newsService.findAll();
        return content;
    }

    @PostMapping(consumes = "application/json")
    public News addNews(@RequestBody News news){
        System.out.println("Метод выполнился?");
       return newsService.addNews(news);
    }


}
