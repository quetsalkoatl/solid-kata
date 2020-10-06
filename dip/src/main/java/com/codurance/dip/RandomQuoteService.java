package com.codurance.dip;

import java.util.List;
import java.util.Random;

public class RandomQuoteService {

    private final FileQuoteList quote = new FileQuoteList();

    public String getRandomQuote() {
        List<String> quoteList = quote.getQuoteList();
        Random random = new Random();
        int index = random.nextInt(quoteList.size());
        return quoteList.get(index);
    }
}
