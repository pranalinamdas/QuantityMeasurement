package com.bridgelabz.quantity;

public class Quantity {
    private double value;
    Unit unit;

    public static Quantity createFeet(double value) {
        return new Quantity(value, Unit.feet);
    }

    public static Quantity createInch(double value) {
        return new Quantity(value, Unit.inch);
    }

    public static Quantity createYard(double value) {
        return new Quantity(value, Unit.yard);
    }

    public static Quantity createLiter(double value) {
        return new Quantity(value, Unit.liters);
    }

    public static Quantity createGallon(double value) {
        return new Quantity(value, Unit.gallon);
    }

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
            throw new IllegalArgumentException(this.unit + " Cannot be added with " + other.unit);
        }
        return new Quantity(unit.convertToBase(this.value) + other.unit.convertToBase(other.value), unit.getBaseUnit());
    }
}
