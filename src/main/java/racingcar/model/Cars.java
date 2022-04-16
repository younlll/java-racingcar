package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars = new ArrayList<>();

    public Cars(MovingStrategy movingStrategy, String[] names) {
        for (String name : names) {
            cars.add(new Car(movingStrategy, name));
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public void runRace() {
        for (Car car : cars) {
            car.move();
        }
    }
}
