package com.codurance.dip;

public class Application {

    public static void main(String[] args) {
        QuoteList quoteList = new FileQuoteList();
        RandomQuoteService randQ = new RandomQuoteService(quoteList);
        System.out.println(randQ.getRandomQuote());
    }
}