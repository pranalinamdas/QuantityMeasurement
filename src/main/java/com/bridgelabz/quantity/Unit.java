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
    }

    Unit(double converter, Unit baseUnit) {
        this.converter = converter;
        this.baseUnit = baseUnit;
    }

    public double convertToBase(double value) {
        return value * converter;
    }

    public Unit getBaseUnit(Unit unit) {
        if (unit == Unit.feet || unit == Unit.inch || unit == Unit.yard) {
            return Unit.inch;
        }
        return Unit.liters;
    }

    public boolean hasSameBaseUnits(Quantity quantity) {
        return getBaseUnit(this) == getBaseUnit(quantity.unit);
    }
}
