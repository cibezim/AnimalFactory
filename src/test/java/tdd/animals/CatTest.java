package tdd.animals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import tdd.Food;
import java.util.Date;

public class CatTest {

    @Test
    public void testSetName() {
        Cat cat = new Cat("Tom", new Date(), 1);
        cat.setName("Henry");
        assertEquals("Henry", cat.getName());
    }

    @Test
    public void testSetBirthDate() {
        Cat cat = new Cat("Tom", new Date(), 1);
        Date newBirthDate = new Date();
        cat.setBirthDate(newBirthDate);
        assertEquals(newBirthDate, cat.getBirthDate());
    }

    @Test
    public void testSpeak() {
        Cat cat = new Cat("Tom", new Date(), 1);
        assertEquals("meow!", cat.speak());
    }

    @Test
    public void testEat() {
        Cat cat = new Cat("Tom", new Date(), 1);
        Food food = new Food("Fish");
        cat.eat(food);
        assertEquals(1, cat.getNumberOfMealsEaten());
    }


    @Test
    public void testGetId() {
        Cat cat = new Cat("Tom", new Date(), 1);
        assertEquals(1, cat.getId());
    }

    @Test
    public void testAnimalInheritance() {
        Cat cat = new Cat("Tom", new Date(), 1);
        assertTrue(cat instanceof Animal);
    }

    @Test
    public void testMammalInheritance() {
        Cat cat = new Cat("Tom", new Date(), 1);
        assertTrue(cat instanceof Mammal);
    }
}
