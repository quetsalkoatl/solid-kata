package com.codurance.dip;

public class Application {

    // https://examples.javacodegeeks.com/dependency-injection-java-example/
    // https://www.freecodecamp.org/news/a-quick-intro-to-dependency-injection-what-it-is-and-when-to-use-it-7578c84fa88f/

    public static void main(String[] args) {
        RandomQuoteService randQ = new RandomQuoteService();
        System.out.println(randQ.getRandomQuote());
    }

}
