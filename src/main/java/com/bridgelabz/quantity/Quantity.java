package com.bridgelabz.quantity;

import com.bridgelabz.quantity.Temperature.Celsius;
import com.bridgelabz.quantity.Temperature.Fahrenheit;

public class Quantity {

    protected double value;
    protected IUnit unit;

    public static Quantity createCelsius(double value) {
        return new Quantity(value, new Celsius());
    }

    public static Quantity createFahrenheit(double value) {
        return new Quantity(value, new Fahrenheit());
    }

    public Quantity() {
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

    public IUnit getBaseUnit() {
        return unit.getBaseUnit();
    }
}
