package com.codurance.lsp.tuple;

import java.util.function.Function;

public class Singleton<A> implements Tuple<A> {

    private final A obj;

    public Singleton(A obj) {
        this.obj = obj;
    }

    @Override
    public int length() {
        return 1;
    }

    @Override
    public A get(int idx) {
        if (idx == 0) {
            return obj;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public boolean contains(A obj) {
        return this.obj.equals(obj);
    }

    @Override
    public Pair<A> add(A obj) {
        return new Pair<>(this.obj, obj);
    }

    @Override
    public Singleton<A> map(Function<A, A> func) {
        return new Singleton<>(func.apply(this.obj));
    }
}
