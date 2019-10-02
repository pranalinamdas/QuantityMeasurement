package com.bridgelabz.quantity;

public interface IUnit {

    double convertToBase(double value);

    IUnit getBaseUnit();

    boolean hasSameBaseUnits(Quantity quantity);
}
