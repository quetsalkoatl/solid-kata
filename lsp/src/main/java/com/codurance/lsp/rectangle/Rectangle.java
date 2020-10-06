package com.codurance.lsp.rectangle;

class Rectangle {

    private int width;
    private int height;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        assert width > 0; // precondition: you are not allowed to make a stronger precondition in any child (ex. width > 10 is not allowed)
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return this.height * this.width;
    }
}