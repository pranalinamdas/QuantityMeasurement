package com.bridgelabz.quantity;

public class Quantity {
    private double value;
    private Unit unit;


/*
    public static Length createFoot(int value) {
        return new Length(value, Unit.feet);
    }
*/

    public Quantity(double value, Unit unit) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object other) {

        if (this == other) {
            return true;
        }
        if (other instanceof Quantity) {
            Quantity length = (Quantity) other;
            if (unit.getBaseUnit(this.unit) == unit.getBaseUnit(length.unit)) {
                return unit.convertToBase(this.value) == length.unit.convertToBase(length.value);
            }
        }
        return false;
    }

    public Quantity add(Quantity other) throws Exception {

        if (unit.getBaseUnit(this.unit) != unit.getBaseUnit(other.unit)) {
            throw new Exception();
        }

        if (this.unit == Unit.feet || this.unit == Unit.inch || this.unit == Unit.yard) {
            return new Quantity(unit.convertToBase(this.value) + other.unit.convertToBase(other.value), Unit.inch);
        }
        return new Quantity(unit.convertToBase(this.value) + other.unit.convertToBase(other.value), Unit.liters);
    }
}
