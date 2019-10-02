package com.bridgelabz.quantity;

public class Yard implements IUnit {

    private final double converter = 36;

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
        return obj instanceof Yard;
    }

    @Override
    public String toString() {
        return "Yard";
    }
}
