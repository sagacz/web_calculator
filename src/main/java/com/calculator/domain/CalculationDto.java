package com.calculator.domain;

public class CalculationDto {

    private double argument1;
    private double argument2;
    private double result;

    public CalculationDto(double argument1, double argument2) {
        this.argument1 = argument1;
        this.argument2 = argument2;
        this.result = 0.0;
    }

    public double getArgument1() {
        return argument1;
    }

    public double getArgument2() {
        return argument2;
    }

    public double getResult() {
        return result;
    }

    public void setArgument1(double argument1) {
        this.argument1 = argument1;
    }

    public void setArgument2(double argument2) {
        this.argument2 = argument2;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
