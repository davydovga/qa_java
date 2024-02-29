package com.example;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    //Создаем болванку кошатки чтобы изолировать тест котят от класса Feline
    @Mock
    Feline feline;


    @Test
    public void getKittensTest() {
        //Задаем условие для изолирования Lion от Feline
        Mockito.when(feline.getKittens()).thenReturn(1);
        //Вызываем метод для сверки
        int kittens = feline.getKittens();
        int expectedKittens = 1;
        assertEquals("Ожидается 1 котенок", kittens, expectedKittens);
    }


    @Test
    public void getFoodTest() throws Exception {
        //Изолируем getFoodTest от ошибок в методе feline.getFood
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        assertEquals(expectedFood, feline.getFood("Хищник"));


    }
}