package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private static List<Car> cars = new ArrayList<>();

    private CarService carService;

    CarController(CarService carService) {
        this.carService = carService;
    }

    static {
        cars.add(new Car("Reno", 2010, 100000));
        cars.add(new Car("BWM", 2007, 5000000));
        cars.add(new Car("4x4", 2020, 2000000));
        cars.add(new Car("Nissan", 2022, 1500000));
        cars.add(new Car("Mercedes", 2019, 8000000));
    }

    @GetMapping(value = "/cars")
    public String carPage(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap modelMap) {
        modelMap.addAttribute("cars", carService.getSomeCars(cars, count));
        return "cars";
    }

}
