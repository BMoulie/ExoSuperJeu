package org.humanbooster.model;

public class Human extends Humanoid {

    private int mana;

    public Human(String name, int x, int y, int maxHealth, int health, double resistance, int mana) {
        super(name, x, y, maxHealth, health, resistance);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + getName() + '\'' +
                ", health=" + health +
                ", resistance=" + resistance +
                ", mana=" + mana +
                ", animals=" + animals +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
