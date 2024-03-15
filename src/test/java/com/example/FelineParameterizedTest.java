package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    //Параметризированный тест на количество котят

    //Переменная для конструктора с количеством котят
    private final int kittensCount;
    //Переменная для конструктора с ожидаемым количеством котят
    private final int expectedKittensCount;


    //Конструктор параметризацииц
    public FelineParameterizedTest(int kittensCount, int expectedKittensCount) {
        this.kittensCount = kittensCount;
        this.expectedKittensCount = expectedKittensCount;
    }
    //Параметры теста
    @Parameterized.Parameters
    public static Object[][] assertKittensCount() {
        return new Object[][]{
                {1, 1},
                {4, 4},
                {11, 11}
        };
    }


    @Test
    public void getKittensWithParamsTest() {
        Feline feline = new Feline();
        assertEquals("Количество котят не совпадает с указанным в expectedKittensCount", expectedKittensCount, feline.getKittens(kittensCount));
    }
}
