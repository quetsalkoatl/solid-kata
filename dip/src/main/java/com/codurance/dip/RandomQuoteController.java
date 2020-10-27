package com.codurance.dip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomQuoteController {

    private final RandomQuoteService randomQuoteService;

    @Autowired
    public RandomQuoteController(RandomQuoteService randomQuoteService) {
        this.randomQuoteService = randomQuoteService;
    }

    @RequestMapping("daily-quote")
    public String getDailyQuote() {
        return randomQuoteService.getRandomQuote();
    }
}
