package com.t2208e.T2208E_Srping.controller;

import com.t2208e.T2208E_Srping.dto.ScoreDto;
import com.t2208e.T2208E_Srping.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PostMapping
    public void addScore(@RequestBody ScoreDto scoreDto) {
        scoreService.addScore(scoreDto);
    }
}
