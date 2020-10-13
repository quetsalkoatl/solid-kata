package com.codurance.dip;

import java.util.List;
import java.util.Random;

public class RandomQuoteService {

    private final QuoteList quoteList;

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
