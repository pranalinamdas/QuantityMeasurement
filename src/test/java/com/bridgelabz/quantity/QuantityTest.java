package com.bridgelabz.quantity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

    @Nested
    class FeetTest {
        @Test
        void givenZeroFeet_whenCheckEquals_thenShouldReturnEqual() {
            Quantity zero = Quantity.createFeet(0);
            Quantity otherZero = Quantity.createFeet(0);
            assertEquals(zero, otherZero);
        }

        @Test
        void givenZeroAndOneFeet_WhenCheckEquals_ThenShouldNotBeEqual() {
            Quantity zero = Quantity.createFeet(0);
            Quantity one = Quantity.createFeet(1);

            assertNotEquals(zero, one);
        }

        @Test
        void givenOneFeetAndOneFeet_WhenCheckEquals_ThenShouldBeEqual() {
            Quantity one = Quantity.createFeet(1);
            Quantity anotherOne = Quantity.createFeet(1);

            assertEquals(one, anotherOne);
        }

        @Test
        void givenZeroFeetAndNull_WhenCheckEquals_ThenShouldNotBeEqual() {
            Quantity zero = Quantity.createFeet(0);

            assertNotEquals(null, zero);
        }
    }

    @Nested
    class InchTest {
        @Test
        void givenZeroInch_whenCheckEquals_thenShouldBeEqual() {
            Quantity zero = Quantity.createInch(0);
            Quantity anotherZero = Quantity.createInch(0);

            assertEquals(zero, anotherZero);
        }

        @Test
        void givenZeroInchAndOneInch_whenCheckEquals_thenShouldNotBeEqual() {
            Quantity zero = Quantity.createInch(0);
            Quantity one = Quantity.createInch(1);

            assertNotEquals(zero, one);
        }

        @Test
        void givenOneFeetAndOneInch_WhenCheckEquals_ThenShouldNotBeEqual() {
            Quantity one = Quantity.createInch(1);
            Quantity anotherOne = Quantity.createInch(1);

            assertEquals(one, anotherOne);
        }

        @Test
        void givenZeroInchAndNull_whenCheckEquals_thenShouldNotBeEqual() {
            Quantity zero = Quantity.createInch(0);

            assertNotEquals(null, zero);
        }
    }

    @Test
    void givenOneFeetAndOneInch_WhenCheckEquals_thenShouldNotBeEqual() {
        Quantity oneFoot = Quantity.createFeet(1);
        Quantity oneInch = Quantity.createInch(1);

        assertNotEquals(oneFoot, oneInch);
    }

    @Test
    void givenZeroFeetAndZeroInch_whenCheckEquals_thenShouldBeEqual() {
        Quantity zeroFeet = Quantity.createFeet(0);
        Quantity zeroInch = Quantity.createInch(0);

        assertEquals(zeroFeet, zeroInch);
    }

    @Test
    void givenOneFootAndTwelveInch_whenCheckEquals_thenShouldBeEqual() {
        Quantity oneFoot = Quantity.createFeet(1);
        Quantity twelveInch = Quantity.createInch(12);

        assertEquals(oneFoot, twelveInch);
    }

    @Test
    void givenTwoFeetAndTwentyFourInches_whenCheckEquals_thenShouldBeEqual() {
        Quantity twoFeet = Quantity.createFeet(2);
        Quantity twentyFourInch = Quantity.createInch(24);

        assertEquals(twoFeet, twentyFourInch);
    }

    @Test
    void givenZeroYard_whenCheckEquals_thenTheyShouldBeEqual() {
        Quantity zeroYard = Quantity.createYard(0);
        Quantity anotherZeroYard = Quantity.createYard(0);

        assertEquals(zeroYard, anotherZeroYard);
    }

    @Test
    void givenZeroAndOneYard_whenCheckEquals_thenTheyShouldNotBeEqual() {
        Quantity zeroYard = Quantity.createYard(0);
        Quantity oneYard = Quantity.createYard(1);

        assertNotEquals(zeroYard, oneYard);
    }

    @Test
    void givenOneAndOneYard_whenCheckEquals_thenTheyShouldBeEqual() {
        Quantity oneYard = Quantity.createYard(1);
        Quantity anotherOneYard = Quantity.createYard(1);

        assertEquals(oneYard, anotherOneYard);
    }

    @Test
    void givenOneYardAndThirtySixInches_WhenCheckEquals_ThenTheyShouldBeEqual() {
        Quantity oneYard = Quantity.createYard(1);
        Quantity thirtySixInch = Quantity.createInch(36);

        assertEquals(thirtySixInch, oneYard);
    }

    @Test
    void givenOneYardAndThreeFeet_WhenCheckEquals_ThenTheyShouldBeEqual() {
        Quantity oneYard = Quantity.createYard(1);
        Quantity threeFeet = Quantity.createFeet(3);

        assertEquals(threeFeet, oneYard);
    }

    @Test
    void givenZeroInchAndZeroInch_whenAdd_ThenShouldBeZeroInch() throws Exception {
        Quantity zeroInch = Quantity.createInch(0);
        Quantity anotherZeroInch = Quantity.createInch(0);

        assertEquals(Quantity.createInch(0), zeroInch.add(anotherZeroInch));
    }

    @Test
    void givenOneInchAndOneInch_whenAdd_ThenShouldBeTwoInches() throws Exception {
        Quantity oneInch = Quantity.createInch(1);
        Quantity anotherOneInch = Quantity.createInch(1);

        assertEquals(Quantity.createInch(2), oneInch.add(anotherOneInch));
    }

    @Test
    void givenZeroInchAndTwoInch_whenAdd_ThenShouldBeFourInches() throws Exception {
        Quantity zeroInch = Quantity.createInch(2);
        Quantity oneInch = Quantity.createInch(2);

        assertEquals(Quantity.createInch(4), zeroInch.add(oneInch));
    }

    @Test
    void givenZeroInchAndZeroFeet_whenAdd_ThenShouldBeZeroInch() throws Exception {
        Quantity zeroFeet = Quantity.createFeet(0);
        Quantity zeroInch = Quantity.createInch(0);

        assertEquals(Quantity.createInch(0), zeroFeet.add(zeroInch));
    }

    @Test
    void givenZeroInchAndOneFeet_whenAdd_ThenShouldBeTwelveInches() throws Exception {
        Quantity oneFeet = Quantity.createFeet(1);
        Quantity zeroInch = Quantity.createInch(0);

        assertEquals(Quantity.createInch(12), oneFeet.add(zeroInch));
    }

    @Test
    void givenTwoInchAndOneFeet_whenAdd_ThenShouldBeFourteenInches() throws Exception {
        Quantity oneFeet = Quantity.createFeet(1);
        Quantity twoInches = Quantity.createInch(2);

        assertEquals(Quantity.createInch(14), oneFeet.add(twoInches));
    }

    @Test
    void givenZeroLitersAndZeroLiters_WhenCheckEquals_ThenShouldBeEqual() {
        Quantity zeroLiters = Quantity.createLiter(0);
        Quantity anotherZeroLiter = Quantity.createLiter(0);

        assertEquals(zeroLiters, anotherZeroLiter);
    }

    @Test
    void givenZeroGallonAndZeroGallon_WhenCheckEquals_ThenShouldBeEqual() {
        Quantity zeroGallon = Quantity.createGallon(0);
        Quantity anotherZeroGallon = Quantity.createGallon(0);

        assertEquals(zeroGallon, anotherZeroGallon);
    }

    @Test
    void givenZeroGallonAndZeroLiters_WhenCheckEquals_ThenShouldBeEqual() {
        Quantity zeroGallon = Quantity.createGallon(0);
        Quantity zeroLiter = Quantity.createLiter(0);

        assertEquals(zeroGallon, zeroLiter);
    }

    @Test
    void givenOneGallonAndZeroLiters_WhenCheckEquals_ThenShouldNotBeEqual() {
        Quantity oneGallon = Quantity.createGallon(1);
        Quantity zeroLiter = Quantity.createLiter(0);

        assertNotEquals(oneGallon, zeroLiter);
    }

    @Test
    void givenOneGallonAndThreePointSevenEightLiters_WhenCheckEquals_ThenShouldNotBeEqual() {
        Quantity oneGallon = Quantity.createGallon(1);
        Quantity threePointSevenEightLiter = Quantity.createLiter(3.78);

        assertEquals(oneGallon, threePointSevenEightLiter);
    }

    @Test
    void givenZeroGallonAndZeroLiters_WhenAdd_ThenShouldBeZeroLiters() throws Exception {
        Quantity zeroGallon = Quantity.createGallon(0);
        Quantity zeroLiter = Quantity.createLiter(0);

        assertEquals(Quantity.createLiter(0), zeroGallon.add(zeroLiter));
    }

    @Test
    void givenOneGallonAndOneFeet_whenCheckEquality_thenTheyShouldNotBeEqual() {
        Quantity oneGallon = Quantity.createGallon(1);
        Quantity oneFeet = Quantity.createFeet(1);

        assertNotEquals(oneGallon, oneFeet);
    }

    @Test
    void givenOneInchAndOneLiter_whenCheckEquality_thenTheyShouldNotBeEqual() {
        Quantity oneInch = Quantity.createInch(1);
        Quantity oneLiter = Quantity.createLiter(1);

        assertNotEquals(oneInch, oneLiter);
    }

    @Test
    void givenZeroInchAndZeroLiter_whenCheckEquality_thenTheyShouldNotBeEqual() {
        Quantity zeroInch = Quantity.createInch(0);
        Quantity zeroLiter = Quantity.createLiter(0);

        assertNotEquals(zeroInch, zeroLiter);
    }

    @Test
    void givenZeroInchAndZeroGallon_whenCheckEquality_thenTheyShouldNotBeEqual() {
        Quantity zeroInch = Quantity.createInch(0);
        Quantity zeroGallon = Quantity.createGallon(0);

        assertNotEquals(zeroInch, zeroGallon);
    }

    @Test
    void givenOneInchAndOneGallon_whenCheckEquality_thenTheyShouldNotBeEqual() {
        Quantity oneInch = Quantity.createInch(1);
        Quantity oneGallon = Quantity.createGallon(1);

        assertNotEquals(oneInch, oneGallon);
    }

    @Test
    void givenOneYardAndOneGallon_whenCheckEquality_thenTheyShouldNotBeEqual() {
        Quantity oneYard = Quantity.createYard(1);
        Quantity oneGallon = Quantity.createGallon(1);

        assertNotEquals(oneYard, oneGallon);
    }

    @Test
    void givenOneYardAndOneLiter_whenCheckEquality_thenTheyShouldNotBeEqual() {
        Quantity oneYard = Quantity.createYard(1);
        Quantity oneLiter = Quantity.createLiter(1);

        assertNotEquals(oneYard, oneLiter);
    }

    @Test
    void givenZeroYardAndZeroLiter_whenCheckEquality_thenTheyShouldNotBeEqual() {
        Quantity zeroYard = Quantity.createYard(0);
        Quantity zeroLiter = Quantity.createLiter(0);

        assertNotEquals(zeroYard, zeroLiter);
    }

    @Test
    void givenZeroGallonAndZeroFeet_whenAdd_thenTheyShouldThrowException() {
        Quantity zeroGallon = Quantity.createGallon(0);
        Quantity zeroFeet = Quantity.createFeet(0);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            zeroGallon.add(zeroFeet);
        });
        assertEquals("Gallon Cannot be added with Feet", exception.getMessage());
    }

    @Test
    void givenOneGallonAndOneFeet_whenAdd_thenTheyShouldThrowException() {
        Quantity oneGallon = Quantity.createGallon(1);
        Quantity oneFeet = Quantity.createFeet(1);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneFeet);
        });
        assertEquals("Gallon Cannot be added with Feet", exception.getMessage());

    }

    @Test
    void givenOneGallonAndOneInch_whenAdd_thenTheyShouldThrowException() {
        Quantity zeroGallon = Quantity.createGallon(1);
        Quantity oneInch = Quantity.createInch(1);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            zeroGallon.add(oneInch);
        });
        assertEquals("Gallon Cannot be added with Inch", exception.getMessage());
    }

    @Test
    void givenOneGallonAndOneYard_whenAdd_thenTheyShouldThrowException() {
        Quantity oneGallon = Quantity.createGallon(1);
        Quantity oneYard = Quantity.createYard(1);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneYard);
        });
        assertEquals("Gallon Cannot be added with Yard", exception.getMessage());
    }

    @Test
    void givenOneGallonAndOneLiters_WhenAdd_ThenShouldBeFourPointSevenEightLiters() throws Exception {
        Quantity oneGallon = Quantity.createGallon(1);
        Quantity fourPointSevenEightLiters = Quantity.createLiter(3.78);

        assertEquals(Quantity.createLiter(7.56), oneGallon.add(fourPointSevenEightLiters));
    }

    @Test
    void givenTwoGallonAndOneLiters_WhenAdd_ThenShouldBeFourPointSevenEightLiters() throws Exception {
        Quantity zeroGallon = Quantity.createGallon(2);
        Quantity fourPointSevenEightLiters = Quantity.createLiter(3.78);

        assertEquals(Quantity.createLiter(11.34), zeroGallon.add(fourPointSevenEightLiters));
    }

    @Test
    void givenZeroGramsAndZeroGrams_whenCheckEquals_thenTheyShouldBeEqual() {
        Quantity zeroGram = Quantity.createGrams(0);
        Quantity anotherZeroGram = Quantity.createGrams(0);

        assertEquals(zeroGram, anotherZeroGram);
    }

    @Test
    void givenZeroGramsAndOneGram_whenCheckEquals_thenTheyShouldBeNotEqual() {
        Quantity zeroGram = Quantity.createGrams(0);
        Quantity oneGram = Quantity.createGrams(1);

        assertNotEquals(zeroGram, oneGram);
    }

    @Test
    void givenZeroGramsAndZeroKiloGrams_whenCheckEquals_thenTheyShouldBeEqual() {
        Quantity zeroGram = Quantity.createGrams(0);
        Quantity zeroKG = Quantity.createKiloGrams(0);

        assertEquals(zeroGram, zeroKG);
    }

    @Test
    void givenThousandGramsAndOneKiloGrams_whenCheckEquals_thenTheyShouldBeEqual() {
        Quantity thousandGrams = Quantity.createGrams(1000);
        Quantity oneKG = Quantity.createKiloGrams(1);

        assertEquals(thousandGrams, oneKG);
    }

    @Test
    void givenZeroKiloGramsAndZeroKiloGrams_whenCheckEquals_thenTheyShouldBeEqual() {
        Quantity zeroKG = Quantity.createKiloGrams(0);
        Quantity anotherZeroKG = Quantity.createKiloGrams(0);

        assertEquals(zeroKG, anotherZeroKG);
    }

    @Test
    void givenZeroKiloGramsAndOneKiloGrams_whenCheckEquals_thenTheyShouldBeNotEqual() {
        Quantity zeroKG = Quantity.createKiloGrams(0);
        Quantity oneKG = Quantity.createKiloGrams(1);

        assertNotEquals(zeroKG, oneKG);
    }

    @Test
    void givenZeroGramsAndZeroGrams_whenAdd_thenShouldBeZeroGrams() throws Exception {
        Quantity zeroGram = Quantity.createGrams(0);
        Quantity anotherZeroGram = Quantity.createGrams(0);

        assertEquals(Quantity.createGrams(0.0), zeroGram.add(anotherZeroGram));
    }

    @Test
    void givenOneGramsAndOneGrams_whenAdd_thenShouldBeTwoGrams() throws Exception {
        Quantity oneGram = Quantity.createGrams(1);
        Quantity anotherOneGram = Quantity.createGrams(1);

        assertEquals(Quantity.createGrams(2.0), oneGram.add(anotherOneGram));
    }

    @Test
    void givenOneGramAndOneKiloGrams_whenAdd_thenShouldBeThousandAndOneGrams() throws Exception {
        Quantity oneGram = Quantity.createGrams(1);
        Quantity oneKG = Quantity.createKiloGrams(1);

        assertEquals(Quantity.createGrams(1001), oneGram.add(oneKG));
    }

    @Test
    void givenOneKiloGramAndOneKiloGrams_whenAdd_thenShouldBetwoThousandGrams() throws Exception {
        Quantity oneKG = Quantity.createKiloGrams(1);
        Quantity anotherOneKG = Quantity.createKiloGrams(1);

        assertEquals(Quantity.createGrams(2000), oneKG.add(anotherOneKG));
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

}
