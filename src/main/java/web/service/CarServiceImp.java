package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    private final List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car("Volvo", 23, 333.33));
        carList.add(new Car("Mercedes", 44, 874.33));
        carList.add(new Car("BMW", 1, 77.1));
        carList.add(new Car("Lada", 31, 42.1));
        carList.add(new Car("Lamborghini", 14, 1.1));
    }

    @Override
    public List<Car> getCars(Integer amount) {
        if (amount == null) {
            amount = carList.size();
        }

        List<Car> resultList = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            if (i == carList.size()) {
                break;
            }
            resultList.add(carList.get(i));
        }

        return resultList;
    }
}
