package org.humanbooster.model;

public class Orc extends Humanoid {

    private int rage;

    public Orc(String name, int x, int y, int maxHealth, int health, double resistance, int rage) {
        super(name, x, y, maxHealth, health, resistance);
        this.rage = rage;
    }

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }

    @Override
    public String toString() {
        return "Orc{" +
                "name='" + getName() + '\'' +
                " ,health=" + health +
                ", resistance=" + resistance +
                ", animals=" + animals +
                ", rage=" + rage +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
