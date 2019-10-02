package com.bridgelabz.quantity.Temperature;

import com.bridgelabz.quantity.IUnit;
import com.bridgelabz.quantity.Quantity;

public class Celsius implements IUnit {

    @Override
    public double convertToBase(double value) {
        return value * (9.0 / 5) + 32;
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
        return obj instanceof Celsius;
    }

    @Override
    public String toString() {
        return "Celsius";
    }
}
