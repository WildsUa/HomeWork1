package org.example;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

import javax.management.ConstructorParameters;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    Main main;
    @BeforeEach
    void setUp() {
        main = new Main();
    }

  @Test
    void testArrayMax() {
        double[] array = {1,2,5,8,1};
        assertThat(main.arrayMax(array)).isEqualTo(3);
    }

    @Test
    void testArrayMin() {
        double[] array = {1,2,5,8,1};
        assertThat(main.arrayMin(array)).isEqualTo(0);
    }

    @Test
    void testArraySum() {
        double[] array = {1,2,5,8,1};
        assertThat(main.arraySum(array)).isCloseTo(17.0, Percentage.withPercentage(0.001));
    }

    @Test
    void testArrayAverage() {
        double[] array = {1,2,5,8,1};
        assertThat(main.arrayAverage(array)).isCloseTo(3.4,Percentage.withPercentage(0.001));
    }

    @Test
    void testLengthOfArray() {
        assertThat(main.lengthOfArray(0.0,2,0.001)).isEqualTo(2001);
    }

    @Test
    void testGenerateArray() {
        double[] array = main.generateArray(0.0,0.016,0.002);
        assertThat(array[8]).isCloseTo(0.016,Percentage.withPercentage(0.001));
    }

    @Test
    void calculateArray() {
    }

    @Test
    void testCalculateFunction() {
        assertThat(main.calculateFunction(1.4)).isCloseTo(3.65,Percentage.withPercentage(0.1));
    }

}