package com.example.test2.services;

import org.springframework.stereotype.Service;

@Service
public class CircleService {

    public double getLong(double r){
        return 2* Math.PI * r;
    }

    public double getSquare(double r){
        return Math.PI * r * r;
    }

}
