package com.bridgelabz.quantity.Length;

import com.bridgelabz.quantity.IUnit;
import com.bridgelabz.quantity.Quantity;

public class Feet implements IUnit {

    private final double converter = 12;

    @Override
    public double convertToBase(double value) {
        return value * converter;
    }

    @Override
    public Inch getBaseUnit() {
        return new Inch();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Feet;
    }

    @Override
    public boolean hasSameBaseUnits(Quantity quantity) {
        return getBaseUnit().equals(quantity.getBaseUnit());
    }

    @Override
    public String toString() {
        return "Feet";
    }
}
