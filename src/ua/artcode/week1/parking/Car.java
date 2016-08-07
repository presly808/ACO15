package ua.artcode.week1.parking;

/**
 * Created by serhii on 07.08.16.
 */
public class Car {

    private String number;
    private String model;
    private Driver driver;

    public void init(String number, String model, Driver driver){
        this.number = number;
        this.model = model;
        this.driver = driver;
    }

    public String asString(){
        return String.format("number : %s, model %s, driver %s",
                number,model,driver.asString());
    }

}
