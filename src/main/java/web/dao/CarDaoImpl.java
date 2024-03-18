package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Reno", 2010, 100000));
        cars.add(new Car("BWM", 2007, 5000000));
        cars.add(new Car("4x4", 2020, 2000000));
        cars.add(new Car("Nissan", 2022, 1500000));
        cars.add(new Car("Mercedes", 2019, 8000000));
    }

    public List<Car> getSomeCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
