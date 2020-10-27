package com.codurance.lsp.tuple;

import java.util.List;
import java.util.function.Function;

public class Pair<A> implements Tuple<A> {

    private final A obj0;
    private final A obj1;

    public Pair(A obj0, A obj1) {
        this.obj0 = obj0;
        this.obj1 = obj1;
    }

    @Override
    public int length() {
        return 2;
    }

    @Override
    public A get(int idx) {
        if (idx == 0) {
            return obj0;
        } else if (idx == 1) {
            return obj1;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public boolean contains(A obj) {
        return this.obj0.equals(obj) || this.obj1.equals(obj);
    }

    @Override
    public TupleN<A> add(A obj) {
        return new TupleN<>(List.of(obj0, obj1, obj));
    }

    @Override
    public Pair<A> map(Function<A, A> func) {
        return new Pair<>(func.apply(obj0), func.apply(obj1));
    }
}
