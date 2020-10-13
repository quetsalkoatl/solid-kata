package com.codurance.dip;

import java.util.List;

public class MockQuoteList implements QuoteList {

    @Override
    public List<String> getQuoteList() {
        return List.of("This is a Test!");
    }
}
