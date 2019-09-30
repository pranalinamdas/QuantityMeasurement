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
            return unit.convertToBase(this.value) == length.unit.convertToBase(length.value);
        }
        return false;
    }

    public Quantity add(Quantity other) throws Exception {

        if ((this.unit == Unit.gallon) && (other.unit == Unit.feet)) throw new Exception();

        if ((this.unit == Unit.feet) && (other.unit == Unit.gallon)) throw new Exception();

        return new Quantity(unit.convertToBase(this.value) + other.unit.convertToBase(other.value), Unit.inch);
    }
}
