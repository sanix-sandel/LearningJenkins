package com.nixa.Calculator;

import org.springframework.stereotype.Service;


@Service
public class Calculator {

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public int sum(int a, int b){
        return a+b;
    }

}
