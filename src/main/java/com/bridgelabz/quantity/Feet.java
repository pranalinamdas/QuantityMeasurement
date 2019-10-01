package com.bridgelabz.quantity;

public class Feet implements IUnit {

    private final double converter = 12;
    private final Unit baseUnit;


    public Feet() {
        this.baseUnit = Unit.inch;
    }

    @Override
    public double convertToBase(double value) {
        return value * converter;
    }

    @Override
    public Unit getBaseUnit() {
        return baseUnit;
    }

    @Override
    public boolean hasSameBaseUnits(Quantity quantity) {
        return getBaseUnit() == quantity.unit.getBaseUnit();
    }
}
