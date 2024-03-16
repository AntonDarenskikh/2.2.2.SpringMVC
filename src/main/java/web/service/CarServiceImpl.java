package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getSomeCars(List<Car> cars, int count) {
        return cars.stream().limit(count).toList();
    }
}
