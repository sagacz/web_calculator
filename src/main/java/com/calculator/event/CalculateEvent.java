package com.calculator.event;

import org.springframework.context.ApplicationEvent;

public class CalculateEvent extends ApplicationEvent {
    private double arg1;
    private double arg2;
    private double result;
    private String operation;

    public String getOperation() {
        return operation;
    }

    public CalculateEvent(Object source,
                          double arg1,
                          double arg2,
                          double result,
                          String operation){
        super(source);
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.result = result;
        this.operation = operation;
    }

    public double getArg1() {
        return arg1;
    }

    public double getArg2() {
        return arg2;
    }

    public double getResult() {
        return result;
    }
}
