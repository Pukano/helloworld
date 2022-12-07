package com.ocr.helloworld.model;

public class HelloWorld {
    String value = "Hello World";

    @Override
    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
