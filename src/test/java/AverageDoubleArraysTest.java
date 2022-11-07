import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleArraysTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        double aa[] ={4.6,8.3,5.9};
        int expected = 3;
       AverageDoubleArrays ag = new AverageDoubleArrays();
        assertEquals(expected,ag.count(aa));
    }

    @Test
    void sum() {
        double aa[] = {5.6,6.8,7.8};
        int expected = 20;
        AverageDoubleArrays ag = new AverageDoubleArrays();
        assertEquals(expected,ag.sum(aa));
    }

    @Test
    void average() {
        double aa[] = {5.6,6.8,7.8};
        int expected = 6;
        AverageDoubleArrays ag = new AverageDoubleArrays();
        assertEquals(expected,ag.average(aa));
    }
}