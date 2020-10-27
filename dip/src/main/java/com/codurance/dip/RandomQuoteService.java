package com.codurance.dip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class RandomQuoteService {

    private final QuoteList quoteList;

    @Autowired
    public RandomQuoteService(QuoteList quoteList) {
        this.quoteList = quoteList;
    }

    public String getRandomQuote() {
        List<String> quotes = quoteList.getQuoteList();
        Random random = new Random();
        int index = random.nextInt(quotes.size());
        return quotes.get(index);
    }
}
