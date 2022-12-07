package com.ocr.helloworld.service;

import com.ocr.helloworld.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {
    public HelloWorld getHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        return helloWorld;
    };
}
