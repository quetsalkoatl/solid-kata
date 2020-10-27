package com.codurance.lsp.tuple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TupleN<A> implements Tuple<A> {

    private final List<A> objs;

    public TupleN(A... objs) {
        this(Arrays.asList(objs));
    }

    public TupleN(List<A> objs) {
        this.objs = new ArrayList<>(objs);
    }

    @Override
    public int length() {
        return objs.size();
    }

    @Override
    public A get(int idx) {
        return objs.get(idx);
    }

    @Override
    public boolean contains(A obj) {
        return objs.contains(obj);
    }

    @Override
    public TupleN<A> add(A obj) {
        List<A> nobjs = new ArrayList<>(objs);
        nobjs.add(obj);
        return new TupleN<>(nobjs);
    }

    @Override
    public TupleN<A> map(Function<A, A> func) {
        return new TupleN<>(objs.stream().map(func).collect(Collectors.toList()));
    }
}
