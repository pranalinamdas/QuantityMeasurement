package com.bridgelabz.quantity.Weight;

import com.bridgelabz.quantity.IUnit;
import com.bridgelabz.quantity.Quantity;

public class KiloGrams implements IUnit {

    private final double converter = 1000;

    @Override
    public double convertToBase(double value) {
        return value * converter;
    }

    @Override
    public Grams getBaseUnit() {
        return new Grams();
    }

    @Override
    public boolean hasSameBaseUnits(Quantity quantity) {
        return getBaseUnit().equals(quantity.getBaseUnit());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof KiloGrams;
    }

    @Override
    public String toString() {
        return "Kilograms";
    }
}
