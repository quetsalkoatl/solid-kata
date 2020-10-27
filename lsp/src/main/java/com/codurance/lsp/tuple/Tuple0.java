package com.codurance.lsp.tuple;

import java.util.function.Function;

public class Tuple0<A> implements Tuple<A> {
    @Override
    public int length() {
        return 0;
    }

    @Override
    public A get(int idx) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean contains(A obj) {
        return false;
    }

    @Override
    public Singleton<A> add(A obj) {
        return new Singleton<>(obj);
    }

    @Override
    public Tuple0<A> map(Function<A, A> func) {
        return this;
    }
}
