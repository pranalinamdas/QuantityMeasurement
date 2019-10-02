package com.bridgelabz.quantity.Length;

import com.bridgelabz.quantity.IUnit;
import com.bridgelabz.quantity.Quantity;

public class Inch implements IUnit {

    private final double converter = 1;

    @Override
    public double convertToBase(double value) {
        return value * converter;
    }

    @Override
    public Inch getBaseUnit() {
        return new Inch();
    }

    @Override
    public boolean hasSameBaseUnits(Quantity quantity) {
        return getBaseUnit().equals(quantity.getBaseUnit());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Inch;
    }

    @Override
    public String toString() {
        return "Inch";
    }
}
