package com.codurance.lsp.rectangle;

public class Client {

    static void clientMethod(Rectangle rec) {
        int oldHeight = rec.getHeight();
        rec.setWidth(5);
        assert oldHeight == rec.getHeight();
        rec.setHeight(4);
        assert (rec.area() == 20);
    }

    public static void main(String[] args) {
        Rectangle rect = new Square();
        clientMethod(rect);
    }
}
