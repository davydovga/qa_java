package com.example;


import org.junit.Before;
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
    Lion lion;

    @Before
    public void getLionMocked() throws Exception {
        this.lion = new Lion("Самец", feline);
    }






    @Test
    public void getKittensTest() {
        //Задаем условие для изолирования Lion от Feline
        Mockito.when(feline.getKittens()).thenReturn(1);
        //Вызываем метод для сверки
        int kittens = lion.getKittens();
        int expectedKittens = 1;
        assertEquals("Ожидается 1 котенок", kittens, expectedKittens);
    }


    @Test
    public void getFoodTest() throws Exception {
        //Изолируем getFoodTest от ошибок в методе feline.getFood
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expectedFood, lion.getFood());


    }
}