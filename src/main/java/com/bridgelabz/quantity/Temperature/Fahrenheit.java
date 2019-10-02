package com.bridgelabz.quantity.Temperature;

import com.bridgelabz.quantity.IUnit;
import com.bridgelabz.quantity.Quantity;

public class Fahrenheit implements IUnit {

    private final double converter = 32;

    @Override
    public double convertToBase(double value) {
        return value * converter;
    }

    @Override
    public Celsius getBaseUnit() {
        return new Celsius();
    }

    @Override
    public boolean hasSameBaseUnits(Quantity quantity) {
        return getBaseUnit().equals(quantity.getBaseUnit());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Fahrenheit;
    }

    @Override
    public String toString() {
        return "Fahrenheit";
    }
}