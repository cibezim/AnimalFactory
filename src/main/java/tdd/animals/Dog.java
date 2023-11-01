package tdd.animals;

import tdd.Food;

import java.util.Date;


public class Dog extends Mammal {
    public Dog(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public String speak() {
        return "bark!";
    }

    @Override
    public void eat(Food food) {

    }
}