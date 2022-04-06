package org.humanbooster.model;

public class Eagle extends Animal {

    private int vision;

    public Eagle(String name, int x, int y, int maxHealth, int health, double resistance, int vision) {
        super(name, x, y, maxHealth, health, resistance);
        this.vision = vision;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + getName() + '\'' +
                ", health=" + health +
                ", resistance=" + resistance +
                ", vision=" + vision +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
