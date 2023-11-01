package tdd.animals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import tdd.Food;

import java.util.Date;

public class DogTest {

    @Test
    public void testSetName() {
        Dog dog = new Dog("Snoop Dogg", new Date(), 1);
        dog.setName("Kendrick");
        assertEquals("Kendrick", dog.getName());
    }

    @Test
    public void testSetBirthDate() {
        Dog dog = new Dog("Snoop Dogg", new Date(), 1);
        Date newBirthDate = new Date();
        dog.setBirthDate(newBirthDate);
        assertEquals(newBirthDate, dog.getBirthDate());
    }

    @Test
    public void testSpeak() {
        Dog dog = new Dog("Snoop Dogg", new Date(), 1);
        assertEquals("bark!", dog.speak());
    }

    @Test
    public void testEat() {
        Dog dog = new Dog("Snoop Dogg", new Date(), 1);
        Food food = new Food("Dog Food");
        dog.eat(food);
        assertEquals(1, dog.getNumberOfMealsEaten());
    }

    @Test
    public void testGetId() {
        Dog dog = new Dog("Snoop Dogg", new Date(), 1);
        assertEquals(1, dog.getId());
    }

    @Test
    public void testAnimalInheritance() {
        Dog dog = new Dog("Snoop Dogg", new Date(), 1);
        assertTrue(dog instanceof Animal);
    }

    @Test
    public void testMammalInheritance() {
        Dog dog = new Dog("Snoop Dogg", new Date(), 1);
        assertTrue(dog instanceof Mammal);
    }
}
