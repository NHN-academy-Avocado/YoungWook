package SubExersize;

import java.io.BufferedReader;
import java.io.IOException;

public class Car {


    private String Model;
    private int Productyear;
    private int Distance = 0;
    private double Price;

    public Car(String model, int productyear, int distance, double price) {
        Model = model;
        Productyear = productyear;
        Distance = distance;
        Price = price;

    }

    public String getModel() {
        return Model;
    }

    public int getProductyear() {
        return Productyear;
    }

    public int getDistance() {
        return Distance;
    }

    public double getPrice() {
        return Price;
    }

    @Override
    public String toString() {
        return "Car info: \n" + "Model: " + Model + "\n ProductYear: " + Productyear +
                "\n Distance:" + Distance + "Km\n Price: " + Price;
    }

    public boolean equalTo(Car c) {
        if (c.toString() == toString()) {
            return true;
        }
        return false;
    }

    public static Car read(BufferedReader br) throws IOException {
        String s = br.readLine();
        if (s == null) {
            return null;
        } else {
            return new Car(s, Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()),
                    Double.parseDouble(br.readLine()));
        }
    }
}
