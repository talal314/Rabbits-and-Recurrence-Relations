package com.rabbits.fibonacci;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Unit test for simple App.
 */
public class RabbitsFibonacciTest
{
    /**
     * We assume that every pair of adult rabbits bring two pairs of rabbits
     */
    RabbitsFibonacci rabbitsFibonacci;
    @BeforeEach
    public void always_one_pair_at_first(){
        rabbitsFibonacci=new RabbitsFibonacci();}

    @Test
    public void should_be_onePair_for_one_month()
    {
        int result = rabbitsFibonacci.PairsOfRabbits(1,2);
        int expectedValue=1;
        assertEquals(expectedValue, result);

    }

    @Test
    public void should_be_onePair_for_two_months()
    {
        int result = rabbitsFibonacci.PairsOfRabbits(2,2);
        int expectedValue=1;
        assertEquals(expectedValue, result);
    }

    @Test
    public void should_be_ThreePairs_for_three_months()
    {
        int result = rabbitsFibonacci.PairsOfRabbits(3,2);
        int expectedValue=3;
        assertEquals(expectedValue, result);
    }
    //In this case we assume that every pair of adults rabbits produce 3 pairs of rabbits
    @Test
    public void should_be_nineteenPairs_for_five_months()
    {
        int result = rabbitsFibonacci.PairsOfRabbits(5,3);
        int expectedValue=19;
        assertEquals(expectedValue, result);
    }
}
