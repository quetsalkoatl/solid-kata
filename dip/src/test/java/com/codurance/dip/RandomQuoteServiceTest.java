package com.codurance.dip;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RandomQuoteServiceTest {

    @Mock
    private QuoteList quoteList;

    @Before
    public void init() {
        when(quoteList.getQuoteList()).thenReturn(List.of("This is a Test!"));
    }

    @Test
    public void getRandomQuoteManual() {
        QuoteList quoteList = new MockQuoteList();
        RandomQuoteService quoteService = new RandomQuoteService(quoteList);
        assertThat(quoteService.getRandomQuote()).isEqualTo("This is a Test!");
    }

    @Test
    public void getRandomQuoteMockito() {
        QuoteList quoteList = mock(QuoteList.class);
        when(quoteList.getQuoteList()).thenReturn(List.of("This is a Test!"));
        RandomQuoteService quoteService = new RandomQuoteService(quoteList);
        assertThat(quoteService.getRandomQuote()).isEqualTo("This is a Test!");
    }

    @Test
    public void getRandomQuoteMockitoAnnot() {
        RandomQuoteService quoteService = new RandomQuoteService(quoteList);
        assertThat(quoteService.getRandomQuote()).isEqualTo("This is a Test!");
    }
}