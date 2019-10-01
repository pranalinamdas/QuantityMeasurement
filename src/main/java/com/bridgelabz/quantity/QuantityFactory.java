package com.bridgelabz.quantity;

public class QuantityFactory {

    static Quantity createFeet(double value){
        return new Quantity(value, Unit.feet);
    }

    static Quantity createInch(double value){
        return new Quantity(value, Unit.inch);
    }

    static Quantity createYard(double value){
        return new Quantity(value, Unit.yard);
    }

    public static Quantity createLiters(double value){
        return new Quantity(value, Unit.liters);
    }

    public static Quantity createGallon(double value){
        return new Quantity(value, Unit.gallon);
    }

}
