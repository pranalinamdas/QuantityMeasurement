package com.bridgelabz.quantity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

    @Nested
    static class FeetTest {
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
        void givenOneAndOneFeet_WhenCheckEquals_ThenShouldBeEqual() {
            Quantity one = Quantity.createFeet(1);
            Quantity anotherOne = Quantity.createFeet(1);

            assertEquals(one, anotherOne);
        }

        @Test
        void givenZeroAndNull_WhenCheckEquals_ThenShouldNotBeEqual() {
            Quantity zero = Quantity.createFeet(0);

            assertNotEquals(null, zero);
        }
    }

    @Nested
    static class InchTest {
        @Test
        void givenZeroInch_whenCheckEquals_thenShouldBeEqual() {
            Quantity zero = Quantity.createInch(0);
            Quantity anotherZero = Quantity.createInch(0);

            assertEquals(zero, anotherZero);
        }

        @Test
        void givenZeroAndOneInch_whenCheckEquals_thenShouldNotBeEqual() {
            Quantity zero = Quantity.createInch(0);
            Quantity one = Quantity.createInch(1);

            assertNotEquals(zero, one);
        }

        @Test
        void givenOneAndOneFeet_WhenCheckEquals_ThenShouldNotBeEqual() {
            Quantity one = Quantity.createInch(1);
            Quantity anotherOne = Quantity.createInch(1);

            assertEquals(one, anotherOne);
        }

        @Test
        void givenZeroAndNull_whenCheckEquals_thenShouldNotBeEqual() {
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

        assertEquals(new Quantity(0, Unit.inch), zeroInch.add(anotherZeroInch));
    }

    @Test
    void givenOneInchAndOneInch_whenAdd_ThenShouldBeTwoInches() throws Exception {
        Quantity oneInch = new Quantity(1, Unit.inch);
        Quantity anotherOneInch = new Quantity(1, Unit.inch);

        assertEquals(new Quantity(2.0, Unit.inch), oneInch.add(anotherOneInch));
    }

    @Test
    void givenZeroInchAndTwoInch_whenAdd_ThenShouldBeFourInches() throws Exception {
        Quantity zeroInch = new Quantity(2, Unit.inch);
        Quantity oneInch = new Quantity(2, Unit.inch);

        assertEquals(new Quantity(4.0, Unit.inch), zeroInch.add(oneInch));
    }

    @Test
    void givenZeroInchAndZeroFeet_whenAdd_ThenShouldBeZeroInch() throws Exception {
        Quantity zeroFeet = new Quantity(0, Unit.feet);
        Quantity zeroInch = new Quantity(0, Unit.inch);

        assertEquals(new Quantity(0, Unit.inch), zeroFeet.add(zeroInch));
    }

    @Test
    void givenZeroInchAndOneFeet_whenAdd_ThenShouldBeTwelveInches() throws Exception {
        Quantity oneFeet = new Quantity(1, Unit.feet);
        Quantity zeroInch = new Quantity(0, Unit.inch);

        assertEquals(new Quantity(12.0, Unit.inch), oneFeet.add(zeroInch));
    }

    @Test
    void givenTwoInchAndOneFeet_whenAdd_ThenShouldBeFourteenInches() throws Exception {
        Quantity oneFeet = new Quantity(1, Unit.feet);
        Quantity twoInches = new Quantity(2, Unit.inch);

        assertEquals(new Quantity(14.0, Unit.inch), oneFeet.add(twoInches));
    }

    @Test
    void givenZeroLitersAndZeroLiters_WhenCheckEquals_ThenShouldBeEqual() {
        Quantity zeroLiters = new Quantity(0.0, Unit.liters);
        Quantity anotherZeroLiter = new Quantity(0.0, Unit.liters);

        assertEquals(zeroLiters, anotherZeroLiter);
    }

    @Test
    void givenZeroGallonAndZeroGallon_WhenCheckEquals_ThenShouldBeEqual() {
        Quantity zeroGallon = new Quantity(0.0, Unit.gallon);
        Quantity anotherZeroGallon = new Quantity(0.0, Unit.gallon);

        assertEquals(zeroGallon, anotherZeroGallon);
    }

    @Test
    void givenZeroGallonAndZeroLiters_WhenCheckEquals_ThenShouldBeEqual() {
        Quantity zeroGallon = new Quantity(0.0, Unit.gallon);
        Quantity zeroLiter = new Quantity(0.0, Unit.liters);

        assertEquals(zeroGallon, zeroLiter);
    }

    @Test
    void givenOneGallonAndZeroLiters_WhenCheckEquals_ThenShouldNotBeEqual() {
        Quantity oneGallon = new Quantity(1.0, Unit.gallon);
        Quantity zeroLiter = new Quantity(0.0, Unit.liters);

        assertNotEquals(oneGallon, zeroLiter);
    }

    @Test
    void givenOneGallonAndThreePointSevenEightLiters_WhenCheckEquals_ThenShouldNotBeEqual() {
        Quantity oneGallon = new Quantity(1.0, Unit.gallon);
        Quantity threePointSevenEightLiter = new Quantity(3.78, Unit.liters);

        assertEquals(oneGallon, threePointSevenEightLiter);
    }

    @Test
    void givenZeroGallonAndZeroLiters_WhenAdd_ThenShouldBeZeroLiters() throws Exception {
        Quantity zeroGallon = new Quantity(0.0, Unit.gallon);
        Quantity zeroLiter = new Quantity(0.0, Unit.liters);

        assertEquals(new Quantity(0, Unit.liters), zeroGallon.add(zeroLiter));
    }

    @Test
    void givenOneGallonAndOneFeet_whenCheckEquality_thenTheyShouldNotBeEqual() {
        Quantity oneGallon = new Quantity(1.0, Unit.gallon);
        Quantity oneFeet = new Quantity(1.0, Unit.feet);

        assertNotEquals(oneGallon, oneFeet);
    }

    @Test
    void givenOneInchAndOneLiter_whenCheckEquality_thenTheyShouldNotBeEqual() {
        Quantity oneInch = new Quantity(1.0, Unit.inch);
        Quantity oneLiter = new Quantity(1.0, Unit.liters);

        assertNotEquals(oneInch, oneLiter);
    }

    @Test
    void givenZeroInchAndZeroLiter_whenCheckEquality_thenTheyShouldNotBeEqual() {
        Quantity zeroInch = new Quantity(0.0, Unit.inch);
        Quantity zeroLiter = new Quantity(0.0, Unit.liters);

        assertNotEquals(zeroInch, zeroLiter);
    }

    @Test
    void givenZeroInchAndZeroGallon_whenCheckEquality_thenTheyShouldNotBeEqual() {
        Quantity zeroInch = new Quantity(0.0, Unit.inch);
        Quantity zeroGallon = new Quantity(0.0, Unit.gallon);

        assertNotEquals(zeroInch, zeroGallon);
    }

    @Test
    void givenOneInchAndOneGallon_whenCheckEquality_thenTheyShouldNotBeEqual() {
        Quantity oneInch = new Quantity(1.0, Unit.inch);
        Quantity oneGallon = new Quantity(1.0, Unit.gallon);

        assertNotEquals(oneInch, oneGallon);
    }

    @Test
    void givenOneYardAndOneGallon_whenCheckEquality_thenTheyShouldNotBeEqual() {
        Quantity oneYard = new Quantity(1.0, Unit.yard);
        Quantity oneGallon = new Quantity(1.0, Unit.gallon);

        assertNotEquals(oneYard, oneGallon);
    }

    @Test
    void givenOneYardAndOneLiter_whenCheckEquality_thenTheyShouldNotBeEqual() {
        Quantity oneYard = new Quantity(1.0, Unit.yard);
        Quantity oneLiter = new Quantity(1.0, Unit.liters);

        assertNotEquals(oneYard, oneLiter);
    }

    @Test
    void givenZeroYardAndZeroLiter_whenCheckEquality_thenTheyShouldNotBeEqual() {
        Quantity zeroYard = new Quantity(0.0, Unit.yard);
        Quantity zeroLiter = new Quantity(0.0, Unit.liters);

        assertNotEquals(zeroYard, zeroLiter);
    }

    @Test
    void givenZeroGallonAndZeroFeet_whenAdd_thenTheyShouldThrowException() {
        Quantity zeroGallon = new Quantity(0.0, Unit.gallon);
        Quantity zeroFeet = new Quantity(0.0, Unit.feet);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            zeroGallon.add(zeroFeet);
        });
        assertEquals("gallon Cannot be added with feet", exception.getMessage());
    }

    @Test
    void givenOneGallonAndOneFeet_whenAdd_thenTheyShouldThrowException() {
        Quantity oneGallon = new Quantity(1.0, Unit.gallon);
        Quantity oneFeet = new Quantity(1.0, Unit.feet);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneFeet);
        });
        assertEquals("gallon Cannot be added with feet", exception.getMessage());

    }

    @Test
    void givenOneGallonAndOneInch_whenAdd_thenTheyShouldThrowException() {
        Quantity zeroGallon = new Quantity(1.0, Unit.gallon);
        Quantity oneInch = new Quantity(1.0, Unit.inch);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            zeroGallon.add(oneInch);
        });
        assertEquals("gallon Cannot be added with inch", exception.getMessage());
    }

    @Test
    void givenOneGallonAndOneYard_whenAdd_thenTheyShouldThrowException() {
        Quantity oneGallon = new Quantity(1.0, Unit.gallon);
        Quantity oneYard = new Quantity(1.0, Unit.yard);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneYard);
        });
        assertEquals("gallon Cannot be added with yard", exception.getMessage());
    }

    @Test
    void givenOneGallonAndOneLiters_WhenAdd_ThenShouldBeFourPointSevenEightLiters() throws Exception {
        Quantity oneGallon = new Quantity(1.0, Unit.gallon);
        Quantity fourPointSevenEightLiters = new Quantity(3.78, Unit.liters);

        assertEquals(new Quantity(7.56, Unit.liters), oneGallon.add(fourPointSevenEightLiters));
    }

    @Test
    void givenTwoGallonAndOneLiters_WhenAdd_ThenShouldBeFourPointSevenEightLiters() throws Exception {
        Quantity zeroGallon = new Quantity(2.0, Unit.gallon);
        Quantity fourPointSevenEightLiters = new Quantity(3.78, Unit.liters);

        assertEquals(new Quantity(11.34, Unit.liters), zeroGallon.add(fourPointSevenEightLiters));
    }
}
