package com.codurance.dip;

public class Application {

    public static void main(String[] args) {
        RandomQuoteService randQ = new RandomQuoteService();
        System.out.println(randQ.getRandomQuote());
    }
}