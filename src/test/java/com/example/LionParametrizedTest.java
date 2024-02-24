package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {

    @Mock
    Feline feline;
    private final boolean hasMane;
    private final String sex;



    public LionParametrizedTest(boolean hasMane, String sex) {
        this.hasMane = hasMane;
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] assertSexAndMane() {
        return new Object[][]{
                {true, "Самец"},
                {false, "Самка"},
        };
    }

    @Test
    public void checkMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals("Грива есть?",hasMane,lion.doesHaveMane());
    }

}
