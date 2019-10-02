package com.bridgelabz.quantity.Volume;

import com.bridgelabz.quantity.IUnit;
import com.bridgelabz.quantity.Quantity;

public class Gallon implements IUnit {

    private final double converter = 3.78;

    @Override
    public double convertToBase(double value) {
        return value * converter;
    }

    @Override
    public Liter getBaseUnit() {
        return new Liter();
    }

    @Override
    public boolean hasSameBaseUnits(Quantity quantity) {
        return getBaseUnit().equals(quantity.getBaseUnit());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Gallon;
    }

    @Override
    public String toString() {
        return "Gallon";
    }
}
