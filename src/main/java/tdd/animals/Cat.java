package tdd.animals;

import tdd.Food;

import java.util.Date;


public class Cat extends Mammal {
    private int numberOfMealsEaten;

    public Cat(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
        this.numberOfMealsEaten = 0;
    }


    public String speak() {
        return "meow!";
    }

    @Override
    public void eat(Food food) {
        this.numberOfMealsEaten++;
    }

}