package com.bridgelabz.quantity;

public class Quantity {
    protected double value;
    protected Unit unit;


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
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }

    @Override
    public boolean equals(Object other) {

        if (this == other) {
            return true;
        }
        if (other instanceof Quantity) {

            Quantity quantity = (Quantity) other;

            if (unit.hasSameBaseUnits(quantity)) {
                return Math.abs(unit.convertToBase(this.value) - quantity.unit.convertToBase(quantity.value)) <= 0.01;
            }
        }
        return false;
    }

    public Quantity add(Quantity other) throws Exception {

        if (!unit.hasSameBaseUnits(other)) {
            throw new Exception();
        }
        return new Quantity(unit.convertToBase(this.value) + other.unit.convertToBase(other.value), unit.getBaseUnit(unit));
    }
}
