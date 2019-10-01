package com.bridgelabz.quantity;

public enum Unit {
    inch(1),
    feet(12, Unit.inch),
    yard(36, Unit.inch),
    liters(1),
    gallon(3.78, Unit.liters);

    private double converter;
    private Unit baseUnit;

    Unit(double converter) {
        this.converter = converter;
        this.baseUnit = this;
    }

    Unit(double converter, Unit baseUnit) {
        this.converter = converter;
        this.baseUnit = baseUnit;
    }

    public double convertToBase(double value) {
        return value * converter;
    }

    public Unit getBaseUnit() {
        return this.baseUnit;
    }

    public boolean hasSameBaseUnits(Quantity quantity) {
        return this.getBaseUnit() == quantity.unit.getBaseUnit();
    }
}
