package com.bridgelabz.quantity;

public class Quantity {
    private double value;
    IUnit unit;

    public static Quantity createFeet(double value) {
        return new Quantity(value, new Feet());
    }

    public static Quantity createInch(double value) {
        return new Quantity(value, new Inch());
    }

    public static Quantity createYard(double value) {
        return new Quantity(value, new Yard());
    }

    public static Quantity createLiter(double value) {
        return new Quantity(value, new Liter());
    }

    public static Quantity createGallon(double value) {
        return new Quantity(value, new Gallon());
    }

    public Quantity(double value, IUnit unit) {
        this.value = value;
        this.unit = unit;
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

    IUnit getBaseUnit() {
        return unit.getBaseUnit();
    }
}
