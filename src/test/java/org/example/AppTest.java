package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private Chocolate chocolate;
    private OtherSweets otherSweets;
    private Sweets sweets;
    private Student student;

    @BeforeEach
    void setUp() {
        chocolate = new Chocolate();
        chocolate.setCname("DairyMilk");
        chocolate.setWeight(100);

        otherSweets = new OtherSweets();
        otherSweets.setName("Ladoo");
        otherSweets.setWeight(200);

        sweets = new Chocolate();
        sweets.setChocolate(chocolate);
        sweets.setOtherSweets(otherSweets);

        student = new Student();
        student.setName("Abhishek");
        student.setSweets(sweets);
    }

    @Test
    void chocolateGetCnameReturnsSetValue() {
        assertEquals("DairyMilk", chocolate.getCname());
    }

    @Test
    void chocolateGetWeightReturnsSetValue() {
        assertEquals(100, chocolate.getWeight());
    }

    @Test
    void otherSweetsGetNameReturnsSetValue() {
        assertEquals("Ladoo", otherSweets.getName());
    }

    @Test
    void otherSweetsGetWeightReturnsSetValue() {
        assertEquals(200, otherSweets.getWeight());
    }

    @Test
    void studentGetNameReturnsSetValue() {
        assertEquals("Abhishek", student.getName());
    }

    @Test
    void studentGetCWReturnsSumOfWeights() {
        assertEquals(300, student.getCW());
    }

    @Test
    void studentGetSweetsReturnsSetSweets() {
        assertSame(sweets, student.getSweets());
    }

    @Test
    void sweetsGetChocolateReturnsSetChocolate() {
        assertSame(chocolate, sweets.getChocolate());
    }

    @Test
    void sweetsGetOtherSweetsReturnsSetOtherSweets() {
        assertSame(otherSweets, sweets.getOtherSweets());
    }
}
