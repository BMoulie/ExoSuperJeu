package org.humanbooster.model;

public abstract class Animal extends Being {

    public Animal(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y, maxHealth, health, resistance);
    }
}
