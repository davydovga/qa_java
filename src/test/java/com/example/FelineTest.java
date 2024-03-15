package com.example;

import org.junit.Test;


import java.util.List;

import static org.junit.Assert.*;


public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception {
        assertEquals("Семейство кошачих должно питаться мясом и рыбой", List.of("Животные", "Птицы", "Рыба"),feline.eatMeat());

    }

    @Test
    public void getFamilyTest() {
        assertEquals("Ожидается что метод вернет \"Кошачьи\"","Кошачьи", feline.getFamily());

    }

    @Test
    public void getKittensTest() {
        assertEquals("Ожидается только один котенок",1 ,feline.getKittens());
    }
}