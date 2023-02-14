package pl.javastart.euler2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Euler2Test {

    private Euler2 euler2 = new Euler2();

    @Test
    void shouldReturn798ForLimit400() {
        //when
        int result = euler2.calculate(400);
        //then
        assertEquals(result, 798);

    }

    @Test
    void shouldReturn798ForLimit700() {
        //when
        int result = euler2.calculate(700);
        //then
        assertEquals(result, 798);
    }

    @Test
    void shouldReturn1089154ForLimit896547() {
        //when
        int result = euler2.calculate(896547);
        //then
        assertEquals(result, 1089154);
    }

    @Test
    void shouldReturn1089154ForLimit896847() {
        //when
        int result = euler2.calculate(896847);
        //then
        assertEquals(result, 1089154);
    }
}