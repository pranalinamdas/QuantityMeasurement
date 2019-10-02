package com.bridgelabz.quantity;

public class Liter implements IUnit {

    private final double converter = 1;

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
        return obj instanceof Liter;
    }

    @Override
    public String toString() {
        return "Liter";
    }
}
