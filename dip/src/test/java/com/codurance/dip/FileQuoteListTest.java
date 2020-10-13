package com.codurance.dip;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class FileQuoteListTest {

    private final FileQuoteList list = new FileQuoteList();

    @Test
    void getQuoteList() {
        assertThat(list.getQuoteList()).hasSize(6);
        assertThat(list.getQuoteList()).contains("I think therefore I am");
    }
}