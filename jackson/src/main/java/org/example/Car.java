package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class Car {

    private String color;
    private String type;

    public Car() {
    }

    public Car(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public static void main( String[] args ) {

        try {

            // 1. Create a Car object and serialise it to a json string
            ObjectMapper objectMapper = new ObjectMapper();
            Car myRenault = new Car("yellow", "renault");

            String carAsJson = objectMapper.writeValueAsString(myRenault);
            System.out.println(carAsJson);

            // 2. Convert a json string into a Car object
            Car myBMW = objectMapper.readValue(Car.class.getClassLoader().getResource("car.json"), Car.class);
            System.out.println(myBMW.getColor() + " " + myBMW.getType());

            // 3. Convert an array of json strings into an array of cars
            List<Car> cars = objectMapper.readValue(Car.class.getClassLoader().getResource("cars.json"),
                    new TypeReference<List<Car>>(){});
            for (Car car:cars) {
                System.out.println(car.getColor() + " " + car.getType());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
