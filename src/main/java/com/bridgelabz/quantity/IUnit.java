package com.bridgelabz.quantity;

public interface IUnit {

    double convertToBase(double value);

    Unit getBaseUnit();

    boolean hasSameBaseUnits(Quantity quantity);

}
