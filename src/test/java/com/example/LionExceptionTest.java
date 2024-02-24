package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {


    @Mock
    Feline feline;

    @Test
    public void checkExceptionText(){
        try {
            new Lion("Clown",feline);
        } catch (Exception exception){
            assertEquals("Текст ошибки не совпадает","Используйте допустимые значения пола животного - самец или самка",exception.getMessage());
        }
    }

}
