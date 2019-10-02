package com.bridgelabz.quantity;

import com.bridgelabz.quantity.Length.Feet;
import com.bridgelabz.quantity.Length.Inch;
import com.bridgelabz.quantity.Length.Yard;
import com.bridgelabz.quantity.Volume.Gallon;
import com.bridgelabz.quantity.Volume.Liter;
import com.bridgelabz.quantity.Weight.Grams;
import com.bridgelabz.quantity.Weight.KiloGrams;

public class AddableQuantity extends Quantity{

    public static AddableQuantity createFeet(double value) {
        return new AddableQuantity(value, new Feet());
    }

    public static AddableQuantity createInch(double value) {
        return new AddableQuantity(value, new Inch());
    }

    public static AddableQuantity createYard(double value) {
        return new AddableQuantity(value, new Yard());
    }

    public static AddableQuantity createLiter(double value) {
        return new AddableQuantity(value, new Liter());
    }

    public static AddableQuantity createGallon(double value) {
        return new AddableQuantity(value, new Gallon());
    }

    public static AddableQuantity createGrams(double value) {
        return new AddableQuantity(value, new Grams());
    }

    public static AddableQuantity createKiloGrams(double value) {
        return new AddableQuantity(value, new KiloGrams());
    }

    public AddableQuantity(double value, IUnit unit) {
        super(value, unit);
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
        if (other instanceof AddableQuantity) {

            AddableQuantity quantity = (AddableQuantity) other;

            if (unit.hasSameBaseUnits(quantity)) {
                return Math.abs(unit.convertToBase(this.value) - quantity.unit.convertToBase(quantity.value)) <= 0.01;
            }
        }
        return false;
    }

    public AddableQuantity add(AddableQuantity other) throws Exception {

        if (!unit.hasSameBaseUnits(other)) {
            throw new IllegalArgumentException(this.unit + " Cannot be added with " + other.unit);
        }
        return new AddableQuantity(unit.convertToBase(this.value) + other.unit.convertToBase(other.value), unit.getBaseUnit());
    }

}
