package com.bridgelabz.quantity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

    @Nested
    class FeetTest {
        @Test
        void givenZeroFeet_whenCheckEquals_thenShouldReturnEqual() {
            AddableQuantity zero = AddableQuantity.createFeet(0);
            AddableQuantity otherZero = AddableQuantity.createFeet(0);
            assertEquals(zero, otherZero);
        }

        @Test
        void givenZeroAndOneFeet_WhenCheckEquals_ThenShouldNotBeEqual() {
            AddableQuantity zero = AddableQuantity.createFeet(0);
            AddableQuantity one = AddableQuantity.createFeet(1);

            assertNotEquals(zero, one);
        }

        @Test
        void givenOneFeetAndOneFeet_WhenCheckEquals_ThenShouldBeEqual() {
            AddableQuantity one = AddableQuantity.createFeet(1);
            AddableQuantity anotherOne = AddableQuantity.createFeet(1);

            assertEquals(one, anotherOne);
        }

        @Test
        void givenZeroFeetAndNull_WhenCheckEquals_ThenShouldNotBeEqual() {
            AddableQuantity zero = AddableQuantity.createFeet(0);

            assertNotEquals(null, zero);
        }
    }

    @Nested
    class InchTest {
        @Test
        void givenZeroInch_whenCheckEquals_thenShouldBeEqual() {
            AddableQuantity zero = AddableQuantity.createInch(0);
            AddableQuantity anotherZero = AddableQuantity.createInch(0);

            assertEquals(zero, anotherZero);
        }

        @Test
        void givenZeroInchAndOneInch_whenCheckEquals_thenShouldNotBeEqual() {
            AddableQuantity zero = AddableQuantity.createInch(0);
            AddableQuantity one = AddableQuantity.createInch(1);

            assertNotEquals(zero, one);
        }

        @Test
        void givenOneFeetAndOneInch_WhenCheckEquals_ThenShouldNotBeEqual() {
            AddableQuantity one = AddableQuantity.createInch(1);
            AddableQuantity anotherOne = AddableQuantity.createInch(1);

            assertEquals(one, anotherOne);
        }

        @Test
        void givenZeroInchAndNull_whenCheckEquals_thenShouldNotBeEqual() {
            AddableQuantity zero = AddableQuantity.createInch(0);

            assertNotEquals(null, zero);
        }
    }

    @Test
    void givenOneFeetAndOneInch_WhenCheckEquals_thenShouldNotBeEqual() {
        AddableQuantity oneFoot = AddableQuantity.createFeet(1);
        AddableQuantity oneInch = AddableQuantity.createInch(1);

        assertNotEquals(oneFoot, oneInch);
    }

    @Test
    void givenZeroFeetAndZeroInch_whenCheckEquals_thenShouldBeEqual() {
        AddableQuantity zeroFeet = AddableQuantity.createFeet(0);
        AddableQuantity zeroInch = AddableQuantity.createInch(0);

        assertEquals(zeroFeet, zeroInch);
    }

    @Test
    void givenOneFootAndTwelveInch_whenCheckEquals_thenShouldBeEqual() {
        AddableQuantity oneFoot = AddableQuantity.createFeet(1);
        AddableQuantity twelveInch = AddableQuantity.createInch(12);

        assertEquals(oneFoot, twelveInch);
    }

    @Test
    void givenTwoFeetAndTwentyFourInches_whenCheckEquals_thenShouldBeEqual() {
        AddableQuantity twoFeet = AddableQuantity.createFeet(2);
        AddableQuantity twentyFourInch = AddableQuantity.createInch(24);

        assertEquals(twoFeet, twentyFourInch);
    }

    @Test
    void givenZeroYard_whenCheckEquals_thenTheyShouldBeEqual() {
        AddableQuantity zeroYard = AddableQuantity.createYard(0);
        AddableQuantity anotherZeroYard = AddableQuantity.createYard(0);

        assertEquals(zeroYard, anotherZeroYard);
    }

    @Test
    void givenZeroAndOneYard_whenCheckEquals_thenTheyShouldNotBeEqual() {
        AddableQuantity zeroYard = AddableQuantity.createYard(0);
        AddableQuantity oneYard = AddableQuantity.createYard(1);

        assertNotEquals(zeroYard, oneYard);
    }

    @Test
    void givenOneAndOneYard_whenCheckEquals_thenTheyShouldBeEqual() {
        AddableQuantity oneYard = AddableQuantity.createYard(1);
        AddableQuantity anotherOneYard = AddableQuantity.createYard(1);

        assertEquals(oneYard, anotherOneYard);
    }

    @Test
    void givenOneYardAndThirtySixInches_WhenCheckEquals_ThenTheyShouldBeEqual() {
        AddableQuantity oneYard = AddableQuantity.createYard(1);
        AddableQuantity thirtySixInch = AddableQuantity.createInch(36);

        assertEquals(thirtySixInch, oneYard);
    }

    @Test
    void givenOneYardAndThreeFeet_WhenCheckEquals_ThenTheyShouldBeEqual() {
        AddableQuantity oneYard = AddableQuantity.createYard(1);
        AddableQuantity threeFeet = AddableQuantity.createFeet(3);

        assertEquals(threeFeet, oneYard);
    }

    @Test
    void givenZeroInchAndZeroInch_whenAdd_ThenShouldBeZeroInch() throws Exception {
        AddableQuantity zeroInch = AddableQuantity.createInch(0);
        AddableQuantity anotherZeroInch = AddableQuantity.createInch(0);

        assertEquals(AddableQuantity.createInch(0), zeroInch.add(anotherZeroInch));
    }

    @Test
    void givenOneInchAndOneInch_whenAdd_ThenShouldBeTwoInches() throws Exception {
        AddableQuantity oneInch = AddableQuantity.createInch(1);
        AddableQuantity anotherOneInch = AddableQuantity.createInch(1);

        assertEquals(AddableQuantity.createInch(2), oneInch.add(anotherOneInch));
    }

    @Test
    void givenZeroInchAndTwoInch_whenAdd_ThenShouldBeFourInches() throws Exception {
        AddableQuantity zeroInch = AddableQuantity.createInch(2);
        AddableQuantity oneInch = AddableQuantity.createInch(2);

        assertEquals(AddableQuantity.createInch(4), zeroInch.add(oneInch));
    }

    @Test
    void givenZeroInchAndZeroFeet_whenAdd_ThenShouldBeZeroInch() throws Exception {
        AddableQuantity zeroFeet = AddableQuantity.createFeet(0);
        AddableQuantity zeroInch = AddableQuantity.createInch(0);

        assertEquals(AddableQuantity.createInch(0), zeroFeet.add(zeroInch));
    }

    @Test
    void givenZeroInchAndOneFeet_whenAdd_ThenShouldBeTwelveInches() throws Exception {
        AddableQuantity oneFeet = AddableQuantity.createFeet(1);
        AddableQuantity zeroInch = AddableQuantity.createInch(0);

        assertEquals(AddableQuantity.createInch(12), oneFeet.add(zeroInch));
    }

    @Test
    void givenTwoInchAndOneFeet_whenAdd_ThenShouldBeFourteenInches() throws Exception {
        AddableQuantity oneFeet = AddableQuantity.createFeet(1);
        AddableQuantity twoInches = AddableQuantity.createInch(2);

        assertEquals(AddableQuantity.createInch(14), oneFeet.add(twoInches));
    }

    @Test
    void givenZeroLitersAndZeroLiters_WhenCheckEquals_ThenShouldBeEqual() {
        AddableQuantity zeroLiters = AddableQuantity.createLiter(0);
        AddableQuantity anotherZeroLiter = AddableQuantity.createLiter(0);

        assertEquals(zeroLiters, anotherZeroLiter);
    }

    @Test
    void givenZeroGallonAndZeroGallon_WhenCheckEquals_ThenShouldBeEqual() {
        AddableQuantity zeroGallon = AddableQuantity.createGallon(0);
        AddableQuantity anotherZeroGallon = AddableQuantity.createGallon(0);

        assertEquals(zeroGallon, anotherZeroGallon);
    }

    @Test
    void givenZeroGallonAndZeroLiters_WhenCheckEquals_ThenShouldBeEqual() {
        AddableQuantity zeroGallon = AddableQuantity.createGallon(0);
        AddableQuantity zeroLiter = AddableQuantity.createLiter(0);

        assertEquals(zeroGallon, zeroLiter);
    }

    @Test
    void givenOneGallonAndZeroLiters_WhenCheckEquals_ThenShouldNotBeEqual() {
        AddableQuantity oneGallon = AddableQuantity.createGallon(1);
        AddableQuantity zeroLiter = AddableQuantity.createLiter(0);

        assertNotEquals(oneGallon, zeroLiter);
    }

    @Test
    void givenOneGallonAndThreePointSevenEightLiters_WhenCheckEquals_ThenShouldNotBeEqual() {
        AddableQuantity oneGallon = AddableQuantity.createGallon(1);
        AddableQuantity threePointSevenEightLiter = AddableQuantity.createLiter(3.78);

        assertEquals(oneGallon, threePointSevenEightLiter);
    }

    @Test
    void givenZeroGallonAndZeroLiters_WhenAdd_ThenShouldBeZeroLiters() throws Exception {
        AddableQuantity zeroGallon = AddableQuantity.createGallon(0);
        AddableQuantity zeroLiter = AddableQuantity.createLiter(0);

        assertEquals(AddableQuantity.createLiter(0), zeroGallon.add(zeroLiter));
    }

    @Test
    void givenOneGallonAndOneFeet_whenCheckEquality_thenTheyShouldNotBeEqual() {
        AddableQuantity oneGallon = AddableQuantity.createGallon(1);
        AddableQuantity oneFeet = AddableQuantity.createFeet(1);

        assertNotEquals(oneGallon, oneFeet);
    }

    @Test
    void givenOneInchAndOneLiter_whenCheckEquality_thenTheyShouldNotBeEqual() {
        AddableQuantity oneInch = AddableQuantity.createInch(1);
        AddableQuantity oneLiter = AddableQuantity.createLiter(1);

        assertNotEquals(oneInch, oneLiter);
    }

    @Test
    void givenZeroInchAndZeroLiter_whenCheckEquality_thenTheyShouldNotBeEqual() {
        AddableQuantity zeroInch = AddableQuantity.createInch(0);
        AddableQuantity zeroLiter = AddableQuantity.createLiter(0);

        assertNotEquals(zeroInch, zeroLiter);
    }

    @Test
    void givenZeroInchAndZeroGallon_whenCheckEquality_thenTheyShouldNotBeEqual() {
        AddableQuantity zeroInch = AddableQuantity.createInch(0);
        AddableQuantity zeroGallon = AddableQuantity.createGallon(0);

        assertNotEquals(zeroInch, zeroGallon);
    }

    @Test
    void givenOneInchAndOneGallon_whenCheckEquality_thenTheyShouldNotBeEqual() {
        AddableQuantity oneInch = AddableQuantity.createInch(1);
        AddableQuantity oneGallon = AddableQuantity.createGallon(1);

        assertNotEquals(oneInch, oneGallon);
    }

    @Test
    void givenOneYardAndOneGallon_whenCheckEquality_thenTheyShouldNotBeEqual() {
        AddableQuantity oneYard = AddableQuantity.createYard(1);
        AddableQuantity oneGallon = AddableQuantity.createGallon(1);

        assertNotEquals(oneYard, oneGallon);
    }

    @Test
    void givenOneYardAndOneLiter_whenCheckEquality_thenTheyShouldNotBeEqual() {
        AddableQuantity oneYard = AddableQuantity.createYard(1);
        AddableQuantity oneLiter = AddableQuantity.createLiter(1);

        assertNotEquals(oneYard, oneLiter);
    }

    @Test
    void givenZeroYardAndZeroLiter_whenCheckEquality_thenTheyShouldNotBeEqual() {
        AddableQuantity zeroYard = AddableQuantity.createYard(0);
        AddableQuantity zeroLiter = AddableQuantity.createLiter(0);

        assertNotEquals(zeroYard, zeroLiter);
    }

    @Test
    void givenZeroGallonAndZeroFeet_whenAdd_thenTheyShouldThrowException() {
        AddableQuantity zeroGallon = AddableQuantity.createGallon(0);
        AddableQuantity zeroFeet = AddableQuantity.createFeet(0);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            zeroGallon.add(zeroFeet);
        });
        assertEquals("Gallon Cannot be added with Feet", exception.getMessage());
    }

    @Test
    void givenOneGallonAndOneFeet_whenAdd_thenTheyShouldThrowException() {
        AddableQuantity oneGallon = AddableQuantity.createGallon(1);
        AddableQuantity oneFeet = AddableQuantity.createFeet(1);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneFeet);
        });
        assertEquals("Gallon Cannot be added with Feet", exception.getMessage());

    }

    @Test
    void givenOneGallonAndOneInch_whenAdd_thenTheyShouldThrowException() {
        AddableQuantity zeroGallon = AddableQuantity.createGallon(1);
        AddableQuantity oneInch = AddableQuantity.createInch(1);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            zeroGallon.add(oneInch);
        });
        assertEquals("Gallon Cannot be added with Inch", exception.getMessage());
    }

    @Test
    void givenOneGallonAndOneYard_whenAdd_thenTheyShouldThrowException() {
        AddableQuantity oneGallon = AddableQuantity.createGallon(1);
        AddableQuantity oneYard = AddableQuantity.createYard(1);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneYard);
        });
        assertEquals("Gallon Cannot be added with Yard", exception.getMessage());
    }

    @Test
    void givenOneGallonAndOneLiters_WhenAdd_ThenShouldBeFourPointSevenEightLiters() throws Exception {
        AddableQuantity oneGallon = AddableQuantity.createGallon(1);
        AddableQuantity fourPointSevenEightLiters = AddableQuantity.createLiter(3.78);

        assertEquals(AddableQuantity.createLiter(7.56), oneGallon.add(fourPointSevenEightLiters));
    }

    @Test
    void givenTwoGallonAndOneLiters_WhenAdd_ThenShouldBeFourPointSevenEightLiters() throws Exception {
        AddableQuantity zeroGallon = AddableQuantity.createGallon(2);
        AddableQuantity fourPointSevenEightLiters = AddableQuantity.createLiter(3.78);

        assertEquals(AddableQuantity.createLiter(11.34), zeroGallon.add(fourPointSevenEightLiters));
    }

    @Test
    void givenZeroGramsAndZeroGrams_whenCheckEquals_thenTheyShouldBeEqual() {
        AddableQuantity zeroGram = AddableQuantity.createGrams(0);
        AddableQuantity anotherZeroGram = AddableQuantity.createGrams(0);

        assertEquals(zeroGram, anotherZeroGram);
    }

    @Test
    void givenZeroGramsAndOneGram_whenCheckEquals_thenTheyShouldBeNotEqual() {
        AddableQuantity zeroGram = AddableQuantity.createGrams(0);
        AddableQuantity oneGram = AddableQuantity.createGrams(1);

        assertNotEquals(zeroGram, oneGram);
    }

    @Test
    void givenZeroGramsAndZeroKiloGrams_whenCheckEquals_thenTheyShouldBeEqual() {
        AddableQuantity zeroGram = AddableQuantity.createGrams(0);
        AddableQuantity zeroKG = AddableQuantity.createKiloGrams(0);

        assertEquals(zeroGram, zeroKG);
    }

    @Test
    void givenThousandGramsAndOneKiloGrams_whenCheckEquals_thenTheyShouldBeEqual() {
        AddableQuantity thousandGrams = AddableQuantity.createGrams(1000);
        AddableQuantity oneKG = AddableQuantity.createKiloGrams(1);

        assertEquals(thousandGrams, oneKG);
    }

    @Test
    void givenZeroKiloGramsAndZeroKiloGrams_whenCheckEquals_thenTheyShouldBeEqual() {
        AddableQuantity zeroKG = AddableQuantity.createKiloGrams(0);
        AddableQuantity anotherZeroKG = AddableQuantity.createKiloGrams(0);

        assertEquals(zeroKG, anotherZeroKG);
    }

    @Test
    void givenZeroKiloGramsAndOneKiloGrams_whenCheckEquals_thenTheyShouldBeNotEqual() {
        AddableQuantity zeroKG = AddableQuantity.createKiloGrams(0);
        AddableQuantity oneKG = AddableQuantity.createKiloGrams(1);

        assertNotEquals(zeroKG, oneKG);
    }

    @Test
    void givenZeroGramsAndZeroGrams_whenAdd_thenShouldBeZeroGrams() throws Exception {
        AddableQuantity zeroGram = AddableQuantity.createGrams(0);
        AddableQuantity anotherZeroGram = AddableQuantity.createGrams(0);

        assertEquals(AddableQuantity.createGrams(0.0), zeroGram.add(anotherZeroGram));
    }

    @Test
    void givenOneGramsAndOneGrams_whenAdd_thenShouldBeTwoGrams() throws Exception {
        AddableQuantity oneGram = AddableQuantity.createGrams(1);
        AddableQuantity anotherOneGram = AddableQuantity.createGrams(1);

        assertEquals(AddableQuantity.createGrams(2.0), oneGram.add(anotherOneGram));
    }

    @Test
    void givenOneGramAndOneKiloGrams_whenAdd_thenShouldBeThousandAndOneGrams() throws Exception {
        AddableQuantity oneGram = AddableQuantity.createGrams(1);
        AddableQuantity oneKG = AddableQuantity.createKiloGrams(1);

        assertEquals(AddableQuantity.createGrams(1001), oneGram.add(oneKG));
    }

    @Test
    void givenOneKiloGramAndOneKiloGrams_whenAdd_thenShouldBetwoThousandGrams() throws Exception {
        AddableQuantity oneKG = AddableQuantity.createKiloGrams(1);
        AddableQuantity anotherOneKG = AddableQuantity.createKiloGrams(1);

        assertEquals(AddableQuantity.createGrams(2000), oneKG.add(anotherOneKG));
    }

    @Test
    void givenZeroCelsiusAndZeroCelsius_whenCheckEquals_ThenShouldBeEqual(){
        Quantity zeroCelsius = Quantity.createCelsius(0);
        Quantity anotherZeroCelsius = Quantity.createCelsius(0);

        assertEquals(zeroCelsius, anotherZeroCelsius);
    }

    @Test
    void givenZeroCelsiusAndOneCelsius_whenCheckEquals_ThenShouldNotBeEqual(){
        Quantity zeroCelsius = Quantity.createCelsius(0);
        Quantity oneCelsius = Quantity.createCelsius(1);

        assertNotEquals(zeroCelsius, oneCelsius);
    }

    @Test
    void givenOneCelsiusAndOneCelsius_whenCheckEquals_ThenShouldBeEqual(){
        Quantity oneCelsius = Quantity.createCelsius(1);
        Quantity anotherOneCelsius = Quantity.createCelsius(1);

        assertEquals(oneCelsius, anotherOneCelsius);
    }

    @Test
    void givenZeroFahrenheitAndZeroFahrenheit_whenCheckEquals_ThenShouldBeEqual(){
        Quantity zeroFahrenheit = Quantity.createFahrenheit(0);
        Quantity anotherZeroFahrenheit = Quantity.createFahrenheit(0);

        assertEquals(zeroFahrenheit, anotherZeroFahrenheit);
    }

    @Test
    void givenZeroFahrenheitAndOneFahrenheit_whenCheckEquals_ThenShouldBeNotEqual(){
        Quantity zeroFahrenheit = Quantity.createFahrenheit(0);
        Quantity oneFahrenheit = Quantity.createFahrenheit(1);

        assertNotEquals(zeroFahrenheit, oneFahrenheit);
    }

    @Test
    void givenOneFahrenheitAndZeroFahrenheit_whenCheckEquals_ThenShouldBeEqual(){
        Quantity oneFahrenheit = Quantity.createFahrenheit(1);
        Quantity anotherOneFahrenheit = Quantity.createFahrenheit(1);

        assertEquals(oneFahrenheit, anotherOneFahrenheit);
    }

    @Test
    void givenZeroCelsiusAndZeroFahrenheit_whenCheckEquals_ThenShouldNotBeEqual(){
        Quantity zeroCelsius = Quantity.createCelsius(0);
        Quantity zeroFahrenheit = Quantity.createFahrenheit(0);

        assertNotEquals(zeroCelsius, zeroFahrenheit);
    }

    @Test
    void givenZeroCelsiusAndOneFahrenheit_whenCheckEquals_ThenShouldNotBeEqual(){
        Quantity zeroCelsius = Quantity.createCelsius(0);
        Quantity oneFahrenheit = Quantity.createFahrenheit(1);

        assertNotEquals(zeroCelsius, oneFahrenheit);
    }

    @Test
    void givenZeroCelsiusAndThirtyTwoFahrenheit_whenCheckEquals_ThenShouldBeEqual(){
        Quantity zeroCelsius = Quantity.createCelsius(0);
        Quantity thirtyTwoFahrenheit = Quantity.createFahrenheit(32);

        assertNotEquals(zeroCelsius, thirtyTwoFahrenheit);
    }

    @Test
    void givenOneCelsiusAndThirtyThreePointEightFahrenheit_whenCheckEquals_ThenShouldBeEqual(){
        Quantity oneCelsius = Quantity.createCelsius(1);
        Quantity thirtyThreePointEightFahrenheit = Quantity.createFahrenheit(33.8);

        assertNotEquals(oneCelsius, thirtyThreePointEightFahrenheit);
    }

    @Test
    void givenTwoCelsiusAndThirtyFivePointSixFahrenheit_whenCheckEquals_ThenShouldBeEqual(){
        Quantity twoCelsius = Quantity.createCelsius(2);
        Quantity thirtyFivePointSixFahrenheit = Quantity.createFahrenheit(35.6);

        assertNotEquals(twoCelsius, thirtyFivePointSixFahrenheit);
    }
}
