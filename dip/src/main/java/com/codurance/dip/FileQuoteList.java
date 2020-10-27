package com.codurance.dip;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FileQuoteList implements QuoteList {

    final String fileName = "/files/quote.txt";
    final File file = getFileFromResource(fileName);

    public List<String> getQuoteList() {
        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader)) {
            return br.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    File getFileFromResource(String fileName) {
        try {
            return new File(FileQuoteList.class.getResource(fileName).toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }
}
