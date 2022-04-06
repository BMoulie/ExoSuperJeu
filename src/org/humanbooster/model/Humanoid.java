package org.humanbooster.model;

import java.util.ArrayList;

public abstract class Humanoid extends Being {

    protected ArrayList<Animal> animals = new ArrayList<>();
    protected ArrayList<House> houses = new ArrayList<>();

    public void addAnimal(Animal a) {
        this.animals.add(a);
    }

    public void addHouse(House h) {
        this.houses.add(h);
    }

    public Humanoid(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y, maxHealth, health, resistance);
    }
}
