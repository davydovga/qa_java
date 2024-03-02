package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final Feline feline = mock(Feline.class);
    private final Lion lion;

    public LionTest() throws Exception {
        this.lion = new Lion("Самец", feline);
    }

    @Test
    public void checkGetKittens() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals("Должен быть только один котенок", 1, lion.getKittens());
    }
    @Test
    public void checkGetFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        assertEquals("Кошачьи едят: Животные, Птицы, Рыба",
                expectedFood,
                lion.getFood());
    }
}