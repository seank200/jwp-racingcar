package racingcar.model;

import java.util.Objects;

public class Car {

    private final CarName name;

    private int position = 0;

    public Car(CarName name) {
        this.name = name;
    }

    public void move() {
        position++;
    }

    public CarName getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position == car.position && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
