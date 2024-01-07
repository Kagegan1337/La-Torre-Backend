package de.kagegan.latorrebackend.controller;

import de.kagegan.latorrebackend.model.dto.ArticleDto;
import de.kagegan.latorrebackend.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping()
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping(value = "article/all", produces = "Application/json")
    public ResponseEntity<?> getAllArticles() {
        List<ArticleDto> result = articleService.getAllArticles();
        return new ResponseEntity<>(result, HttpStatusCode.valueOf(200));
    }
}