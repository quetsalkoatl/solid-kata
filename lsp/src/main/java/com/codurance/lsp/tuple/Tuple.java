package com.codurance.lsp.tuple;

import java.util.function.Function;

public interface Tuple<A> {

    int length();

    A get(int idx);

    boolean contains(A obj);

    Tuple<A> add(A obj);

    Tuple<A> map(Function<A, A> func);

}
