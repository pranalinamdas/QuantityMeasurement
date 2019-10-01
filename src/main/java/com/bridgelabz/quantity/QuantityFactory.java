package com.bridgelabz.quantity;

public class QuantityFactory {

    public static Quantity createFeet(double value){
        return new Quantity(value, Unit.feet);
    }

    public static Quantity createInch(double value){
        return new Quantity(value, Unit.inch);
    }

    public static Quantity createYard(double value){
        return new Quantity(value, Unit.yard);
    }

}
