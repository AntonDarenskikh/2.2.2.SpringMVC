package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model;
    private int year;
    private int cost;

    public Car() {
    }

    public Car(String model, int year, int cost) {
        this.model = model;
        this.year = year;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
