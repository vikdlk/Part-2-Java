package _05Lambda;


import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierTest3 {
    public static ArrayList<Car> creatCar(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCar = creatCar(() -> new Car("Nissan", "red", 2.0));
        System.out.println("Our Car " + ourCar);

        changeCar(ourCar.get(0), car -> {
            car.color = "blue";
            car.engine = 3.0;
            System.out.println("upgraded car: " + car);
        });
    }

}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
