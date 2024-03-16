package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public interface CarService {
    public List<Car> getSomeCars(List<Car> cars, int count);
}
