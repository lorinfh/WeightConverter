package com.example.weightconverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeightConverterTest {
    WeightConverter wc = new WeightConverter();
    @Test
    void ouncetogramTest(){
        //Arrange
        double ounce = 1;
        double expected = 28.35;
        //Act
        double result = wc.ounceToGram(ounce);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void stonetokilogramTest(){
        //Arrange
        double stone = 1;
        double expected = 6.35;
        //Act
        double result = wc.stoneToKilogram(stone);
        //Assert
        assertEquals(expected, result);
    }
}
