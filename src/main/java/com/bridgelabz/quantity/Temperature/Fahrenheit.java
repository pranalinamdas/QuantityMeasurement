package com.bridgelabz.quantity.Temperature;

import com.bridgelabz.quantity.IUnit;
import com.bridgelabz.quantity.Quantity;

public class Fahrenheit implements IUnit {

    private final double converter = 1;

    @Override
    public double convertToBase(double value) {
        return value * converter;
    }

    @Override
    public Fahrenheit getBaseUnit() {
        return new Fahrenheit();
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
