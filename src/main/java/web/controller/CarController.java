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
    private CarService carService;

    CarController(CarService carService) {
        this.carService = carService;
    }



    @GetMapping(value = "/cars")
    public String carPage(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap modelMap) {
        modelMap.addAttribute("cars", carService.getSomeCars(count));
        return "cars";
    }

}
