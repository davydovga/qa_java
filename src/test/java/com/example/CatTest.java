package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Feline feline = mock(Feline.class);
    Cat cat = new Cat(feline);

    @Test
    public void getSoundTest(){
        assertEquals("Мяу", cat.getSound());
    }
    @Test
    public void getFoodTest() throws Exception {
        List<String> foodList = List.of("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(foodList);
        assertEquals(foodList, cat.getFood());
    }
}