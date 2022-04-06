package org.humanbooster.model;

public class Rock extends SpecialElement {

    public Rock(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public String toString() {
        return "Rock{" +
                "name='" + getName() + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
